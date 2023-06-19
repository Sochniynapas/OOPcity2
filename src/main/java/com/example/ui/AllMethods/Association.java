package com.example.ui.AllMethods;

import com.example.ui.Resource;
import javafx.collections.ObservableList;

import java.util.Random;

public class Association {

    private String methodName = "product";
    private ObservableList<Resource> resources;
    private String buildingName;

    public Association(ObservableList<Resource> resources, String buildingName) {

        this.buildingName = buildingName;
        this.resources = resources;

    }
    public void doAssociation(){
        Random random = new Random();
        int min = 30;
        int max = 45;
        int tempRandom = random.nextInt(max-min+1)+ min;
        for (Resource resource:resources)
        {


            if(resource.getName() == "nails"){
                resource.setQuantity(resource.getQuantity() - tempRandom);
                System.out.println(buildingName + " Потратил " + resource.getName() + ": " + resource.getQuantity());
            }
            if(resource.getName() == "wood"){
                resource.setQuantity(resource.getQuantity() - tempRandom);
                System.out.println(buildingName + " Потратил " + resource.getName() + ": " + resource.getQuantity());
            }
            if(resource.getName() == "furniture"){
                resource.setQuantity(resource.getQuantity() + tempRandom - 29);
                System.out.println(buildingName + " Создал " + resource.getName() + ": " + resource.getQuantity());
            }
            if(resource.getName() == "vegetables"){
                resource.setQuantity(resource.getQuantity() - tempRandom);
                System.out.println(buildingName + " Потратил " + resource.getName() + ": " + resource.getQuantity());
            }
            if(resource.getName() == "meat"){
                resource.setQuantity(resource.getQuantity() - tempRandom);
                System.out.println(buildingName + " Потратил " + resource.getName() + ": " + resource.getQuantity());
            }
            if(resource.getName() == "dishes"){
                resource.setQuantity(resource.getQuantity() + tempRandom-10);
                System.out.println(buildingName + " Произвёл " + resource.getName() + ": " + resource.getQuantity());
            }

        }

    }

    public String getMethodName() {
        return methodName;
    }
}
