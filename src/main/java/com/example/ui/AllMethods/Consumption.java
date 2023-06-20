package com.example.ui.AllMethods;

import com.example.ui.Methods;
import com.example.ui.Resource;
import javafx.collections.ObservableList;

import java.util.Random;

public class Consumption extends Methods {

    private String methodName;
    private ObservableList<Resource> resources;
    private String buildingName;

    public Consumption(String name, ObservableList<Resource> resources, String buildingName) {
        super(name);
        this.methodName = name;
        this.buildingName = buildingName;
        this.resources = resources;

    }
    public void doConsumption(){
        Random random = new Random();
        int min = 50;
        int max = 120;
        int tempRandom = random.nextInt(max-min+1)+ min;
        for (Resource resource:resources)
        {
            switch (resource.getName()) {
                case ("water") :
                    resource.setQuantity(resource.getQuantity() - tempRandom);
                    System.out.println(buildingName + " Потребило " + resource.getName() + ": " + tempRandom);
                    break;
                case ("electricity") :
                    resource.setQuantity(resource.getQuantity() - tempRandom);
                    System.out.println(buildingName + " Потребило " + resource.getName() + ": " + tempRandom);
                    break;
            }

        }

    }


}
