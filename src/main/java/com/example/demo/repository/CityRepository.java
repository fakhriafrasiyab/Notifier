package com.example.demo.repository;

import com.example.demo.model.CityEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface CityRepository extends JpaRepository<CityEntity, LocalDate> {
    List<CityEntity> findByCityName(String location);

//    @Query("select city.created_at from city")
    CityEntity findByDateTime(LocalDate date);

}
