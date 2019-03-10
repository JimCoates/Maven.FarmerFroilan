package com.zipcodewilmington.froilansfarm.Animal.Person;

import com.zipcodewilmington.froilansfarm.Crop.Edible;
import com.zipcodewilmington.froilansfarm.Storage.Farm;
import com.zipcodewilmington.froilansfarm.Utils.Rideable;

import java.util.ArrayList;
import java.util.List;

public class FarmPilot extends Person implements Pilot,Rider {
    private Farm farm;
    private Rideable riding;

    public void setFarm(Farm farm) {
        this.farm = farm;
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

    @Override
    public <T extends Rideable> T getMount() {
        return (T) riding;
    }

    @Override
    public void fly() {

    }

    public void eatBreakfast(){
        List<Edible> plate = new ArrayList<>();
        plate.addAll(farm.getEgg(2));
        plate.addAll(farm.getCorn(2));
        plate.addAll(farm.getTomato(1));
        plate.forEach(super::eat);
    }
}
