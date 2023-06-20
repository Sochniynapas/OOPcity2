package com.example.ui;



public class Transportation {




    public Transportation() {

    }

    public void TransportFromTo(){
        for (Building buildingFrom:GameEngine.getBuildings()) {
            for (Methods method: buildingFrom.getMethods()) {
                if(method.getName() == "product"){
                    for (Resource resource: buildingFrom.getRes()) {
                        if(resource.getName() == "petrol" || resource.getName() == "vegetables" || resource.getName() == "meat" || resource.getName() == "logs"){
                            resource.setQuantity(resource.getQuantity() - 500);
                            System.out.println("У "+ buildingFrom.getName() + " забрано: "+resource.getName() + ": "+ 500);
                            for (Building buildingTo : GameEngine.getBuildings()) {
                                if (buildingTo.getName() != buildingFrom.getName()) {
                                    for (Resource resource1 : buildingTo.getRes()) {
                                        if (resource.getName() == resource1.getName()) {
                                            resource1.setQuantity(resource1.getQuantity() + 500);
                                            System.out.println("Для "+ buildingTo.getName() + " передано: "+resource1.getName() + ": "+ 500);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                else if(method.getName() == "transformation"){
                    for (Resource resource: buildingFrom.getRes()) {
                        if(resource.getName() == "wood"){
                            resource.setQuantity(resource.getQuantity() - 300);
                            System.out.println("У "+ buildingFrom.getName() + " забрано: "+resource.getName() + ": "+ 300);
                            for (Building buildingTo : GameEngine.getBuildings()) {
                                if (buildingTo.getName() != buildingFrom.getName()) {
                                    for (Resource resource1 : buildingTo.getRes()) {
                                        if (resource.getName() == resource1.getName()) {
                                            int temp = 0;
                                            for (Methods methods: buildingTo.getMethods()) {
                                                if(methods.getName() == "product"){
                                                    temp = 1;
                                                }
                                            }
                                            if(temp == 0) {
                                                resource1.setQuantity(resource1.getQuantity() + 300);
                                                System.out.println("Для " + buildingTo.getName() + " передано: " + resource1.getName() + ": " + 300);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                else if (method.getName() == "productElectAndWater") {
                    for (Resource resource : buildingFrom.getRes()) {
                        if(resource.getName() == "electricity" || resource.getName() == "water"){
                            resource.setQuantity(resource.getQuantity() - 200);
                            System.out.println("У "+ buildingFrom.getName() + " забрано: "+resource.getName() + ": "+ 200);
                            for (Building buildingTo : GameEngine.getBuildings()) {
                                if (buildingTo.getName() != buildingFrom.getName()) {
                                    for (Resource resource1 : buildingTo.getRes()) {
                                        if (resource.getName() == resource1.getName()) {
                                            resource1.setQuantity(resource1.getQuantity() + 200);
                                            System.out.println("Для "+ buildingTo.getName() + " передано: "+resource1.getName() + ": "+ 200);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
