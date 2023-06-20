package com.example.ui.AllMethods;

import com.example.ui.Methods;
import com.example.ui.Resource;
import javafx.collections.ObservableList;

public class Processing extends Methods {
    private String methodName;
    private ObservableList<Resource> resources;
    private String buildingName;

    public Processing(String name, ObservableList<Resource> resources, String buildingName) {
        super(name);
        this.methodName =  name;
        this.buildingName = buildingName;
        this.resources = resources;

    }
    public void doProcessing(){

        for (Resource resource:resources)
        {
            switch (resource.getName()) {
                case ("water") :
                    System.out.println("На " + buildingName + " обработно и готово к транспортировке: " + resource.getQuantity() + " - " + resource.getName());
                    break;
                case ("electricity") :
                    System.out.println("На " + buildingName + " обработно и готово к транспортировке: " + resource.getQuantity() + " - " + resource.getName());
                    break;
            }


        }

    }


}
