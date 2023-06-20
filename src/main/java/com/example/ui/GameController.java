package com.example.ui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class GameController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Text Texter;

    @FXML
    private Button backToMet;

    @FXML
    private Button cons;

    @FXML
    private Button contFromName;

    @FXML
    private Button crAuthorBuilding;

    @FXML
    private Button createBuilding;

    @FXML
    private Button foodRes;

    @FXML
    private AnchorPane forBuildingsText;

    @FXML
    private Button fuelRes;

    @FXML
    private Button fs;

    @FXML
    private GridPane gridWithBuildings;

    @FXML
    private Button gs;

    @FXML
    private Button hpp;

    @FXML
    private VBox listMethods;

    @FXML
    private VBox listOfRes;

    @FXML
    private Button log;

    @FXML
    private Button logsRes;

    @FXML
    private Button medicinesRes;

    @FXML
    private Button moneyRes;

    @FXML
    private Button nf;

    @FXML
    private Button petrolRes;

    @FXML
    private Button pf;

    @FXML
    private Button proc;

    @FXML
    private Button prod;

    @FXML
    private Button ps;

    @FXML
    private Button rest;

    @FXML
    private Button saw;

    @FXML
    private Button sb;

    @FXML
    private TextField selectName;

    @FXML
    private Button sell;

    @FXML
    private Button sh;

    @FXML
    private Button stor;

    @FXML
    private Button veget;

    @FXML
    private AnchorPane winForName;

    @FXML
    private AnchorPane winOfRes;

    @FXML
    private AnchorPane winWithMethods;

    @FXML
    private Button woodRes;

    @FXML
    private Button ws;

    @FXML
    private Button wu;

    @FXML
    void initialize() {
        fs.setOnAction(event -> {
            String text = "";
            for (Building building: GameEngine.getBuildings()) {
                if(building == GameEngine.getFurnitureStore()) {
                    text+="Здание: " + building.getName() + "\n";
                    for (Resource res : building.getRes()) {
                        text+="всего " + res.getName() + ": " + res.getQuantity() + "\n";
                    }
                    for (Methods methods: building.getMethods()){
                        text+="Метод: " + methods.getName() + "\n";
                    }
                }
            }

            Texter.setText(text);
        });
        gs.setOnAction(event -> {
            String text = "";
            for (Building building: GameEngine.getBuildings()) {
                if(building == GameEngine.getGs()) {
                    text+="Здание: " + building.getName() + "\n";
                    for (Resource res : building.getRes()) {
                        text+="всего " + res.getName() + ": " + res.getQuantity() + "\n";
                    }
                    for (Methods methods: building.getMethods()){
                        text+="Метод: " + methods.getName() + "\n";
                    }
                }
            }

            Texter.setText(text);
        });
        hpp.setOnAction(event -> {
            String text = "";
            for (Building building: GameEngine.getBuildings()) {
                if(building == GameEngine.getHpp()) {
                    text+="Здание: " + building.getName() + "\n";
                    for (Resource res : building.getRes()) {
                        text+="всего " + res.getName() + ": " + res.getQuantity() + "\n";
                    }
                    for (Methods methods: building.getMethods()){
                        text+="Метод: " + methods.getName() + "\n";
                    }
                }
            }

            Texter.setText(text);
        });
        log.setOnAction(event -> {
            String text = "";
            for (Building building: GameEngine.getBuildings()) {
                if(building == GameEngine.getLogging()) {
                    text+="Здание: " + building.getName() + "\n";
                    for (Resource res : building.getRes()) {
                        text+="всего " + res.getName() + ": " + res.getQuantity() + "\n";
                    }
                    for (Methods methods: building.getMethods()){
                        text+="Метод: " + methods.getName() + "\n";
                    }
                }
            }

            Texter.setText(text);
        });
        nf.setOnAction(event -> {
            String text = "";
            for (Building building: GameEngine.getBuildings()) {
                if(building == GameEngine.getNf()) {
                    text+="Здание: " + building.getName() + "\n";
                    for (Resource res : building.getRes()) {
                        text+="всего " + res.getName() + ": " + res.getQuantity() + "\n";
                    }
                    for (Methods methods: building.getMethods()){
                        text+="Метод: " + methods.getName() + "\n";
                    }
                }
            }

            Texter.setText(text);
        });
        ps.setOnAction(event -> {
            String text = "";
            for (Building building: GameEngine.getBuildings()) {
                if(building == GameEngine.getPetrolStation()) {
                    text+="Здание: " + building.getName() + "\n";
                    for (Resource res : building.getRes()) {
                        text+="всего " + res.getName() + ": " + res.getQuantity() + "\n";
                    }
                    for (Methods methods: building.getMethods()){
                        text+="Метод: " + methods.getName() + "\n";
                    }
                }
            }

            Texter.setText(text);
        });
        pf.setOnAction(event -> {
            String text = "";
            for (Building building: GameEngine.getBuildings()) {
                if(building == GameEngine.getPf()) {
                    text+="Здание: " + building.getName() + "\n";
                    for (Resource res : building.getRes()) {
                        text+="всего " + res.getName() + ": " + res.getQuantity() + "\n";
                    }
                    for (Methods methods: building.getMethods()){
                        text+="Метод: " + methods.getName() + "\n";
                    }
                }
            }

            Texter.setText(text);
        });
        rest.setOnAction(event -> {
            String text = "";
            for (Building building: GameEngine.getBuildings()) {
                if(building == GameEngine.getRestaurant()) {
                    text+="Здание: " + building.getName() + "\n";
                    for (Resource res : building.getRes()) {
                        text+="всего " + res.getName() + ": " + res.getQuantity() + "\n";
                    }
                    for (Methods methods: building.getMethods()){
                        text+="Метод: " + methods.getName() + "\n";
                    }
                }
            }

            Texter.setText(text);
        });
        saw.setOnAction(event -> {
            String text = "";
            for (Building building: GameEngine.getBuildings()) {
                if(building == GameEngine.getSawmill()) {
                    text+="Здание: " + building.getName() + "\n";
                    for (Resource res : building.getRes()) {
                        text+="всего " + res.getName() + ": " + res.getQuantity() + "\n";
                    }
                    for (Methods methods: building.getMethods()){
                        text+="Метод: " + methods.getName() + "\n";
                    }
                }
            }

            Texter.setText(text);
        });
        sh.setOnAction(event -> {
            String text = "";
            for (Building building: GameEngine.getBuildings()) {
                if(building == GameEngine.getSh()) {
                    text+="Здание: " + building.getName() + "\n";
                    for (Resource res : building.getRes()) {
                        text+="всего " + res.getName() + ": " + res.getQuantity() + "\n";
                    }
                    for (Methods methods: building.getMethods()){
                        text+="Метод: " + methods.getName() + "\n";
                    }
                }
            }

            Texter.setText(text);
        });
        sb.setOnAction(event -> {
            String text = "";
            for (Building building: GameEngine.getBuildings()) {
                if(building == GameEngine.getSubstation()) {
                    text+="Здание: " + building.getName() + "\n";
                    for (Resource res : building.getRes()) {
                        text+="всего " + res.getName() + ": " + res.getQuantity() + "\n";
                    }
                    for (Methods methods: building.getMethods()){
                        text+="Метод: " + methods.getName() + "\n";
                    }
                }
            }

            Texter.setText(text);
        });
        veget.setOnAction(event -> {
            String text = "";
            for (Building building: GameEngine.getBuildings()) {
                if(building == GameEngine.getVf()) {
                    text+="Здание: " + building.getName() + "\n";
                    for (Resource res : building.getRes()) {
                        text+="всего " + res.getName() + ": " + res.getQuantity() + "\n";
                    }
                    for (Methods methods: building.getMethods()){
                        text+="Метод: " + methods.getName() + "\n";
                    }
                }
            }

            Texter.setText(text);
        });
        ws.setOnAction(event -> {
            String text = "";
            for (Building building: GameEngine.getBuildings()) {
                if(building == GameEngine.getWis()) {
                    text+="Здание: " + building.getName() + "\n";
                    for (Resource res : building.getRes()) {
                        text+="всего " + res.getName() + ": " + res.getQuantity() + "\n";
                    }
                    for (Methods methods: building.getMethods()){
                        text+="Метод: " + methods.getName() + "\n";
                    }
                }
            }

            Texter.setText(text);
        });
        wu.setOnAction(event -> {
            String text = "";
            for (Building building: GameEngine.getBuildings()) {
                if(building == GameEngine.getWt()) {
                    text+="Здание: " + building.getName() + "\n";
                    for (Resource res : building.getRes()) {
                        text+="всего " + res.getName() + ": " + res.getQuantity() + "\n";
                    }
                    for (Methods methods: building.getMethods()){
                        text+="Метод: " + methods.getName() + "\n";
                    }
                }
            }

            Texter.setText(text);
        });


    }















}
