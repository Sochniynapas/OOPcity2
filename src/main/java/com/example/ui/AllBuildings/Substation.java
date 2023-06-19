package com.example.ui.AllBuildings;

import com.example.ui.AllMethods.Product;
import com.example.ui.Building;
import com.example.ui.Resource;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Substation extends Building {

    private Product productMet;

    private Resource wood = new Resource("wood", 0);
    private ObservableList<Resource> resources = FXCollections.observableArrayList();

    public Substation(String name) {
        super(name);
        resources.addAll(wood);
        this.productMet = new Product(resources,"substation");


    }
    @Override
    public void consumeResourcesPeriodically(){

        productMet.doProduction();
    }

}
