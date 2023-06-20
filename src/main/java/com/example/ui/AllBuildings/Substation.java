package com.example.ui.AllBuildings;

import com.example.ui.AllMethods.Processing;
import com.example.ui.Building;
import com.example.ui.Resource;


public class Substation extends Building {



    private Resource electricity = new Resource("electricity", 0);
    private Processing processing;

    public Substation(String name) {
        super(name);
        getRes().addAll(electricity);
        getMethods().addAll(processing = new Processing("processing", getRes(),name));


    }
    @Override
    public void consumeResourcesPeriodically(){

        processing.doProcessing();
    }

}
