package com.example.ui.AllBuildings;

import com.example.ui.AllMethods.Product;
import com.example.ui.Building;
import com.example.ui.Resource;

import java.util.Random;

public class PetrolStation extends Building {
    private Resource petrol = new Resource("petrol", 0);
    private Product product;
    public PetrolStation(String name) {
        super(name);
        res.addAll(petrol);
        product = new Product(res, "petrolStation");
    }
    @Override
    public void consumeResourcesPeriodically(){
       product.doProduction();
    }
}
