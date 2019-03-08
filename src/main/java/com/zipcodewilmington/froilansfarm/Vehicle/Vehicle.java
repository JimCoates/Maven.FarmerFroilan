package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.Animal.Person.Rider;
import com.zipcodewilmington.froilansfarm.Utils.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Utils.Rideable;

public abstract class Vehicle implements NoiseMaker, Rideable {

    Rider rider;


    @Override
    public void setRider(Rider rider) {
        this.rider = rider;
    }


}
