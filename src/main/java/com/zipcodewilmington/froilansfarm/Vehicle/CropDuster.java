package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.Animal.Person.Pilot;
import com.zipcodewilmington.froilansfarm.Crop.Crop;
import com.zipcodewilmington.froilansfarm.Storage.CropRow;

import com.zipcodewilmington.froilansfarm.Storage.Farm;
import com.zipcodewilmington.froilansfarm.Storage.Field;
import com.zipcodewilmington.froilansfarm.Storage.Farm;
import com.zipcodewilmington.froilansfarm.Storage.Field;
import java.util.stream.Stream;


public class CropDuster extends FarmVehicle implements Aircraft {

    Pilot pilot;

    public CropDuster(Farm farm) {
        super(farm);
    }

    @Override
    public void fly() {

    }


    public void fertilize(){//TODO - refactor with STREAM

//        farm.cropStream().forEach(crop -> crop.fertilizePlant());

        for (Field field: farm.getFieldList()) {
            for (CropRow cropRow: field.getListCropRow()) {
                for (Crop crop: cropRow.getCropList())
                     {crop.fertilizePlant();

                }
            }
        }
    }

    @Override
    public void makeNoise() {
    }

    @Override
    public void Ride() {

    }
}
