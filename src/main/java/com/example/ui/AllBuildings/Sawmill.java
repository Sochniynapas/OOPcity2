package com.example.ui.AllBuildings;

import com.example.ui.Building;
import com.example.ui.Resource;

import java.util.Random;

public class Sawmill extends Building {
    private Resource wood = new Resource("wood", 0);
    private Resource logs = new Resource("logs", 500);



    public Sawmill(String name) {
        super(name);
    }
    @Override
    public void consumeResourcesPeriodically(){
        super.consumeResourcesPeriodically();
        makingWood();
    }



    public void makingWood(){
        Random random = new Random();
        int min = 35;
        int max = 50;
        int tempRandom=(random.nextInt(max - min + 1) + min);
        logs.setQuantity(logs.getQuantity() - tempRandom);
        wood.setQuantity(wood.getQuantity() + tempRandom);
        System.out.println("Брёвен на " + getName() + ": " + logs.getQuantity());
        System.out.println("Досок на " + getName() + ": " + wood.getQuantity());
    }
}
