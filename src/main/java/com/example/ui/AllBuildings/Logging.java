package com.example.ui.AllBuildings;

import com.example.ui.AllMethods.Consumption;
import com.example.ui.AllMethods.Product;
import com.example.ui.Building;
import com.example.ui.Resource;

import java.util.Random;

public class Logging extends Building {


    private Resource logs = new Resource("logs", 0);
    private Product product;

    public Logging(String name) {
        super(name);
        getRes().addAll(logs);
        getMethods().addAll(product = new Product("product", getRes(),name));


    }
    @Override
    public void consumeResourcesPeriodically(){

        product.doProduction();


    }


}
