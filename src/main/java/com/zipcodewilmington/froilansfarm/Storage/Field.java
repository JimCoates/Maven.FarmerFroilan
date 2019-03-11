package com.zipcodewilmington.froilansfarm.Storage;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Field extends StorageUnit <CropRow> {

    List<CropRow> cropRows;

    public Field(){
        cropRows = Stream.generate(CropRow::createNewCropRow)
                .limit(5).collect(Collectors.toList());
    }

    public CropRow getCropRow(Integer row){
        return cropRows.get(row);
    }


}
