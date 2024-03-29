package org.example.tutorial.polymorfism.inheritence.common;

import lombok.ToString;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@ToString
public class MotorisedVehicle extends Vehicle{
    private final Integer horsePower;
    private final String  fuel;
}
