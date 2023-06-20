package com.example.ui;
import com.example.ui.AllBuildings.*;
import com.example.ui.Building;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.util.Duration;

public class GameEngine {
    static private ObservableList<Building> buildings = FXCollections.observableArrayList();
    static private HPP hpp;
    static private PrintingFactory pf;
    static private GasStation gs;
    static private Logging logging;
    static private PetrolStation petrolStation;
    static private Sawmill sawmill;
    static private FurnitureStore furnitureStore;
    static private Substation substation;
    static private Restaurant restaurant;
    static private Slaughterhouse sh;
    static private WaterUtility wt;
    static private VegetablesFarm vf;
    static private NailFactory nf;
    static private WaterIntakeStation wis;
    private Transportation transport = new Transportation();

    public static HPP getHpp() {
        return hpp;
    }
    public static WaterIntakeStation getWis() {
        return wis;
    }

    public static PrintingFactory getPf() {
        return pf;
    }

    public static GasStation getGs() {
        return gs;
    }

    public static Logging getLogging() {
        return logging;
    }

    public static PetrolStation getPetrolStation() {
        return petrolStation;
    }

    public static Sawmill getSawmill() {
        return sawmill;
    }

    public static FurnitureStore getFurnitureStore() {
        return furnitureStore;
    }

    public static Substation getSubstation() {
        return substation;
    }

    public static Restaurant getRestaurant() {
        return restaurant;
    }

    public static Slaughterhouse getSh() {
        return sh;
    }

    public static WaterUtility getWt() {
        return wt;
    }

    public static VegetablesFarm getVf() {
        return vf;
    }

    public static NailFactory getNf() {
        return nf;
    }

    public GameEngine() {
        this.hpp = new HPP("hpp");
        this.pf = new PrintingFactory("printingFactory");
        this.gs = new GasStation("gasStation");
        this.logging = new Logging("logging");
        this.petrolStation = new PetrolStation("petrolStation");
        this.sawmill = new Sawmill("sawmill");
        this.furnitureStore= new FurnitureStore("furnitureStore");
        this.substation = new Substation("substation");
        this.restaurant = new Restaurant("restaurant");
        this.sh = new Slaughterhouse("slaughterHouse");
        this.wt = new WaterUtility("waterUtility");
        this.vf = new VegetablesFarm("vegetablesFarm");
        this.nf = new NailFactory("nailFactory");
        this.wis = new WaterIntakeStation("waterIntakeStation");
        this.wt = new WaterUtility("waterUtility");


        buildings.addAll(hpp, pf, gs, logging, petrolStation, sawmill, furnitureStore, substation, restaurant, sh, wt, vf, nf, wis);
    }
    public void StartGame(){

        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(1), new EventHandler<ActionEvent>() {
            @Override
            public  void handle(ActionEvent event) {
                for (Building build: buildings) {

                    build.consumeResourcesPeriodically();

                }
                transport.TransportFromTo();
                System.out.println("----------------------------------------------------------------------------------");
            }
        }));
        timeline.setCycleCount(Timeline.INDEFINITE);

        timeline.play();
    }

    public static ObservableList<Building> getBuildings() {
        return buildings;
    }
}
