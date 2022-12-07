package org.example.exercise;

import org.example.Exercise;

public class Exercise3B implements Exercise {
    @Override
    public void run() {
        //System.out.println(Vad_är_det_som_är_fel_här");
        String Vad_ar_det_som_ar_fel_har = "Vad_är_det_som_är_fel_här";
        System.out.println(Vad_ar_det_som_ar_fel_har); //lösning
        Vad_ar_det_som_ar_fel_har = "det är inget fel här ";
        System.out.println(Vad_ar_det_som_ar_fel_har); //lösning
    }

    @Override
    public void printInformation() {

    }
}