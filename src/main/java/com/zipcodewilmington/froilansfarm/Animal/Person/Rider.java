package com.zipcodewilmington.froilansfarm.Animal.Person;

import com.zipcodewilmington.froilansfarm.Utils.Rideable;

public interface Rider {

     void mount(Rideable object);

     void dismount();

     <T extends Rideable> T getMount();
}
