package org.example.tutorial.polymorfism.interfaces;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class Apple implements Eatable,Fruit {
    private final String name;
    private final Long id;
}
