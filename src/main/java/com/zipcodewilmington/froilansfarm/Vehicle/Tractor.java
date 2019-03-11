package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.Crop.Crop;
import com.zipcodewilmington.froilansfarm.Storage.CropRow;
import com.zipcodewilmington.froilansfarm.Storage.Farm;
import com.zipcodewilmington.froilansfarm.Storage.Field;

public class Tractor extends FarmVehicle {


    public Tractor(Farm farm) {
        super(farm);
    }

    public void harvestAndClear(){
        harvest();
        clearCropRow();
    }

    private void harvest() {
        for (Field field : farm.getFieldList()) {
            for (CropRow cropRow : field.getListCropRow()) {
                for (Crop crop : cropRow.getCropList()) {
                    crop.harvest();

                }
            }
        }
    }

    private void clearCropRow() {
        for (Field field : farm.getFieldList()) {
            for (CropRow cropRow : field.getListCropRow()) {
                cropRow.resetCropRow();
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
