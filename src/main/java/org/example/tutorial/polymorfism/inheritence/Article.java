package org.example.tutorial.polymorfism.inheritence;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Setter
@Getter
@ToString
public class Article {
    long id;
    String name;
}
