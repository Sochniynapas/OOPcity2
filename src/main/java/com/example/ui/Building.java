package com.example.ui;
import com.example.ui.AllMethods.Product;
import javafx.animation.Timeline;
import javafx.animation.KeyFrame;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.util.Duration;
import java.util.List;
import java.util.Random;

public class Building  {
    private String name;
    protected ObservableList<Resource> res = FXCollections.observableArrayList();
    protected Resource electricity;
    protected Resource water;
    private Product product;

    public Building(String name){

        this.name = name;

        this.electricity = new Resource("electricity", 500);
        this.water= new Resource("water", 500);
        res.addAll(electricity,water);

        this.product = new Product(res, name);


    }

    public void consumeResourcesPeriodically() {
        product.doProduction();
    }




    public String getName(){
        return name;
    }


}
