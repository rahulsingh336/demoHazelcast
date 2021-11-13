package com.example.demoHazelcast.service;

import com.example.demoHazelcast.dao.CarRepository;
import com.example.demoHazelcast.model.Car;
import lombok.AllArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CarService {

    private CarRepository carRepository;

    @Cacheable(value="carCache", key="'carCacheList'")
    public List<Car> getCars() {
        return carRepository.getAll();
    }
}
