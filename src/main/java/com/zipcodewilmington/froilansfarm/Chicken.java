package com.zipcodewilmington.froilansfarm;

import oracle.jvm.hotspot.jfr.Producer;

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
