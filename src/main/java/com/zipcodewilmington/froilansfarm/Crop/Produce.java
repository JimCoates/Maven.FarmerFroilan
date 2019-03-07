package com.zipcodewilmington.froilansfarm.Crop;

import com.zipcodewilmington.froilansfarm.Crop.Edible;

public interface Produce {

    boolean hasBeenFertilized = false;

    public <T extends Edible> T yield();
}
