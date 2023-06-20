package com.example.ui;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public abstract class Building  {
    private String name;
    private ObservableList<Resource> res = FXCollections.observableArrayList();
    private ObservableList<Methods> methods = FXCollections.observableArrayList();


    public Building(String name){

        this.name = name;

    }

    public void consumeResourcesPeriodically() {
    }

    public ObservableList<Methods> getMethods() {
        return methods;
    }

    public String getName(){
        return name;
    }

    public ObservableList<Resource> getRes() {
        return res;

    }
}
