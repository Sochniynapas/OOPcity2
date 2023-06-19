package com.example.ui.AllBuildings;

import com.example.ui.AllMethods.Product;
import com.example.ui.Building;
import com.example.ui.Resource;

import java.util.Random;

public class GasStation extends Building {

    private Resource fuel = new Resource("fuel", 0);
    private Resource petrol = new Resource("petorl", 1000);

    private Product product;

    public GasStation(String name) {
        super(name);
        res.addAll(fuel, petrol);
        product = new Product(res, "gasStation");

    }
    @Override
    public void consumeResourcesPeriodically(){
        super.consumeResourcesPeriodically();
        product.doProduction();


    }




}
