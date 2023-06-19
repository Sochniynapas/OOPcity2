package com.example.ui.AllBuildings;

import com.example.ui.AllMethods.Association;
import com.example.ui.AllMethods.Consumption;
import com.example.ui.Building;
import com.example.ui.Resource;

public class Restaurant extends Building {
    private Resource electricity = new Resource("electricity", 500);
    private Resource water = new Resource("water", 500);
    private Resource meat = new Resource("meat", 0);
    private Resource vegetables = new Resource("vegetables", 0);
    private Resource dishes = new Resource("dishes", 0);
    private Consumption consumption;
    private Association association;
    public Restaurant(String name) {
        super(name);
        res.addAll(electricity,water,meat,vegetables,dishes);
        consumption = new Consumption(res,name);
        association = new Association(res, name);
    }
    @Override
    public void consumeResourcesPeriodically(){
        consumption.doConsumption();
        association.doAssociation();
    }

}
