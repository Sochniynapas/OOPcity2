package com.example.ui.AllBuildings;

import com.example.ui.AllMethods.Association;
import com.example.ui.Building;
import com.example.ui.Resource;

import java.util.Random;

public class FurnitureStore extends Building {

    private Association association;
    private Resource nails = new Resource("nails", 1000);
    private Resource wood = new Resource("wood", 1000);
    private Resource furniture = new Resource("wood", 0);

    public FurnitureStore(String name) {
        super(name);
        res.addAll(nails, wood, furniture);
        this.association = new Association(res, name);
    }
    @Override
    public void consumeResourcesPeriodically(){
        super.consumeResourcesPeriodically();
        association.doAssociation();
    }

}
