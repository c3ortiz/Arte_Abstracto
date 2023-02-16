package org.example;

public class Museo {
    public static void main(String[] args) {
        Pintura oleo = new Pintura("Oleo");
        Pintura acuarela = new Pintura("acuarela");
        Pintura acrilico = new Pintura("acrilico");

        Escultura marmol = new Escultura("Marmol");
        Escultura bronce = new Escultura("Bronce");

        oleo.verArte();
        acuarela.verArte();
        acrilico.verArte();
        marmol.verArte();
        bronce.verArte();
    }
}
