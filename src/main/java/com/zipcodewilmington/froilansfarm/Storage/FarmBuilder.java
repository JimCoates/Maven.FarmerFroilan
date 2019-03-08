package com.zipcodewilmington.froilansfarm.Storage;

import com.zipcodewilmington.froilansfarm.Vehicle.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicle.Tractor;

public class FarmBuilder {

    private Integer numberFields;
    private Integer numberStables;
    private Integer numberCoops;

    public FarmBuilder setNumberFields(Integer numberFields) {
        this.numberFields = numberFields;
        return this;
    }

    public FarmBuilder setNumberStables(Integer numberStables) {
        this.numberStables = numberStables;
        return this;
    }

    public FarmBuilder setNumberCoops(Integer numberCoops) {
        this.numberCoops = numberCoops;
        return this;
    }

    public Farm createFarm() {
        return new Farm(numberFields, numberStables, numberCoops);
    }
}