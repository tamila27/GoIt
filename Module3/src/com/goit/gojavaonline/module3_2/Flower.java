package com.goit.gojavaonline.module3_2;

public abstract class Flower {
    private FlowerColor flowerColor;

    public Flower(FlowerColor flowerColor){
        setFlowerColor(flowerColor);
    }

    public FlowerColor getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(FlowerColor flowerColor) {
        this.flowerColor = flowerColor;
    }

    public abstract FlowerSpicies getFlowerSpecies();
}
