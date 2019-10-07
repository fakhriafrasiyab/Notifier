package com.example.demo.mapper;

import com.example.demo.model.CityEntity;
import com.example.demo.model.dto.CityDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CityMapper {
    CityMapper INSTANCE = Mappers.getMapper(CityMapper.class);

    CityDTO toCityDTO(CityEntity cityEntity);

    CityEntity toCityEntity(CityDTO cityDTO);
    List<CityDTO> toCityDtoList(List<CityEntity> cityEntityList);
}
