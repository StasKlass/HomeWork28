package org.example;

public class Sculpture implements ArtWork {
    private String material;
    private double weight;
    private String creator;

    public Sculpture(String material, double weight, String creator) {
        this.material = material;
        this.weight = weight;
        this.creator = creator;
    }

    public void displayInfo() {
        System.out.println("Sculpture Info:");
        System.out.println("Material:" + material);
        System.out.println("Weight:" + weight);
        System.out.println("Creator" + creator);

    }

    public String getCreator() {
        return null;
    }
}
