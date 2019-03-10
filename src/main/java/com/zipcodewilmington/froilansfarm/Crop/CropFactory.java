package com.zipcodewilmington.froilansfarm.Crop;

import java.util.Arrays;
import java.util.List;

public class CropFactory extends Crop implements Produce {
    @Override
    public Edible yield() {
        return null;
    }


    public EarCorn getCorn() {
        return new EarCorn();
    }

    public Tomato getTomato() {
        return new Tomato();
        }




    public List<Produce> makeProduce(Integer numberOfProduce, String produce) {
        Produce[] cropArray = new Produce[numberOfProduce];
        if (produce.equals("tomato")) {
            for (int i = 0; i < numberOfProduce; i++) {
                cropArray[i] = getTomato();
            }
            return Arrays.asList(cropArray);

        }else if (produce.equals("Corn")) {
            for (int i = 0; i < numberOfProduce; i++) {
                cropArray[i] = getCorn();
            }
            return Arrays.asList(cropArray);
        }
    return Arrays.asList(cropArray);
    }



}
