package com.zipcodewilmington.froilansfarm.Storage;

import com.zipcodewilmington.froilansfarm.Vehicle.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicle.Tractor;

import java.util.ArrayList;
import java.util.List;

public class Farm {
    private FarmHouse farmHouse;
    private Integer numberFields;
    private CropDuster betty;
    private Tractor tractor;
    private Integer numberStables;
    private Integer numberCoops;


    public Farm(FarmHouse farmHouse, Integer numberFields, CropDuster betty, Tractor tractor, Integer numberStables, Integer numberCoops) {
        this.farmHouse = farmHouse;
        this.numberFields = numberFields;
        this.betty = betty;
        this.tractor = tractor;
        this.numberStables = numberStables;
        this.numberCoops = numberCoops;
    }

    public FarmHouse getFarmHouse(){
        return this.farmHouse;
    }



}
