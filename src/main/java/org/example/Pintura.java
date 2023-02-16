package org.example;

public class Pintura extends Arte{
    private String tipoPintura;

    public Pintura(String tipoPintura) {
        this.tipoPintura = tipoPintura;
    }

    void verArte() {
        System.out.println("Viendo arte hecha con " + tipoPintura);
    }
}
