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


    public Building(String name){

        this.name = name;

    }

    public void consumeResourcesPeriodically() {
    }




    public String getName(){
        return name;
    }


}
