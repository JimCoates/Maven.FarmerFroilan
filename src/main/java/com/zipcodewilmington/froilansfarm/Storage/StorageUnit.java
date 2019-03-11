package com.zipcodewilmington.froilansfarm.Storage;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public abstract class StorageUnit <SomeType> implements Comparable {
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

    @Override
    public int compareTo(Object object){
        StorageUnit listToCompare = (StorageUnit) object;
        return this.getSize().compareTo(listToCompare.getSize());
    }

    public Stream getStream(){
        Stream<SomeType> stream = list.stream();
        return stream;
    }

}
