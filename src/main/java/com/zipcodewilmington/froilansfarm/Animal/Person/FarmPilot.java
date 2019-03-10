package com.zipcodewilmington.froilansfarm.Animal.Person;

import com.zipcodewilmington.froilansfarm.Utils.Rideable;

public class FarmPilot extends Person implements Pilot,Rider {

    private Rideable riding;

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
}
