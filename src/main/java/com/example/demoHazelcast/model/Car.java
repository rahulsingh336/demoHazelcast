package com.example.demoHazelcast.model;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class Car implements Serializable {

    private static final long serialVersionUID = -2985346675530882799L;

    String id;
    String name;
}
