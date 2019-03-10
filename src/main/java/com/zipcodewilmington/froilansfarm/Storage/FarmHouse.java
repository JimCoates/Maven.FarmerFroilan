package com.zipcodewilmington.froilansfarm.Storage;

import com.zipcodewilmington.froilansfarm.Animal.Person.FarmPilot;
import com.zipcodewilmington.froilansfarm.Animal.Person.Farmer;
import com.zipcodewilmington.froilansfarm.Animal.Person.Person;

import java.util.ArrayList;
import java.util.List;

public class FarmHouse extends StorageUnit <Person> {

    private Farmer froilan;
    private FarmPilot froilanda;

    public FarmHouse() {
        this.froilan = new Farmer();
        this.froilanda = new FarmPilot();
    }

    public Farmer getFroilan() {
        return froilan;
    }

    public FarmPilot getFroilanda() {
        return froilanda;
    }
}
