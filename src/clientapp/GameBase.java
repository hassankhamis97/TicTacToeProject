package clientapp;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;

public class GameBase {

    protected final BorderPane borderPane;
    protected final GridPane gridPane;
    protected final ColumnConstraints columnConstraints;
    protected final ColumnConstraints columnConstraints0;
    protected final ColumnConstraints columnConstraints1;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final RowConstraints rowConstraints1;
    protected final Button button;
    protected final Button button0;
    protected final Button button1;
    protected final Button button2;
    protected final Button button3;
    protected final Button button4;
    protected final Button button5;
    protected final Button button6;
    protected final Button button7;
    Scene currentScene;
    public GameBase() {
            
        borderPane = new BorderPane();
        gridPane = new GridPane();
        columnConstraints = new ColumnConstraints();
        columnConstraints0 = new ColumnConstraints();
        columnConstraints1 = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        rowConstraints1 = new RowConstraints();
        button = new Button();
        button0 = new Button();
        button1 = new Button();
        button2 = new Button();
        button3 = new Button();
        button4 = new Button();
        button5 = new Button();
        button6 = new Button();
        button7 = new Button();

        borderPane.setLayoutX(-3.0);
        borderPane.setLayoutY(-3.0);
        borderPane.setPrefHeight(400.0);
        borderPane.setPrefWidth(600.0);

        BorderPane.setAlignment(gridPane, javafx.geometry.Pos.CENTER);

        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setMinWidth(10.0);
        columnConstraints.setPrefWidth(100.0);

        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMinWidth(10.0);
        columnConstraints0.setPrefWidth(100.0);

        columnConstraints1.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints1.setMinWidth(10.0);
        columnConstraints1.setPrefWidth(100.0);

        rowConstraints.setMinHeight(10.0);
        rowConstraints.setPrefHeight(30.0);
        rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints0.setMinHeight(10.0);
        rowConstraints0.setPrefHeight(30.0);
        rowConstraints0.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints1.setMinHeight(10.0);
        rowConstraints1.setPrefHeight(30.0);
        rowConstraints1.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        button.setMnemonicParsing(false);
        button.setPrefHeight(78.0);
        button.setPrefWidth(197.0);

        GridPane.setColumnIndex(button0, 1);
        button0.setMnemonicParsing(false);
        button0.setPrefHeight(78.0);
        button0.setPrefWidth(197.0);

        GridPane.setColumnIndex(button1, 2);
        button1.setMnemonicParsing(false);
        button1.setPrefHeight(78.0);
        button1.setPrefWidth(197.0);

        GridPane.setRowIndex(button2, 1);
        button2.setMnemonicParsing(false);
        button2.setPrefHeight(78.0);
        button2.setPrefWidth(197.0);

        GridPane.setColumnIndex(button3, 1);
        GridPane.setRowIndex(button3, 1);
        button3.setMnemonicParsing(false);
        button3.setPrefHeight(78.0);
        button3.setPrefWidth(197.0);

        GridPane.setColumnIndex(button4, 2);
        GridPane.setRowIndex(button4, 1);
        button4.setMnemonicParsing(false);
        button4.setPrefHeight(78.0);
        button4.setPrefWidth(197.0);

        GridPane.setRowIndex(button5, 2);
        button5.setMnemonicParsing(false);
        button5.setPrefHeight(78.0);
        button5.setPrefWidth(197.0);

        GridPane.setColumnIndex(button6, 1);
        GridPane.setRowIndex(button6, 2);
        button6.setMnemonicParsing(false);
        button6.setPrefHeight(78.0);
        button6.setPrefWidth(197.0);

        GridPane.setColumnIndex(button7, 2);
        GridPane.setRowIndex(button7, 2);
        button7.setMnemonicParsing(false);
        button7.setPrefHeight(78.0);
        button7.setPrefWidth(197.0);
        borderPane.setCenter(gridPane);

        gridPane.getColumnConstraints().add(columnConstraints);
        gridPane.getColumnConstraints().add(columnConstraints0);
        gridPane.getColumnConstraints().add(columnConstraints1);
        gridPane.getRowConstraints().add(rowConstraints);
        gridPane.getRowConstraints().add(rowConstraints0);
        gridPane.getRowConstraints().add(rowConstraints1);
        gridPane.getChildren().add(button);
        gridPane.getChildren().add(button0);
        gridPane.getChildren().add(button1);
        gridPane.getChildren().add(button2);
        gridPane.getChildren().add(button3);
        gridPane.getChildren().add(button4);
        gridPane.getChildren().add(button5);
        gridPane.getChildren().add(button6);
        gridPane.getChildren().add(button7);
        currentScene = new Scene(borderPane);
        

    }
    Scene getScene()
    {
            return currentScene;
    }
}
