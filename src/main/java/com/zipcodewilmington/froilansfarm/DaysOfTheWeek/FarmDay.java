package com.zipcodewilmington.froilansfarm.DaysOfTheWeek;

import com.zipcodewilmington.froilansfarm.Animal.Horse;
import com.zipcodewilmington.froilansfarm.Storage.Farm;
import com.zipcodewilmington.froilansfarm.Storage.Stable;

import java.util.List;
import java.util.stream.Stream;

public abstract class FarmDay {

    public void morningRoutine(Farm farm){
        farm.horseStream().forEach(horse -> farm.accessFarmhouse().getFroilan().mountAndRide(horse));
        farm.horseStream().forEach(horse -> farm.accessFarmhouse().getFroilan().feedCorn(horse,3));
        farm.accessFarmhouse().getFroilan().eatBreakfast();
        farm.accessFarmhouse().getFroilanda().eatBreakfast();

    }

    public abstract void run(Farm farm);
}
