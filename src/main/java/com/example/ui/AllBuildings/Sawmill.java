package com.example.ui.AllBuildings;

import com.example.ui.AllMethods.Consumption;
import com.example.ui.AllMethods.Transformation;
import com.example.ui.Building;
import com.example.ui.Resource;

import java.util.Random;

public class Sawmill extends Building {
    private Resource electricity = new Resource("electricity", 500);
    private Resource water = new Resource("water", 500);
    private Consumption consumption;
    private Resource wood = new Resource("wood", 0);
    private Resource logs = new Resource("logs", 500);
    private Transformation transformation;



    public Sawmill(String name) {
        super(name);
        res.addAll(wood, logs, electricity, water);
        consumption = new Consumption(res, name);
        transformation = new Transformation(res, name);

    }
    @Override
    public void consumeResourcesPeriodically(){

        consumption.doConsumption();
        transformation.doTransformation();
    }




}
