package com.zipcodewilmington.froilansfarm;

public interface Eater<T extends Edible> {

    public void eat(T food);
}
