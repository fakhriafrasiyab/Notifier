package com.example.demo.client;

import com.example.demo.model.CityEntity;
import com.example.demo.model.dto.CityDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(url = "http://localhost:8080/city", name = "Weather-Info")
@Component
public interface CityClient {
    @GetMapping(value = "/getByCity")
    CityEntity getByCity(@RequestParam String location);
}
