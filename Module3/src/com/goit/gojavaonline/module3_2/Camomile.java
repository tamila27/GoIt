package com.goit.gojavaonline.module3_2;

public class Camomile extends Flower {
    public Camomile(FlowerColor flowerColor){
        super(flowerColor);
        System.out.println(flowerColor + " camomile created successfully.");
    }

    public FlowerSpicies getFlowerSpecies(){
        return FlowerSpicies.CAMOMILE;
    }
}
