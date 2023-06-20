package com.example.ui.AllBuildings;

import com.example.ui.AllMethods.Consumption;
import com.example.ui.AllMethods.Transformation;
import com.example.ui.Building;
import com.example.ui.Resource;

import java.util.Random;

public class Sawmill extends Building {
    private Resource electricity = new Resource("electricity", 0);
    private Resource water = new Resource("water", 0);
    private Consumption consumption;
    private Resource wood = new Resource("wood", 0);
    private Resource logs = new Resource("logs", 0);
    private Transformation transformation;



    public Sawmill(String name) {
        super(name);
        getRes().addAll(wood, logs, electricity, water);
        getMethods().addAll(consumption = new Consumption("consumption", getRes(), name), transformation = new Transformation("transformation", getRes(), name));

    }
    @Override
    public void consumeResourcesPeriodically(){

        consumption.doConsumption();
        transformation.doTransformation();
    }




}
