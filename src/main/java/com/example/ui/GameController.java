package com.example.ui;

import com.example.ui.AllBuildings.*;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.util.Duration;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import java.util.ArrayList;



public class GameController {
    @FXML
    private Button backToMet;

    @FXML
    private Button coalRes;

    @FXML
    private Button cons;

    @FXML
    private Button contFromName;

    @FXML
    private Button crAuthorBuilding;

    @FXML
    private Button createBuilding;

    @FXML
    private Button dishRes;

    @FXML
    private Button electricityRes;

    @FXML
    private Button foodRes;

    @FXML
    private Button furnitureRes;

    @FXML
    private Button grainRes;

    @FXML
    private VBox listMethods;

    @FXML
    private VBox listOfRes;

    @FXML
    private Button medicinesRes;

    @FXML
    private Button proc;

    @FXML
    private Button prod;

    @FXML
    private TextField selectName;

    @FXML
    private Button sell;

    @FXML
    private Button stor;

    @FXML
    private Button treeRes;

    @FXML
    private Button wasteRes;

    @FXML
    private Button waterRes;

    @FXML
    private AnchorPane winForName;

    @FXML
    private AnchorPane winOfRes;

    @FXML
    private AnchorPane winWithMethods;

    @FXML
    private Button woodRes;







    private String[] res = {"Food", "Wood", "Fuel", "Oil", "Money", "Timber", "Water", "Electricity"};
    private ObservableList<Building> buildings = FXCollections.observableArrayList();
    private HPP hpp;
    private PrintingFactory pf;
    private GasStation gs;
    private Logging logging;
    private PetrolStation petrolStation;
    private Sawmill sawmill;
    private FurnitureStore furnitureStore;
    private Substation substation;
    private TankFarm tf;
    private Slaughterhouse sh;
    private WaterUtility wt;
    private VegetablesFarm vf;
    private NailFactory nf;

    public GameController() {
        this.hpp = new HPP("hpp");
        this.pf = new PrintingFactory("printingFactory");
        this.gs = new GasStation("gasStation");
        this.logging = new Logging("logging");
        this.petrolStation = new PetrolStation("petrolStation");
        this.sawmill = new Sawmill("sawmill");
        this.furnitureStore= new FurnitureStore("furnitureStore");
        this.substation = new Substation("substation");
        this.tf = new TankFarm("tankFarm");
        this.sh = new Slaughterhouse("slaughterHouse");
        this.wt = new WaterUtility("waterUtility");
        this.vf = new VegetablesFarm("vegetablesFarm");
        this.nf = new NailFactory("nailFactory");


        crAuthorBuilding = new Button();
        contFromName = new Button();
        cons = new Button();
        prod = new Button();
        sell = new Button();
        stor = new Button();
        proc = new Button();



        buildings.addAll(hpp, pf, gs, logging, petrolStation, sawmill, furnitureStore, substation, tf, sh, wt, vf, nf);

    }
    public void StartGame(){
        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(1), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                for (Building build: buildings) {
                    if (build.getName() == "substation") {
                        build.consumeResourcesPeriodically();

                    }
                }
            }
        }));
        timeline.setCycleCount(Timeline.INDEFINITE);

        timeline.play();
    }

    public void buildNewBuilding(){

        ArrayList<String> resources = new ArrayList<>();
        ArrayList<String> methods = new ArrayList<>();
        String name;


        System.out.println("hello");



    }

    @FXML
    void initialize() {

        crAuthorBuilding.setOnAction((event)->{
            winForName.setVisible(true);
            crAuthorBuilding.setVisible(false);
        });
        contFromName.setOnAction((event)->{
            winForName.setVisible(false);
            winWithMethods.setVisible(true);
        });
        cons.setOnAction((event)->{
            winWithMethods.setVisible(false);

        });
        prod.setOnAction((event)->{
            winWithMethods.setVisible(false);

        });
        sell.setOnAction((event)->{
            winWithMethods.setVisible(false);

        });
        stor.setOnAction((event)->{
            winWithMethods.setVisible(false);

        });
        proc.setOnAction((event)->{
            winWithMethods.setVisible(false);

        });


    }


}
