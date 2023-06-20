package com.example.ui;

public class Resource {

    private String name;
    private int quantity;

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }



    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }



    public Resource(String name, int quanity){
        this.name = name;
        this.quantity =quanity;
    }




    //private String[] resources = {"Food", "Wood", "Fuel", "Oil", "Money", "Timber", "Water", "Electricity"};


}
