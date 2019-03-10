package com.zipcodewilmington.froilansfarm.Crop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CornStalkTest {


    @Test
    public void addEarOfCornTest() {
        CornStalk cornStalk = new CornStalk();
        Integer before = cornStalk.getQuantity();
        cornStalk.yield();
        Integer after = cornStalk.getQuantity();

        Assertions.assertTrue(before != after);
        Assertions.assertTrue(before == 0);
        Assertions.assertTrue(after == 1);

    }

    @Test
    public void removeEarOfCornTest() {
        CornStalk cornStalk = new CornStalk();
        cornStalk.yield();
        Integer before = cornStalk.getQuantity();
        cornStalk.removeEarOfCorn();
        Integer after = cornStalk.getQuantity();

       Assertions.assertTrue(before != after);
       Assertions.assertTrue(before == 1);
       Assertions.assertTrue(after == 1);

    }


}
