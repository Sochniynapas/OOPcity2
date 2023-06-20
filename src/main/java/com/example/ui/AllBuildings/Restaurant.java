package com.example.ui.AllBuildings;

import com.example.ui.AllMethods.Association;
import com.example.ui.AllMethods.Consumption;
import com.example.ui.Building;
import com.example.ui.Resource;

public class Restaurant extends Building {
    private Resource electricity = new Resource("electricity", 0);
    private Resource water = new Resource("water", 0);
    private Resource meat = new Resource("meat", 0);
    private Resource vegetables = new Resource("vegetables", 0);
    private Resource dishes = new Resource("dishes", 0);
    private Consumption consumption;
    private Association association;
    public Restaurant(String name) {
        super(name);
        getRes().addAll(electricity,water,meat,vegetables,dishes);
        getMethods().addAll(consumption = new Consumption("consumption", getRes(),name), association = new Association("association", getRes(), name));
    }
    @Override
    public void consumeResourcesPeriodically(){
        consumption.doConsumption();
        association.doAssociation();
    }

}
