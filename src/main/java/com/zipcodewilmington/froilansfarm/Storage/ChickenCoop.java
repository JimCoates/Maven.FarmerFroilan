package com.zipcodewilmington.froilansfarm.Storage;

import com.zipcodewilmington.froilansfarm.Animal.Chicken;

import java.util.ArrayList;
import java.util.List;

public class ChickenCoop extends StorageUnit {

   private List<Chicken> chickenList = new ArrayList<>();

    public void addListOfChicken(List<Chicken> listToAdd){
        chickenList.addAll(listToAdd);
    }

    public Integer getSize(){
        return chickenList.size();
    }
}
