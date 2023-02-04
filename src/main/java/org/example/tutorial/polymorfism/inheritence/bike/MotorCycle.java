package org.example.tutorial.polymorfism.inheritence.bike;

import lombok.ToString;
import lombok.experimental.SuperBuilder;
import org.example.tutorial.polymorfism.inheritence.MotorisedVehicle;

@SuperBuilder
public class MotorCycle extends MotorisedVehicle {
    @Override
    public String toString() {
        return "MotorCycle{} " + super.toString();
    }
}
