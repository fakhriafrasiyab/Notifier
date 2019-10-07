package com.example.demo.model.dto;

import java.time.LocalDate;

public class CityDTO {
    private int id;
    private String cityName;
    private LocalDate dateTime;
    private int degree;

    public CityDTO(int id, String cityName, LocalDate dateTime, int degree) {
        this.id = id;
        this.cityName = cityName;
        this.dateTime = dateTime;
        this.degree = degree;
    }

    public CityDTO() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public LocalDate getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDate dateTime) {
        this.dateTime = dateTime;
    }

    public int getDegree() {
        return degree;
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }
}
