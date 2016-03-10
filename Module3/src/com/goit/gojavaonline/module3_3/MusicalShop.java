package com.goit.gojavaonline.module3_3;

import java.util.ArrayList;
import java.util.List;

public class MusicalShop {
    private List<MusicalInstrument> musicalInstruments;

    public List<MusicalInstrument> getMusicalInstruments() {
        if(musicalInstruments == null){
            musicalInstruments = new ArrayList<>();
        }
        return musicalInstruments;
    }

    public void setMusicalInstruments(List<MusicalInstrument> musicalInstruments) {
        this.musicalInstruments = musicalInstruments;
    }

    public void receiveMusicalInstrument(MusicalInstrument musicalInstrument){
        if ( musicalInstrument != null ){
            getMusicalInstruments().add(musicalInstrument);
            System.out.println(musicalInstrument.getMusicalInstrumentName() + " was successfully received.");
        }
    }

    public void sellMusicalInstrument(MusicalInstrument musicalInstrument){
        if(musicalInstrument != null){
            if(getMusicalInstruments().contains(musicalInstrument)) {
                getMusicalInstruments().remove(musicalInstrument);
                System.out.println(musicalInstrument.getMusicalInstrumentName() + " was successfuly sold.");
            }
        }
    }

    public MusicalInstrument getMusicalInstrumentByIndex(int musicalInstrumentIndex){
        MusicalInstrument musicalInstrument;
        if(musicalInstrumentIndex < 0 || musicalInstrumentIndex >= getMusicalInstruments().size() || getMusicalInstruments().size() == 0 ){
            musicalInstrument = null;
        } else {
            musicalInstrument = getMusicalInstruments().get(musicalInstrumentIndex);
        }
        return musicalInstrument;
    }

    @Override
    public String toString(){
        String listOfMusicalInstruments = "\nMusical shop contains musical instruments: \n";
        if(getMusicalInstruments().size() > 0){
            for(MusicalInstrument musicalInstrument : getMusicalInstruments()){
                listOfMusicalInstruments += musicalInstrument.getMusicalInstrumentName()+"\n";
            }
        }
        return listOfMusicalInstruments;
    }
}
