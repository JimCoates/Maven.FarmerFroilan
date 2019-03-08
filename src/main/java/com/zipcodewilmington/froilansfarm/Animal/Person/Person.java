package com.zipcodewilmington.froilansfarm.Animal.Person;

import com.zipcodewilmington.froilansfarm.Animal.Animal;
import com.zipcodewilmington.froilansfarm.Crop.Edible;
import com.zipcodewilmington.froilansfarm.Utils.NoiseMaker;

public class Person extends Animal implements NoiseMaker {

    String name;


    public Person(String name) {
        this.name = name;
    }

    public Person() {
        this.name = "Default Name";
    }

    @Override
    public void eat(Edible food) {
        food = null;
        System.out.println("OM NOM NOM");
    }

    @Override
    public void makeNoise() {
        System.out.println("Sup dude?");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
