package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.Animal.Person.Pilot;
import com.zipcodewilmington.froilansfarm.Storage.CropRow;
import com.zipcodewilmington.froilansfarm.Storage.Farm;


public class CropDuster extends FarmVehicle implements Aircraft {

    Pilot pilot;

    public CropDuster(Farm farm) {
        super(farm);
    }

    @Override
    public void fly() {

    }

    public void fertilize(){
        farm.cropStream().forEach(crop -> crop.fertilizePlant());
    }

    @Override
    public void makeNoise() {

    }

    @Override
    public void Ride() {

    }
}
