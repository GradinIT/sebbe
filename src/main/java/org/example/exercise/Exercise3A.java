package org.example.exercise;

import org.example.Exercise;
import org.example.util.TextUtil;

public class Exercise3A implements Exercise {
    @Override
    public void run() {
        //System.out.println(Vad_är_det_som_är_fel_här?");
        System.out.println("Vad_är_det_som_är_fel_här?"); //lösning
    }

    @Override
    public void printInformation() {
        System.out.println(TextUtil.underLineText("3. Ja? Vad är det som är fel med programmet? Lös felet och kör programmet.\n"));
    }
}
