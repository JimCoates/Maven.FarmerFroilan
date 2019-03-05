package com.zipcodewilmington.froilansfarm.Animal.Person;

import com.zipcodewilmington.froilansfarm.Crop.Edible;

public interface Eater<T extends Edible> {

    public void eat(T food);
}
