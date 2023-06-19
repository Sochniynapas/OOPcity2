package com.example.ui.AllMethods;

import com.example.ui.Resource;
import javafx.collections.ObservableList;

import java.util.Random;

public class Consumption {

    private String methodName = "consumption";
    private ObservableList<Resource> resources;
    private String buildingName;

    public Consumption(ObservableList<Resource> resources, String buildingName) {

        this.buildingName = buildingName;
        this.resources = resources;

    }
    public void doConsumption(){
        Random random = new Random();
        int min = 400;
        int max = 800;
        int tempRandom = random.nextInt(max-min+1)+ min;
        for (Resource resource:resources)
        {
            if(resource.getName() == "water"){
                resource.setQuantity(resource.getQuantity() - tempRandom);
                System.out.println(buildingName + " Потребило " + resource.getName() + ": " + resource.getQuantity());
            }
            if(resource.getName() == "electricity"){
                resource.setQuantity(resource.getQuantity() - tempRandom);
                System.out.println(buildingName + " Потребило " + resource.getName() + ": " + resource.getQuantity());
            }

        }

    }

    public String getMethodName() {
        return methodName;
    }
}
