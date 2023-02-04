package org.example.tutorial.polymorfism.inheritence;

import org.example.tutorial.polymorfism.inheritence.bike.Bicycle;
import org.example.tutorial.polymorfism.inheritence.bike.MotorCycle;
import org.example.tutorial.polymorfism.inheritence.car.Car;
import org.example.tutorial.polymorfism.inheritence.truck.Lorry;
import org.example.util.TextUtil;

import java.io.LineNumberInputStream;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehicles = List.of(
                Bicycle.builder()
                        .id("id-cykel")
                        .nbrOfGears(21)
                        .build(),
                MotorCycle.builder()
                        .fuel("bensin")
                        .horsePower(200)
                        .id("id-motorcykel")
                        .build(),
                Car.builder()
                        .id("id-bil")
                        .horsePower(185)
                        .fuel("diesel")
                        .nbrOfSeats(5)
                        .build(),
                Lorry.builder()
                        .lengthInMeter(24)
                        .fuel("diesel")
                        .horsePower(600)
                        .nbrOfAxels(3)
                        .id("id-lastbil")
                        .build()
        );

        System.out.println("Alla fordon");
        vehicles.forEach(System.out::println);


        List<Vehicle> motorisedVehicles = vehicles.stream()
                .map(vehicle -> vehicle instanceof MotorisedVehicle ? vehicle : null)
                .filter(Objects::nonNull)
                .toList();

        System.out.println(TextUtil.underLineText("Bara motorfordon"));
        motorisedVehicles.forEach(System.out::println);


        List<Vehicle> nonMotorisedVehicles = vehicles.stream()
                .map(vehicle -> motorisedVehicles.contains(vehicle) ? null : vehicle)
                .filter(Objects::nonNull)
                .toList();

        System.out.println("Bara fordon som ej är motorfordon");
        nonMotorisedVehicles.forEach(System.out::println);
    }
}
