package com.example.demoHazelcast.dao;

import com.example.demoHazelcast.model.Car;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Slf4j
@Component
public class MockCarRepository implements CarRepository {

    static List<Car> carList = new ArrayList<>(2);

    static {
        Car c1 = Car.builder().id("1").name("Tata").build();
        Car c2 = Car.builder().id("2").name("VW").build();
        carList.addAll(Stream.of(c1, c2).collect(Collectors.toList()));
    }

    @Override
    public List<Car> getAll() {
        log.info("Dao Layer called");
        return carList;
    }
}
