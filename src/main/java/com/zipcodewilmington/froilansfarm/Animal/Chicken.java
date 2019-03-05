package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Crop.Edible;
import com.zipcodewilmington.froilansfarm.Crop.EdibleEgg;
import com.zipcodewilmington.froilansfarm.Crop.Produce;

public class Chicken extends Animal implements Produce {
    boolean hasBeenFertilized;

    public void eat(Edible food) {

    }

    public void makeNoise() {

    }

    public EdibleEgg yield() {

        return null;
    }
}
