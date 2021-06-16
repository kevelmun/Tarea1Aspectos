package com.mycompany.observer;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class PrimaryController {

    @FXML
    private VBox vbox;
    @FXML
    private Button yellowButton;
    @FXML
    private Button blueButton;
    @FXML
    private Button redButton;
    @FXML
    private StackPane stackPaneID;
    @FXML
    private ImageView imageViewID;
    
    private Color color;
    
   
    @FXML
    private void changeToYellow() throws IOException {
        changeBackGColor("yellow.png");
        System.out.println("Yellow");
    }
    @FXML
    private void changeToBlue() throws IOException {
        changeBackGColor("blue.png");  
        System.out.println("Blue");
    }
    @FXML
    private void changeToRed() throws IOException {
        changeBackGColor("red.png");
        System.out.println("Red");
        
    }
    
    private void changeBackGColor(String s) throws IOException{
        color = new Color(s);
        Image img= new Image(color.getPath(),640,480,false,false);
        this.imageViewID.setImage(img);
        
    }
    
    
    
    
}
