package com.zipcodewilmington.froilansfarm.Storage;

import com.zipcodewilmington.froilansfarm.Crop.Crop;

import java.util.ArrayList;
import java.util.List;

public class CropRow extends StorageUnit <Crop> {

    List<Crop> cropList = new ArrayList<>();

    public static CropRow createNewCropRow(){
        return new CropRow();
    }

    public Crop getCropFromCropRow(Integer index){
        return cropList.get(index);
    }

    public List<Crop> getCropList(){
        return this.cropList;
    }

<<<<<<< HEAD
<<<<<<< HEAD
    public void resetCropRow(){
        this.cropList.clear();
=======
    public void addCrop(Crop crop){
        cropList.add(crop);
>>>>>>> e0eee8e6815f5e9da59bf09265b5c714648e6a6d
=======
    public void resetCropRow(){
        this.cropList.clear();
    }

    public void addCrop(Crop crop){
        cropList.add(crop);

>>>>>>> f358e15318af378938d976f20eabecbd558b8f73
    }


}
