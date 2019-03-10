package com.zipcodewilmington.froilansfarm.Storage;

import com.zipcodewilmington.froilansfarm.Crop.Tomato;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TomatoStorage extends StorageUnit {
    List<Tomato> tomatoes;

    public TomatoStorage(){
        tomatoes = Stream.generate(Tomato::createTomato).limit(20).collect(Collectors.toList());
    }
}
