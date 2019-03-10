package com.zipcodewilmington.froilansfarm.Storage;

import com.zipcodewilmington.froilansfarm.Vehicle.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicle.Tractor;

public class FarmBuilder {

    private Integer numberFields = 1;
    private Integer numberStables = 3;
    private Integer numberCoops = 4;
    private Integer numberOfChicken = 15;
    private Integer numberOfHorse = 10;

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

    public void setNumberOfChicken(Integer numberOfChicken) {
        this.numberOfChicken = numberOfChicken;
    }

    public void setNumberOfHorse(Integer numberOfHorse) {
        this.numberOfHorse = numberOfHorse;
    }

    public Farm createFarm() {
        return new Farm(numberFields, numberStables, numberCoops,numberOfChicken,numberOfHorse);
    }
}