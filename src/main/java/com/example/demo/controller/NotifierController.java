package com.example.demo.controller;

import com.example.demo.client.CityClient;
import com.example.demo.model.CityEntity;
import com.example.demo.service.NotifierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping(value = "/notifier")
public class NotifierController {

    private final CityClient cityClient;

    @Autowired
    NotifierService notifierService;

    public NotifierController(CityClient cityClient) {
        this.cityClient = cityClient;
    }

    @GetMapping(value = "/getByCity")
    public ResponseEntity<CityEntity> getStudentSearch(@RequestParam String location) throws IOException {
        CityEntity cityEntity = cityClient.getByCity(location);
        return new ResponseEntity<>(cityEntity, HttpStatus.OK);
    }
}
