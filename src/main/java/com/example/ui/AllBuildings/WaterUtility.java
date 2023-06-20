package com.example.ui.AllBuildings;


import com.example.ui.AllMethods.Processing;
import com.example.ui.Building;
import com.example.ui.Resource;

public class WaterUtility extends Building {
    private Resource water = new Resource("water", 0);
    private Processing processing;
    public WaterUtility(String name) {
        super(name);
        getRes().addAll(water);
        getMethods().addAll(processing = new Processing("processing", getRes(), name));
    }
    @Override
    public void consumeResourcesPeriodically(){
        processing.doProcessing();
    }

}
