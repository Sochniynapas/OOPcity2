package com.example.ui.AllMethods;

import com.example.ui.Methods;
import com.example.ui.Resource;
import javafx.collections.ObservableList;

import java.util.Random;

public class Association extends Methods {

    private String methodName;
    private ObservableList<Resource> resources;
    private String buildingName;

    public Association(String name,ObservableList<Resource> resources, String buildingName) {
        super(name);
        this.methodName=name;
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

            switch (resource.getName()) {
                case ("nails") :
                    resource.setQuantity(resource.getQuantity() - tempRandom);
                    System.out.println(buildingName + " Потратил " + resource.getName() + ": " + tempRandom);
                    break;

                case ("wood") :
                    resource.setQuantity(resource.getQuantity() - tempRandom);
                    System.out.println(buildingName + " Потратил " + resource.getName() + ": " + tempRandom);
                    break;
                case ("furniture") :
                    resource.setQuantity(resource.getQuantity() + tempRandom - 29);
                    System.out.println(buildingName + " Создал " + resource.getName() + ": " + tempRandom);
                    break;
                case ("vegetables") :
                    resource.setQuantity(resource.getQuantity() - tempRandom);
                    System.out.println(buildingName + " Потратил " + resource.getName() + ": " + tempRandom);
                    break;
                case ("meat") :
                    resource.setQuantity(resource.getQuantity() - tempRandom);
                    System.out.println(buildingName + " Потратил " + resource.getName() + ": " + tempRandom);
                    break;
                case ("dishes") :
                    resource.setQuantity(resource.getQuantity() + tempRandom - 10);
                    System.out.println(buildingName + " Произвёл " + resource.getName() + ": " + tempRandom);
                    break;
            }

        }

    }


}
