package com.example.ui.AllBuildings;

import com.example.ui.AllMethods.Consumption;
import com.example.ui.AllMethods.Product;
import com.example.ui.Building;
import com.example.ui.Resource;

import java.util.Random;

public class GasStation extends Building {
    private Resource electricity = new Resource("electricity", 500);
    private Resource water = new Resource("water", 500);
    private Consumption consumption;
    private Resource fuel = new Resource("fuel", 0);
    private Resource petrol = new Resource("petrol", 1000);

    private Product product;

    public GasStation(String name) {
        super(name);
        res.addAll(fuel, petrol, electricity, water);
        consumption = new Consumption(res, name);
        product = new Product(res, name);

    }
    @Override
    public void consumeResourcesPeriodically(){

        consumption.doConsumption();
        product.doProduction();





    }




}
