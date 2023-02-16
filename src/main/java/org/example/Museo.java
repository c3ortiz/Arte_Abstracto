package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Museo {
    public static void main(String[] args) {
        ArrayList<Arte> Museo = new ArrayList<Arte>();

        Pintura oleo = new Pintura("Oleo");
        Museo.add(oleo);
        Pintura acuarela = new Pintura("Acuarela");
        Museo.add(acuarela);
        Pintura acrilico = new Pintura("Acrilico");
        Museo.add(acrilico);

        Escultura marmol = new Escultura("Marmol");
        Museo.add(marmol);
        Escultura bronce = new Escultura("Bronce");
        Museo.add(bronce);

        Random random = new Random();
        Collections.shuffle(Museo, random);

        for (Arte i: Museo) {
            i.verArte();
        }
    }
}
