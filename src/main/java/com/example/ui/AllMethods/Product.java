package com.example.ui.AllMethods;

import com.example.ui.Methods;
import com.example.ui.Resource;
import javafx.collections.ObservableList;

import java.util.Random;

public class Product extends Methods {

    private String methodName;
    private ObservableList<Resource> resources;
    private String buildingName;

    public Product(String name, ObservableList<Resource> resources, String buildingName) {

        super(name);
        this.methodName = name;
        this.buildingName = buildingName;
        this.resources = resources;

    }
    public void doProduction(){
        Random random = new Random();
        int min = 500;
        int max = 700;
        int tempRandom = random.nextInt(max-min+1)+ min;
        for (Resource resource:resources)
        {
            switch (resource.getName()) {

                case ("money"):
                    resource.setQuantity(resource.getQuantity() + tempRandom / 40);
                    System.out.println(buildingName + " в данный момент произвело " + resource.getName() + ": " + tempRandom / 40);
                    break;

                case ("nails"):
                    resource.setQuantity(resource.getQuantity() + tempRandom / 40);
                    System.out.println(buildingName + " в данный момент произвело " + resource.getName() + ": " + tempRandom);
                    break;

                case ("petrol"):
                    resource.setQuantity(resource.getQuantity() + tempRandom);
                    System.out.println(buildingName + " в данный момент произвело " + resource.getName() + ": " + tempRandom);
                    break;

                case ("meat"):
                    resource.setQuantity(resource.getQuantity() + tempRandom);
                    System.out.println(buildingName + " в данный момент произвело " + resource.getName() + ": " + tempRandom);
                    break;


                case ("vegetables"):
                    resource.setQuantity(resource.getQuantity() + tempRandom);
                    System.out.println(buildingName + " в данный момент произвело " + resource.getName() + ": " + tempRandom);
                    break;

                case ("logs"):
                    resource.setQuantity(resource.getQuantity() + tempRandom);
                    System.out.println(buildingName + " в данный момент произвело " + resource.getName() + ": " + tempRandom);
                    break;
            }


        }

    }


}
