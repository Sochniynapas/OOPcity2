package com.example.ui.AllBuildings;

import com.example.ui.AllMethods.Product;
import com.example.ui.Building;
import com.example.ui.Resource;

import java.util.Random;

public class HPP extends Building {
    private Product product;

    public HPP(String name) {
        super(name);
        product = new Product(res, "hpp");
    }
    @Override
    public void consumeResourcesPeriodically(){
        product.doProduction();

    }


}
