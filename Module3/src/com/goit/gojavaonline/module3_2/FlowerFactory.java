package com.goit.gojavaonline.module3_2;

public class FlowerFactory {

    public static Flower getRandomFlower(){
        Flower flower = new Aster(FlowerColor.BLUE);

        //Min + (int)(Math.random() * ((Max - Min) + 1))

        if(FlowerSpicies.values()!=null && FlowerSpicies.values().length > 0){
            int flowerSpiciesOrdinal = (int)(Math.random()*FlowerSpicies.values().length);
            int flowerColorOrdinal = (int)(Math.random()*FlowerColor.values().length);
            FlowerSpicies flowerSpicies = FlowerSpicies.values()[flowerSpiciesOrdinal];
            FlowerColor flowerColor = FlowerColor.values()[flowerColorOrdinal];
            switch (flowerSpicies){
                case ASTER:
                    flower = new Aster(flowerColor);
                    break;
                case ROSE:
                    flower = new Rose(flowerColor);
                    break;
                case TULIP:
                    flower = new Tulip(flowerColor);
                    break;
                case CAMOMILE:
                    flower = new Camomile(flowerColor);
                    break;
            }
        }

        return flower;
    }
}
