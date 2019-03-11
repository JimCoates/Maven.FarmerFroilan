package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.Animal.Person.Rider;
import com.zipcodewilmington.froilansfarm.Storage.Farm;

public abstract class FarmVehicle extends Vehicle {

    Farm farm;

    public FarmVehicle(Farm farm) {
        this.farm = farm;
    }

    public void setFarm(Farm farm){
    this.farm = farm;
    }




}
