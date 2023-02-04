package org.example.tutorial.polymorfism.inheritence.truck;

import lombok.experimental.SuperBuilder;
import org.example.tutorial.polymorfism.inheritence.common.MotorisedVehicle;
@SuperBuilder
public class Lorry extends MotorisedVehicle {
    private final Integer nbrOfAxels;
    private final Integer lengthInMeter;

    @Override
    public String toString() {
        return "Lorry{" +
                "nbrOfAxels=" + nbrOfAxels +
                ", lengthInMeter=" + lengthInMeter +
                "} " + super.toString();
    }
}
