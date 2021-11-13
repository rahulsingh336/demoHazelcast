package com.example.demoHazelcast.controller;

import com.example.demoHazelcast.model.Car;
import com.example.demoHazelcast.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarControlller {

    @Autowired
    private CarService carService;

    @GetMapping
    public List<Car> getAll() {
        return carService.getCars();
    }
}
