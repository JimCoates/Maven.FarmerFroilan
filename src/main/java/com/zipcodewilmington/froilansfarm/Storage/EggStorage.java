package com.zipcodewilmington.froilansfarm.Storage;

import com.zipcodewilmington.froilansfarm.Crop.Egg;
import com.zipcodewilmington.froilansfarm.Crop.Tomato;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EggStorage extends StorageUnit {
    List<Egg> eggs;

    public EggStorage(){
        eggs = Stream.generate(Egg::createEgg).limit(20).collect(Collectors.toList());
    }
}
