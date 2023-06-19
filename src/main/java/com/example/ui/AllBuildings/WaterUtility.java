package com.example.ui.AllBuildings;


import com.example.ui.AllMethods.Processing;
import com.example.ui.Building;
import com.example.ui.Resource;

public class WaterUtility extends Building {
    private Resource water = new Resource("water", 0);
    private Processing processing;
    public WaterUtility(String name) {
        super(name);
        res.addAll(water);
        processing = new Processing(res, name);
    }
    @Override
    public void consumeResourcesPeriodically(){
        processing.doProcessing();
    }

}
