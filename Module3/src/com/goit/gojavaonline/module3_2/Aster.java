package com.goit.gojavaonline.module3_2;

public class Aster extends Flower {
    public Aster(FlowerColor flowerColor){
        super(flowerColor);
        System.out.println(flowerColor + " aster created successfully.");
    }

    public FlowerSpicies getFlowerSpecies(){
        return FlowerSpicies.ASTER;
    }
}
