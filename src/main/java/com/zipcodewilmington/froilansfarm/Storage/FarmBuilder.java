package com.zipcodewilmington.froilansfarm.Storage;

import com.zipcodewilmington.froilansfarm.Vehicle.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicle.Tractor;

public class FarmBuilder {
    private FarmHouse farmHouse;
    private Integer numberFields;
    private CropDuster betty;
    private Tractor tractor;
    private Integer numberStables;
    private Integer numberCoops;

    public FarmBuilder setFarmHouse(FarmHouse farmHouse) {
        this.farmHouse = farmHouse;
        return this;
    }

    public FarmBuilder setNumberFields(Integer numberFields) {
        this.numberFields = numberFields;
        return this;
    }

    public FarmBuilder setBetty(CropDuster betty) {
        this.betty = betty;
        return this;
    }

    public FarmBuilder setTractor(Tractor tractor) {
        this.tractor = tractor;
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
        return new Farm(farmHouse, numberFields, betty, tractor, numberStables, numberCoops);
    }
}