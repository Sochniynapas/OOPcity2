package com.example.ui.AllBuildings;

import com.example.ui.AllMethods.Processing;
import com.example.ui.Building;
import com.example.ui.Resource;


public class Substation extends Building {



    private Resource electricity = new Resource("electricity", 500);
    private Processing processing;

    public Substation(String name) {
        super(name);
        res.addAll(electricity);
        processing = new Processing(res,name);


    }
    @Override
    public void consumeResourcesPeriodically(){

        processing.doProcessing();
    }

}
