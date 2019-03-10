package com.zipcodewilmington.froilansfarm.Animal.Person;

import com.zipcodewilmington.froilansfarm.Animal.Animal;
import com.zipcodewilmington.froilansfarm.Crop.Crop;
import com.zipcodewilmington.froilansfarm.Crop.Edible;
import com.zipcodewilmington.froilansfarm.Storage.CropRow;
import com.zipcodewilmington.froilansfarm.Storage.Farm;
import com.zipcodewilmington.froilansfarm.Utils.Rideable;

import java.util.ArrayList;
import java.util.List;

public class Farmer extends Person implements Botanist,Rider {

        Farm farm;
        private Rideable riding;

    public Farmer() {

    }

    public void setFarm(Farm farm) {
        this.farm = farm;
    }

    @Override
    public void plant(Crop crop, CropRow cropRow) { //TODO after storage methods are done, complete the logic in this method

    }

    @Override
    public void mount(Rideable object) {
        riding = object;
        object.setRider(this);
    }

    @Override
    public void dismount() {
        riding.setRider(null);
        riding = null;
    }

    public void feedCorn(Animal animal,Integer numberOfCorn){
        farm.getCorn(numberOfCorn).forEach(animal::eat);
    }

    public <T extends Rideable> T getMount(){
        return (T) riding;
    }

    @Override
    public void sleep() {

    }

    public void eatBreakfast(){
        List<Edible> plate = new ArrayList<>();
        plate.addAll(farm.getEgg(5));
        plate.addAll(farm.getCorn(1));
        plate.addAll(farm.getTomato(2));
        plate.forEach(super::eat);
    }

    public void mountAndRide(Rideable object){
        riding = object;
        riding.Ride();
    }
}
