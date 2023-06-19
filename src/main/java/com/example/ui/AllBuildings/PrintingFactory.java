package com.example.ui.AllBuildings;

import com.example.ui.AllMethods.Product;
import com.example.ui.Building;
import com.example.ui.Resource;


public class PrintingFactory extends Building {
    private Resource money = new Resource("money", 0);
    private Product product;
    public PrintingFactory(String name){
        super(name);
        res.addAll(money);
        product = new Product(res, "printingFactory");

    }
    @Override
    public void consumeResourcesPeriodically(){
        super.consumeResourcesPeriodically();
        product.doProduction();

    }




}
