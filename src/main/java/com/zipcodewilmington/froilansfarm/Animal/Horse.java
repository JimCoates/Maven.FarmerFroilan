package com.zipcodewilmington.froilansfarm.Animal;


import com.zipcodewilmington.froilansfarm.Animal.Person.Rider;
import com.zipcodewilmington.froilansfarm.Crop.Edible;
import com.zipcodewilmington.froilansfarm.Utils.Rideable;

public class Horse extends Animal implements Rideable {

    private Rider rider;
    private boolean isExercised;

    public Horse() {
        isExercised = false;
    }

    public void eat(Edible food) {
        food = null;
        System.out.println("OM NOM NOM");
    }

    public void makeNoise() {
        System.out.println("PPFFFFFFFFFFT");
    }


    @Override
    public void Ride() {
        System.out.println("Woooooooooo!");
        isExercised = true;
    }

    @Override
    public void setRider(Rider rider) {
        this.rider = rider;
    }

    public Rider getRider(){
        return rider;
    }

    public void endOfDay() {
        isExercised = false;
    }

    public boolean isExercised() {
        return isExercised;
    }
}
