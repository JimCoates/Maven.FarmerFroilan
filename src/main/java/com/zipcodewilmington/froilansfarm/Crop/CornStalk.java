package com.zipcodewilmington.froilansfarm.Crop;

public class CornStalk extends Crop {


boolean hasBeenFertilized = true;
boolean hasBeenHarvested = true;

    @Override
    public EarCorn yield() {

        EarCorn corn = new EarCorn();
          return corn;
        }



    public void addEarOfCorn() {
    }


    public void removeEarOfCorn(){

    }



    public Integer getQuantity() {
        return null;
    }

}
