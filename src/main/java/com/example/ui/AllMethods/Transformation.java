package com.example.ui.AllMethods;

import com.example.ui.Methods;
import com.example.ui.Resource;
import javafx.collections.ObservableList;

import java.util.Random;

public class Transformation extends Methods {

    private String methodName;
    private ObservableList<Resource> resources;
    private String buildingName;

    public Transformation(String name, ObservableList<Resource> resources, String buildingName) {
        super(name);
        this.methodName = name;
        this.buildingName = buildingName;
        this.resources = resources;

    }
    public void doTransformation(){
        Random random = new Random();
        int min = 200;
        int max = 250;
        int tempRandom = random.nextInt(max-min+1)+ min;
        for (Resource resource:resources)
        {
            switch (resource.getName()) {
                case ("logs") :
                    resource.setQuantity(resource.getQuantity() - tempRandom);
                    System.out.println("У " + buildingName + " использовалось " + resource.getName() + ": " + tempRandom);
                    break;
                case ("wood") :
                    resource.setQuantity(resource.getQuantity() + tempRandom);
                    System.out.println("У " + buildingName + " всего переработано " + resource.getName() + ": " + tempRandom);
                    break;
                case ("petrol") :
                    resource.setQuantity(resource.getQuantity() - tempRandom);
                    System.out.println("У " + buildingName + " использовалось " + resource.getName() + ": " + tempRandom);
                    break;
                case ("fuel") :
                    resource.setQuantity(resource.getQuantity() + tempRandom);
                    System.out.println("У " + buildingName + " всего переработано " + resource.getName() + ": " + tempRandom);
                    break;
            }


        }

    }


}
