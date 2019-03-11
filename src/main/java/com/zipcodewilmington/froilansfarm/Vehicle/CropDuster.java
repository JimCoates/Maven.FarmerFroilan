package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.Animal.Person.Pilot;
import com.zipcodewilmington.froilansfarm.Crop.Crop;
import com.zipcodewilmington.froilansfarm.Storage.CropRow;
<<<<<<< HEAD
<<<<<<< HEAD
import com.zipcodewilmington.froilansfarm.Storage.Farm;
import com.zipcodewilmington.froilansfarm.Storage.Field;

=======

=======

import com.zipcodewilmington.froilansfarm.Storage.Farm;
import com.zipcodewilmington.froilansfarm.Storage.Field;
>>>>>>> f358e15318af378938d976f20eabecbd558b8f73
import com.zipcodewilmington.froilansfarm.Storage.Farm;
import com.zipcodewilmington.froilansfarm.Storage.Field;
import java.util.stream.Stream;


<<<<<<< HEAD
>>>>>>> e0eee8e6815f5e9da59bf09265b5c714648e6a6d

=======
>>>>>>> f358e15318af378938d976f20eabecbd558b8f73
public class CropDuster extends FarmVehicle implements Aircraft {

    Pilot pilot;

    public CropDuster(Farm farm) {
        super(farm);
    }

    @Override
    public void fly() {

    }

<<<<<<< HEAD
<<<<<<< HEAD
    public void fertilize(){
=======
=======

>>>>>>> f358e15318af378938d976f20eabecbd558b8f73
    public void fertilize(){//TODO - refactor with STREAM

//        farm.cropStream().forEach(crop -> crop.fertilizePlant());

<<<<<<< HEAD
>>>>>>> e0eee8e6815f5e9da59bf09265b5c714648e6a6d

=======
>>>>>>> f358e15318af378938d976f20eabecbd558b8f73
        for (Field field: farm.getFieldList()) {
            for (CropRow cropRow: field.getListCropRow()) {
                for (Crop crop: cropRow.getCropList())
                     {crop.fertilizePlant();

                }
            }
        }
<<<<<<< HEAD
<<<<<<< HEAD
=======

>>>>>>> e0eee8e6815f5e9da59bf09265b5c714648e6a6d
=======
>>>>>>> f358e15318af378938d976f20eabecbd558b8f73
    }

    @Override
    public void makeNoise() {
    }

    @Override
    public void Ride() {

    }
}
