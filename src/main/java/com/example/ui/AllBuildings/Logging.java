package com.example.ui.AllBuildings;

import com.example.ui.AllMethods.Product;
import com.example.ui.Building;
import com.example.ui.Resource;

import java.util.Random;

public class Logging extends Building {
    private Resource logs = new Resource("logs", 1000);
    private Product product;

    public Logging(String name) {
        super(name);
        res.addAll(logs);
        product = new Product(res,"logging");

    }
    @Override
    public void consumeResourcesPeriodically(){
        super.consumeResourcesPeriodically();
        product.doProduction();

    }


}
