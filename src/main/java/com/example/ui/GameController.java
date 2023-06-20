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










    public GameController() {



        crAuthorBuilding = new Button();
        contFromName = new Button();
        cons = new Button();
        prod = new Button();
        sell = new Button();
        stor = new Button();
        proc = new Button();


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
