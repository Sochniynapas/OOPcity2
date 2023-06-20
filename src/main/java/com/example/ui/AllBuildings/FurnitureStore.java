package com.example.ui.AllBuildings;

import com.example.ui.AllMethods.Association;
import com.example.ui.AllMethods.Consumption;
import com.example.ui.Building;
import com.example.ui.Resource;


public class FurnitureStore extends Building {
    private Resource electricity = new Resource("electricity", 0);
    private Resource water = new Resource("water", 0);
    private Consumption consumption;
    private Association association;
    private Resource nails = new Resource("nails", 1000);
    private Resource wood = new Resource("wood", 0);
    private Resource furniture = new Resource("furniture", 0);


    public FurnitureStore(String name) {
        super(name);
        getRes().addAll(nails, wood, furniture, electricity, water);
        getMethods().addAll(this.association = new Association("association", getRes(), name), this.consumption = new Consumption("consumption", getRes(), name));

    }
    @Override
    public void consumeResourcesPeriodically(){

        association.doAssociation();
        consumption.doConsumption();
    }

}
