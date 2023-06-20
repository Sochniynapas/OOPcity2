package com.example.ui.AllBuildings;

import com.example.ui.AllMethods.Consumption;
import com.example.ui.AllMethods.Product;
import com.example.ui.Building;
import com.example.ui.Resource;

import java.util.Random;

public class PetrolStation extends Building {
    private Resource electricity = new Resource("electricity", 0);
    private Resource water = new Resource("water", 0);
    private Consumption consumption;
    private Resource petrol = new Resource("petrol", 0);
    private Product product;
    public PetrolStation(String name) {
        super(name);
        getRes().addAll(petrol,electricity,water);
        getMethods().addAll(consumption = new Consumption("consumption", getRes(), name), product = new Product("product", getRes(), name));
    }
    @Override
    public void consumeResourcesPeriodically(){

        product.doProduction();
        consumption.doConsumption();
    }
}
