package com.zipcodewilmington.froilansfarm.Storage;

import com.zipcodewilmington.froilansfarm.Crop.Crop;

import java.util.ArrayList;
import java.util.List;

public class CropRow extends StorageUnit <Crop> {

    public static CropRow createNewCropRow(){
        return new CropRow();
    }
}
