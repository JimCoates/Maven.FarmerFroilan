package com.zipcodewilmington.froilansfarm.Storage;

import com.zipcodewilmington.froilansfarm.Crop.Crop;

import java.util.ArrayList;
import java.util.List;

public class CropRow extends StorageUnit <Crop> {

    List<Crop> cropList;

    public static CropRow createNewCropRow(){
        return new CropRow();
    }

    public Crop getCropFromCropRow(Integer index){
        return cropList.get(index);
    }

    public List<Crop> getCropList(){
        return this.cropList;
    }


}
