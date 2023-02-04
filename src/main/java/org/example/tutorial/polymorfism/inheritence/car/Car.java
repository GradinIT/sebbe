package org.example.tutorial.polymorfism.inheritence.car;

import lombok.ToString;
import lombok.experimental.SuperBuilder;
import org.example.tutorial.polymorfism.inheritence.MotorisedVehicle;
@SuperBuilder
public class Car extends MotorisedVehicle {
    private final Integer nbrOfSeats;

    @Override
    public String toString() {
        return "Car{" +
                "nbrOfSeats=" + nbrOfSeats +
                "} " + super.toString();
    }
}
