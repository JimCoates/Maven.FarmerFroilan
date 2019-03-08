package com.zipcodewilmington.froilansfarm.Storage;

import com.zipcodewilmington.froilansfarm.Animal.Animal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class StorageUnit <SomeType> {
    List<SomeType> list = new ArrayList<>();

    Integer getSize(){
        return list.size();
    }

    void addSingle(SomeType obj){
        list.add(obj);
    }

    void removeSingle(SomeType obj){
        list.remove(obj);
    }

    void removeAll(){
        list.clear();
    }

    SomeType get(Integer index){
        return list.get(index);
    }

    void addList(List<SomeType> someTyepOList){
        list.addAll(someTyepOList);
    }

}
