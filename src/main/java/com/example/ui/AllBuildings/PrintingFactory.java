package com.example.ui.AllBuildings;

import com.example.ui.AllMethods.Consumption;
import com.example.ui.AllMethods.Product;
import com.example.ui.Building;
import com.example.ui.Resource;


public class PrintingFactory extends Building {
    private Resource electricity = new Resource("electricity", 500);
    private Resource water = new Resource("water", 500);
    private Consumption consumption;
    private Resource money = new Resource("money", 0);
    private Product product;
    public PrintingFactory(String name){
        super(name);
        res.addAll(money, electricity, water);
        consumption = new Consumption(res, name);
        product = new Product(res, name);

    }
    @Override
    public void consumeResourcesPeriodically(){

        product.doProduction();
        consumption.doConsumption();

    }




}
