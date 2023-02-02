package org.example.tutorial.polymorfism.inheritence;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Setter
@Getter
public class Cement extends Article{
    private final Long weight;
}
