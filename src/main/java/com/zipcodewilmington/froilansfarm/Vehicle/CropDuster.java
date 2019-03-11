package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.Animal.Person.Pilot;
import com.zipcodewilmington.froilansfarm.Crop.Crop;
import com.zipcodewilmington.froilansfarm.Storage.CropRow;
<<<<<<< HEAD
import com.zipcodewilmington.froilansfarm.Storage.Farm;
import com.zipcodewilmington.froilansfarm.Storage.Field;

=======

import com.zipcodewilmington.froilansfarm.Storage.Farm;

import com.zipcodewilmington.froilansfarm.Storage.Field;

import java.util.stream.Stream;


>>>>>>> e0eee8e6815f5e9da59bf09265b5c714648e6a6d

public class CropDuster extends FarmVehicle implements Aircraft {

    Pilot pilot;

    public CropDuster(Farm farm) {
        super(farm);
    }

    @Override
    public void fly() {

    }

<<<<<<< HEAD
    public void fertilize(){
=======
    public void fertilize(){//TODO - refactor with STREAM

//        farm.cropStream().forEach(crop -> crop.fertilizePlant());

>>>>>>> e0eee8e6815f5e9da59bf09265b5c714648e6a6d

        for (Field field: farm.getFieldList()) {
            for (CropRow cropRow: field.getListCropRow()) {
                for (Crop crop: cropRow.getCropList())
                     {crop.fertilizePlant();

                }
            }
        }
<<<<<<< HEAD
=======

>>>>>>> e0eee8e6815f5e9da59bf09265b5c714648e6a6d
    }

    @Override
    public void makeNoise() {
    }

    @Override
    public void Ride() {

    }
}
