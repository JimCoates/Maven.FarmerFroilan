package com.zipcodewilmington.froilansfarm.Storage;

import com.zipcodewilmington.froilansfarm.Crop.EarCorn;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CornStorage extends StorageUnit{
    List<EarCorn> corns;

    public CornStorage(){
        corns = Stream.generate(EarCorn::createCorn).limit(20).collect(Collectors.toList());
    }
}
