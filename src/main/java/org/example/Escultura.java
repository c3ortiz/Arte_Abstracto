package org.example;

public class Escultura extends Arte{
    private String material;

    public Escultura(String material) {
        this.material = material;
    }

    void verArte() {
        System.out.println("Viendo escultura hecha con " + material);
    }
}
