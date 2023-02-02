package org.example.tutorial.polymorfism.inheritence;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Setter
@Getter
public class LumberTwoByFour extends Article {
    private String type;

    @Override
    public String toString() {
        return "LumberTwoByFour{" +
                "type='" + this.type + '\'' +
                ", id=" + this.getId() +
                ", name='" + this.getName() + '\'' +
                '}';
    }
}
