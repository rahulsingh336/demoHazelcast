package com.example.demoHazelcast.dao;

import com.example.demoHazelcast.model.Car;

import java.util.List;

public interface CarRepository {

    List<Car> getAll();
}
