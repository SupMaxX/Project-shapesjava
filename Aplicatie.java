package com.example.lab10;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Text;
import javafx.scene.transform.Translate;
import javafx.stage.Stage;

import java.util.Stack;

public class Aplicatie extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Circle cerc1 = new Circle();
        cerc1.setCenterX(150.0f);
        cerc1.setCenterY(135.0f);
        cerc1.setRadius(100.0f);
        cerc1.setFill(Color.YELLOW);
        cerc1.setStrokeWidth(20);
        Circle cerc2 = new Circle();
        cerc2.setCenterX(150.0f);
        cerc2.setCenterY(135.0f);
        cerc2.setRadius(100.0f);
        cerc2.setFill(Color.CADETBLUE);
        cerc2.setStrokeWidth(20);
        Rectangle drep1 = new Rectangle(150,150,200,200);
        Line linie = new Line(50,50,100,50);
        Text text1 = new Text(100,100,"Exeemplu de text");

        Path path1 = new Path();
        CubicCurve c = new CubicCurve(15,20,25,30,35,40,45,50);
//cream translatia
        Translate translatie = new Translate();
//setam parametrii translatiei - pot exista de fapt 3
        translatie.setX(300);
        translatie.setY(50);
// translatie.setZ(100);
        cerc2.getTransforms().addAll(translatie);
        Group root = new Group(cerc1,cerc2,drep1,linie,text1,c);
        Scene scene = new Scene(root, 600, 300);
        stage.setTitle("Exemplu translatie");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String args[]){
        launch(args);
    }
}

