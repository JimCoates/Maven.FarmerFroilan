package com.zipcodewilmington.froilansfarm.Animal.Person;

import com.zipcodewilmington.froilansfarm.Crop.Crop;
import com.zipcodewilmington.froilansfarm.Storage.CropRow;
import com.zipcodewilmington.froilansfarm.Utils.Rideable;

public class Farmer extends Person implements Botanist,Rider {


        private Rideable riding;

    public Farmer() {

    }

    @Override
    public void plant(Crop crop, CropRow cropRow) { //TODO after storage methods are done, complete the logic in this method

    }

    @Override
    public void mount(Rideable object) {
        riding = object;
    }

    @Override
    public void dismount() {
        riding = null;
    }

    public <T extends Rideable> T getMount(){
        return (T) riding;
    }
}
