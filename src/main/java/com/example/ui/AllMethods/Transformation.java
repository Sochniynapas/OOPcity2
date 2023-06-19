package com.example.ui.AllMethods;

import com.example.ui.Resource;
import javafx.collections.ObservableList;

import java.util.Random;

public class Transformation {

    private String methodName = "transformation";
    private ObservableList<Resource> resources;
    private String buildingName;

    public Transformation(ObservableList<Resource> resources, String buildingName) {

        this.buildingName = buildingName;
        this.resources = resources;

    }
    public void doTransformation(){
        Random random = new Random();
        int min = 30;
        int max = 50;
        int tempRandom = random.nextInt(max-min+1)+ min;
        for (Resource resource:resources)
        {
            if(resource.getName()=="wood"){
                resource.setQuantity(resource.getQuantity() - tempRandom);
                System.out.println("У " + buildingName + " использовалось " + resource.getName() + ": " + resource.getQuantity());
            }
            if(resource.getName() == "logs"){
                resource.setQuantity(resource.getQuantity() + tempRandom);
                System.out.println("У " + buildingName + " всего переработано " + resource.getName() + ": " + resource.getQuantity());
            }
            if(resource.getName() == "petrol"){
                resource.setQuantity(resource.getQuantity() - tempRandom);
                System.out.println("У " + buildingName + " использовалось " + resource.getName() + ": " + resource.getQuantity());
            }
            if(resource.getName() == "fuel"){
                resource.setQuantity(resource.getQuantity() + tempRandom);
                System.out.println("У " + buildingName + " всего переработано " + resource.getName() + ": " + resource.getQuantity());
            }


        }

    }

    public String getMethodName() {
        return methodName;
    }
}
