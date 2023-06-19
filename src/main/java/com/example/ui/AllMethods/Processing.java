package com.example.ui.AllMethods;

import com.example.ui.Resource;
import javafx.collections.ObservableList;

import java.util.Random;

public class Processing {
    private String methodName = "processing";
    private ObservableList<Resource> resources;
    private String buildingName;

    public Processing(ObservableList<Resource> resources, String buildingName) {

        this.buildingName = buildingName;
        this.resources = resources;

    }
    public void doProcessing(){

        for (Resource resource:resources)
        {
            if(resource.getName() == "water"){
                System.out.println("На " + buildingName + " обработно и готово к транспортировке: " + resource.getQuantity() + " - " + resource.getName());
            }
            if(resource.getName()== "electricity"){
                System.out.println("На " + buildingName + " обработно и готово к транспортировке: " + resource.getQuantity() + " - " + resource.getName());
            }


        }

    }

    public String getMethodName() {
        return methodName;
    }
}
