package com.example.demo.service;

import com.example.demo.mapper.CityMapper;
import com.example.demo.model.CityEntity;
import com.example.demo.model.dto.CityDTO;
import com.example.demo.repository.CityRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotifierService {
    private final CityRepository cityRepository;

    public NotifierService(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    public List<CityDTO> getByCity(String location) {
        List<CityEntity> cityEntities = cityRepository.findByCityName(location);
        return CityMapper.INSTANCE.toCityDtoList(cityEntities);
    }
}
