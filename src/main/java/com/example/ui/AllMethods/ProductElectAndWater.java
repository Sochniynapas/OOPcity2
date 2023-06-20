package com.example.ui.AllMethods;

import com.example.ui.Methods;
import com.example.ui.Resource;
import javafx.collections.ObservableList;

import java.util.Random;

public class ProductElectAndWater extends Methods {
    private String methodName;
    private ObservableList<Resource> resources;
    private String buildingName;

    public ProductElectAndWater(String name, ObservableList<Resource> resources, String buildingName) {
        super(name);
        this.methodName = name;
        this.buildingName = buildingName;
        this.resources = resources;

    }
    public void doProduction() {
        Random random = new Random();
        int min = 500;
        int max = 1000;
        int tempRandom = random.nextInt(max - min + 1) + min;
        for (Resource resource : resources) {
            switch (resource.getName()) {
                case ("electricity"):
                    resource.setQuantity(resource.getQuantity() + tempRandom);
                    System.out.println(buildingName + " в данный момент произвело " + resource.getName() + ": " + tempRandom);
                    break;
                case ("water"):
                    resource.setQuantity(resource.getQuantity() + tempRandom);
                    System.out.println(buildingName + " в данный момент произвело " + resource.getName() + ": " + tempRandom);
                    break;
            }
        }
    }
}
