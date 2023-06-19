package com.example.ui.AllMethods;

import com.example.ui.Resource;
import javafx.collections.ObservableList;

import java.util.Random;

public class Product {

    private String methodName = "product";
    private ObservableList<Resource> resources;
    private String buildingName;

    public Product(ObservableList<Resource> resources, String buildingName) {

        this.buildingName = buildingName;
        this.resources = resources;

    }
    public void doProduction(){
        Random random = new Random();
        int min = 500;
        int max = 1000;
        int tempRandom = random.nextInt(max-min+1)+ min;
        for (Resource resource:resources)
        {
            if(resource.getName() == "electricity"){
                resource.setQuantity(resource.getQuantity() + tempRandom);
                System.out.println(buildingName + " в данный момент произвело " + resource.getName() + ": " + resource.getQuantity());
            }
            if(resource.getName() == "water"){
                resource.setQuantity(resource.getQuantity() + tempRandom);
                System.out.println(buildingName + " в данный момент произвело " + resource.getName() + ": " + resource.getQuantity());
            }
            if(resource.getName() == "money"){
                resource.setQuantity(resource.getQuantity() + tempRandom/40);
                System.out.println(buildingName + " в данный момент произвело " + resource.getName() + ": " + resource.getQuantity());
                break;
            }
            if(resource.getName() == "nails"){
                resource.setQuantity(resource.getQuantity() + tempRandom/40);
                System.out.println(buildingName + " в данный момент произвело " + resource.getName() + ": " + resource.getQuantity());
                break;
            }
            if(resource.getName() == "petrol"){
                resource.setQuantity(resource.getQuantity() + tempRandom);
                System.out.println(buildingName + " в данный момент произвело " + resource.getName() + ": " + resource.getQuantity());
                break;
            }
            if(resource.getName() == "meat"){
                resource.setQuantity(resource.getQuantity() + tempRandom);
                System.out.println(buildingName + " в данный момент произвело " + resource.getName() + ": " + resource.getQuantity());
                break;
            }


        }

    }

    public String getMethodName() {
        return methodName;
    }
}
