package com.goit.gojavaonline.module3_2;

import java.util.ArrayList;
import java.util.List;

public class Bouquet {
    private List<Flower> flowers;

    public List<Flower> getFlowers() {
        return flowers;
    }

    public void setFlowers(List<Flower> flowers) {
        this.flowers = flowers;
    }

    public boolean isBouquetEmpty(){
        boolean isEmpty = false;
        if(flowers == null || flowers.size() == 0){
            isEmpty = true;
        }

        return isEmpty;
    }

    public boolean isBouquetHasFlower(Flower flower){
        boolean isFlowerInBouquet = false;

        if(flower!= null && !isBouquetEmpty()){
            for(Flower flowerInBouquet : flowers){
                if(flowerInBouquet.equals(flower)){
                    isFlowerInBouquet = true;
                }
            }
        }
        return isFlowerInBouquet;
    }

    public void addFlower(Flower flower){
        if(isBouquetEmpty()){
            setFlowers(new ArrayList<Flower>());
        }
        if(!isBouquetHasFlower(flower)) {
            getFlowers().add(flower);
        }
        System.out.println(flower.getFlowerColor() + " " + flower.getFlowerSpecies() + " was successfully added to the bouqet.");
    }

    public void removeFlower(Flower flower){
        if(!isBouquetEmpty() && isBouquetHasFlower(flower)){
            getFlowers().remove(flower);
        }
        System.out.println(flower.getFlowerColor() + " " + flower.getFlowerSpecies() + " was successfully removed from the bouqet.");
    }

    public Flower getFlowerByIndex(int flowerIndex){
        Flower flower;
        if(flowerIndex < 0 || flowerIndex >= flowers.size() || isBouquetEmpty() ){
            flower = null;
        } else {
            flower = flowers.get(flowerIndex);
        }
        return flower;
    }

    @Override
    public String toString(){
        String listOfFlowers = "\nBouquet contains flowers: \n";
        if(!isBouquetEmpty()){
            for(Flower flower : flowers){
                listOfFlowers += flower.getFlowerColor()+" "+flower.getFlowerSpecies()+"\n";
            }
        }
        return listOfFlowers;
    }
}
