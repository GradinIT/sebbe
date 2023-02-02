package org.example.tutorial.polymorfism.inheritence;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Article> stock = new ArrayList<>();
        stock.add(LumberTwoByFour.builder()
                        .id(13)
                        .name("rafter two by four")
                        .type("pine")
                .build());
        stock.add(LumberTwoByFour.builder()
                .id(14)
                .name("rafter two by four")
                .type("spruce")
                .build());
        stock.add(Cement.builder()
                .id(1)
                .name("cement bag ")
                .weight(150L)
                .build());

        stock.forEach(System.out::println);

        stock.forEach(article -> {
            System.out.println(article.getId());
            System.out.println(article.getName());
            if (article instanceof LumberTwoByFour) {
                System.out.println("Article is LumberTwoByFour");
                System.out.println(((LumberTwoByFour)article).getType());
            }
        });
    }
}
