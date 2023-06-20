package com.example.ui.AllBuildings;

import com.example.ui.AllMethods.Consumption;
import com.example.ui.AllMethods.Product;
import com.example.ui.Building;
import com.example.ui.Resource;

public class VegetablesFarm extends Building {
    private Resource electricity = new Resource("electricity", 0);
    private Resource water = new Resource("water", 0);
    private Resource vegetables = new Resource("vegetables", 0);
    private Consumption consumption;
    private Product product;

    public VegetablesFarm(String name) {
        super(name);
        getRes().addAll(vegetables, electricity,water);
        getMethods().addAll(consumption = new Consumption("consumption", getRes(), name), product = new Product("product", getRes(), name));

    }
    @Override
    public void consumeResourcesPeriodically(){

        consumption.doConsumption();
        product.doProduction();

    }
}
