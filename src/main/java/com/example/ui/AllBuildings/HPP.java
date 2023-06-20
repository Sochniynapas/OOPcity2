package com.example.ui.AllBuildings;

import com.example.ui.AllMethods.Product;
import com.example.ui.AllMethods.ProductElectAndWater;
import com.example.ui.Building;
import com.example.ui.Resource;
import com.example.ui.Transportation;

import java.util.Random;

public class HPP extends Building {
    private ProductElectAndWater productElectAndWater;

    private Resource electricity = new Resource("electricity", 0);

    public HPP(String name) {
        super(name);
        getRes().addAll(electricity);
        getMethods().addAll(productElectAndWater = new ProductElectAndWater("productElectAndWater", getRes(), "hpp"));

    }
    @Override
    public void consumeResourcesPeriodically(){
        productElectAndWater.doProduction();


    }


}
