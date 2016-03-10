package com.goit.gojavaonline.module3_3;

public abstract class MusicalInstrument {
    private int id;
    private float price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    public abstract MusicalInstruments getMusicalInstrumentName();
}
