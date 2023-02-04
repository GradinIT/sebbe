package org.example.tutorial.polymorfism.inheritence.bike;

import lombok.ToString;
import lombok.experimental.SuperBuilder;
import org.example.tutorial.polymorfism.inheritence.Vehicle;
@SuperBuilder
public class Bicycle extends Vehicle {
    private final Integer nbrOfGears;

    @Override
    public String toString() {
        return "Bicycle{" +
                "nbrOfGears=" + nbrOfGears +
                "} " + super.toString();
    }
}
