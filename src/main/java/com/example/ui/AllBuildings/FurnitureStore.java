package com.example.ui.AllBuildings;

import com.example.ui.AllMethods.Association;
import com.example.ui.AllMethods.Consumption;
import com.example.ui.Building;
import com.example.ui.Resource;


public class FurnitureStore extends Building {
    private Resource electricity = new Resource("electricity", 500);
    private Resource water = new Resource("water", 500);
    private Consumption consumption;
    private Association association;
    private Resource nails = new Resource("nails", 1000);
    private Resource wood = new Resource("wood", 1000);
    private Resource furniture = new Resource("wood", 0);

    public FurnitureStore(String name) {
        super(name);
        res.addAll(nails, wood, furniture, electricity, water);
        this.association = new Association(res, name);
        this.consumption = new Consumption(res, name);
    }
    @Override
    public void consumeResourcesPeriodically(){

        association.doAssociation();
        consumption.doConsumption();
    }

}
