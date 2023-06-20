package com.example.ui.AllBuildings;

import com.example.ui.AllMethods.Processing;
import com.example.ui.AllMethods.ProductElectAndWater;
import com.example.ui.Building;
import com.example.ui.Resource;

public class WaterIntakeStation extends Building {
    private Resource water = new Resource("water", 0);
    private ProductElectAndWater productElectAndWater;
    public WaterIntakeStation(String name) {
        super(name);
        getRes().addAll(water);
        getMethods().addAll(productElectAndWater = new ProductElectAndWater("productElectAndWater", getRes(), name));
    }
    @Override
    public void consumeResourcesPeriodically(){
        productElectAndWater.doProduction();
    }
}
