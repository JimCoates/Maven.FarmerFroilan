package com.zipcodewilmington.froilansfarm.Storage;

import com.zipcodewilmington.froilansfarm.Vehicle.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicle.Tractor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Farm {
    private final Tractor tractor;
    private final CropDuster betty;
    private FarmHouse farmHouse;
    private List<Field> fieldList;
    private List<ChickenCoop> chickenCoopList;
    private List<Stable> horseStableList;


    public Farm(Integer numberFields, Integer numberStables, Integer numberCoops) {
        this.farmHouse = new FarmHouse();
        this.betty = new CropDuster();
        this.tractor = new Tractor();

        this.horseStableList = setNumberStables(numberStables);
        this.chickenCoopList = setNumberCoops(numberCoops);
        this.fieldList = setNumberFields(numberFields);
    }

    public Farm() {
        this(1,3,4);
    }

    public FarmHouse getFarmHouse() {
        return this.farmHouse;
    }

    private List<Field> setNumberFields(Integer numberFields) {
        return Stream.generate(Field::new)
                .limit(numberFields)
                .collect(Collectors.toList());
    }

    private List<Stable> setNumberStables(Integer numberStables) {
        return Stream.generate(Stable::new)
                .limit(numberStables)
                .collect(Collectors.toList());
    }

    private List<ChickenCoop> setNumberCoops(Integer numberCoops) {
        return Stream.generate(ChickenCoop::new)
                .limit(numberCoops)
                .collect(Collectors.toList());
    }


}
