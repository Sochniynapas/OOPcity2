package com.example.ui.AllBuildings;

import com.example.ui.AllMethods.Consumption;
import com.example.ui.AllMethods.Product;
import com.example.ui.Building;
import com.example.ui.Resource;

public class NailFactory extends Building {
    private Resource electricity = new Resource("electricity", 500);
    private Resource water = new Resource("water", 500);
    private Consumption consumption;
    private Resource nails = new Resource("nails", 0);
    private Product product;
    public NailFactory(String name) {
        super(name);
        res.addAll(nails,water,electricity);
        consumption = new Consumption(res, name);
        product = new Product(res, name);
    }
    @Override
    public void consumeResourcesPeriodically(){

        product.doProduction();
        consumption.doConsumption();



    }
}
