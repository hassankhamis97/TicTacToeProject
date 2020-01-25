package clientapp;

import java.lang.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Separator;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.effect.*;
import javafx.scene.effect.Light.Distant;
import javafx.scene.effect.Lighting;
import javafx.scene.effect.Shadow;
import javafx.scene.layout.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
//import 0x99c2ffff;

public class GameStyle {
        Scene currentScene;
        AnchorPane anchorPane;
    protected final GridPane gridPane;
    protected final Button button;
    protected final Button button0;
    protected final Button button1;
    protected final Button button2;
    protected final Button button3;
    protected final Button button4;
    protected final Button button5;
    protected final Button button6;
    protected final Button button7;
    protected final ColumnConstraints columnConstraints;
    protected final ColumnConstraints columnConstraints0;
    protected final ColumnConstraints columnConstraints1;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final RowConstraints rowConstraints1;
    protected final TextArea textArea;
    protected final TextField textField;
    protected final Button button8;
    protected final MenuButton menuButton;
    protected final MenuItem menuItem;
    protected final MenuItem menuItem0;
    protected final MenuItem menuItem1;
    protected final Button button9;
    protected final Separator separator;
    protected final Lighting lighting;
    protected final Button button10;
    protected final Button button11;
    protected final Button button12;
    protected final Button button13;
    protected final Button button14;
    protected final Button button15;

    public GameStyle() {

        gridPane = new GridPane();
        button = new Button();
        button0 = new Button();
        button1 = new Button();
        button2 = new Button();
        button3 = new Button();
        button4 = new Button();
        button5 = new Button();
        button6 = new Button();
        button7 = new Button();
        columnConstraints = new ColumnConstraints();
        columnConstraints0 = new ColumnConstraints();
        columnConstraints1 = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        rowConstraints1 = new RowConstraints();
        textArea = new TextArea();
        textField = new TextField();
        button8 = new Button();
        menuButton = new MenuButton();
        menuItem = new MenuItem();
        menuItem0 = new MenuItem();
        menuItem1 = new MenuItem();
        button9 = new Button();
        separator = new Separator();
        lighting = new Lighting();
        button10 = new Button();
        button11 = new Button();
        button12 = new Button();
        button13 = new Button();
        button14 = new Button();
        button15 = new Button();

        anchorPane.setId("AnchorPane");
        anchorPane.setPrefHeight(441.0);
        anchorPane.setPrefWidth(523.0);

        AnchorPane.setBottomAnchor(gridPane, 180.0);
        AnchorPane.setLeftAnchor(gridPane, 105.0);
        AnchorPane.setRightAnchor(gridPane, 105.0);
        AnchorPane.setTopAnchor(gridPane, 90.0);
        gridPane.setGridLinesVisible(true);
        gridPane.setPrefHeight(171.0);
        gridPane.setPrefWidth(300.0);

        GridPane.setColumnIndex(button, 0);
        GridPane.setRowIndex(button, 0);
        button.setId("btn00");
        button.setMaxHeight(Double.MAX_VALUE);
        button.setMaxWidth(Double.MAX_VALUE);
        button.setMnemonicParsing(false);
        button.setPrefHeight(59.0);
        button.setPrefWidth(105.0);
        button.setText("Button");

        GridPane.setColumnIndex(button0, 2);
        GridPane.setRowIndex(button0, 2);
        button0.setId("btn22");
        button0.setMaxHeight(Double.MAX_VALUE);
        button0.setMaxWidth(Double.MAX_VALUE);
        button0.setMnemonicParsing(false);
        button0.setPrefHeight(59.0);
        button0.setPrefWidth(105.0);
        button0.setText("Button");

        GridPane.setColumnIndex(button1, 1);
        GridPane.setRowIndex(button1, 2);
        button1.setId("btn21");
        button1.setMaxHeight(Double.MAX_VALUE);
        button1.setMaxWidth(Double.MAX_VALUE);
        button1.setMnemonicParsing(false);
        button1.setPrefHeight(59.0);
        button1.setPrefWidth(105.0);
        button1.setText("Button");

        GridPane.setRowIndex(button2, 2);
        button2.setId("btn20");
        button2.setMaxHeight(Double.MAX_VALUE);
        button2.setMaxWidth(Double.MAX_VALUE);
        button2.setMnemonicParsing(false);
        button2.setPrefHeight(59.0);
        button2.setPrefWidth(105.0);
        button2.setText("Button");

        GridPane.setColumnIndex(button3, 2);
        GridPane.setRowIndex(button3, 1);
        button3.setId("btn12");
        button3.setMaxHeight(Double.MAX_VALUE);
        button3.setMaxWidth(Double.MAX_VALUE);
        button3.setMnemonicParsing(false);
        button3.setPrefHeight(59.0);
        button3.setPrefWidth(105.0);
        button3.setText("Button");

        GridPane.setColumnIndex(button4, 1);
        GridPane.setRowIndex(button4, 1);
        button4.setId("btn11");
        button4.setMaxHeight(Double.MAX_VALUE);
        button4.setMaxWidth(Double.MAX_VALUE);
        button4.setMnemonicParsing(false);
        button4.setPrefHeight(59.0);
        button4.setPrefWidth(105.0);
        button4.setText("Button");

        GridPane.setRowIndex(button5, 1);
        button5.setId("btn10");
        button5.setMaxHeight(Double.MAX_VALUE);
        button5.setMaxWidth(Double.MAX_VALUE);
        button5.setMnemonicParsing(false);
        button5.setPrefHeight(59.0);
        button5.setPrefWidth(105.0);
        button5.setText("Button");

        GridPane.setColumnIndex(button6, 2);
        button6.setId("btn02");
        button6.setMaxHeight(Double.MAX_VALUE);
        button6.setMaxWidth(Double.MAX_VALUE);
        button6.setMnemonicParsing(false);
        button6.setPrefHeight(59.0);
        button6.setPrefWidth(105.0);
        button6.setText("Button");

        GridPane.setColumnIndex(button7, 1);
        button7.setId("btn01");
        button7.setMaxHeight(Double.MAX_VALUE);
        button7.setMaxWidth(Double.MAX_VALUE);
        button7.setMnemonicParsing(false);
        button7.setPrefHeight(59.0);
        button7.setPrefWidth(105.0);
        button7.setText("Button");

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

        AnchorPane.setBottomAnchor(textArea, 77.0);
        AnchorPane.setLeftAnchor(textArea, 120.0);
        AnchorPane.setRightAnchor(textArea, 115.0);
        textArea.setId("textArea");
        textArea.setPrefHeight(84.99990000000253);
        textArea.setPrefWidth(300.0);
        textArea.setWrapText(true);

        AnchorPane.setBottomAnchor(textField, 30.0);
        AnchorPane.setLeftAnchor(textField, 120.0);
        AnchorPane.setRightAnchor(textField, 177.0);
        textField.setId("textField");
        textField.setPrefWidth(241.0);

        AnchorPane.setBottomAnchor(button8, 25.0);
        AnchorPane.setRightAnchor(button8, 115.0);
        button8.setId("benSend");
        button8.setMnemonicParsing(false);
        button8.setText("Send");

        AnchorPane.setRightAnchor(menuButton, 30.0);
        AnchorPane.setTopAnchor(menuButton, 20.0);
        menuButton.setMnemonicParsing(false);
        menuButton.setText("Settings");

        menuItem.setMnemonicParsing(false);
        menuItem.setText("Main Menu");

        menuItem0.setMnemonicParsing(false);
        menuItem0.setText("Play Again");

        menuItem1.setMnemonicParsing(false);
        menuItem1.setText("Sound");

        AnchorPane.setRightAnchor(button9, 130.0);
        AnchorPane.setTopAnchor(button9, 50.0);
        button9.setMnemonicParsing(false);
        button9.setText("Player 2");

        AnchorPane.setLeftAnchor(separator, 280.0);
        AnchorPane.setRightAnchor(separator, 280.0);
        separator.setFocusTraversable(true);
        separator.setLayoutY(18.0);
        separator.setOrientation(javafx.geometry.Orientation.VERTICAL);
        separator.setPrefHeight(50.0);

        separator.setEffect(lighting);

        AnchorPane.setLeftAnchor(button10, 130.0);
        AnchorPane.setTopAnchor(button10, 50.0);
        button10.setMnemonicParsing(false);
        button10.setText("Player 1");

        AnchorPane.setLeftAnchor(button11, 30.0);
        AnchorPane.setTopAnchor(button11, 20.0);
        button11.setMnemonicParsing(false);
        button11.setText("Coins");

        AnchorPane.setBottomAnchor(button12, 65.0);
        AnchorPane.setLeftAnchor(button12, 65.0);
        button12.setMnemonicParsing(false);
        button12.setText("Emoji2");

        AnchorPane.setBottomAnchor(button13, 30.0);
        AnchorPane.setLeftAnchor(button13, 10.0);
        button13.setMnemonicParsing(false);
        button13.setText("Emoji3");

        AnchorPane.setBottomAnchor(button14, 30.0);
        AnchorPane.setLeftAnchor(button14, 65.0);
        button14.setMnemonicParsing(false);
        button14.setText("Emoji4");

        AnchorPane.setBottomAnchor(button15, 65.0);
        AnchorPane.setLeftAnchor(button15, 10.0);
        button15.setMnemonicParsing(false);
        button15.setText("Emoji1");

        gridPane.getChildren().add(button);
        gridPane.getChildren().add(button0);
        gridPane.getChildren().add(button1);
        gridPane.getChildren().add(button2);
        gridPane.getChildren().add(button3);
        gridPane.getChildren().add(button4);
        gridPane.getChildren().add(button5);
        gridPane.getChildren().add(button6);
        gridPane.getChildren().add(button7);
        gridPane.getColumnConstraints().add(columnConstraints);
        gridPane.getColumnConstraints().add(columnConstraints0);
        gridPane.getColumnConstraints().add(columnConstraints1);
        gridPane.getRowConstraints().add(rowConstraints);
        gridPane.getRowConstraints().add(rowConstraints0);
        gridPane.getRowConstraints().add(rowConstraints1);
        anchorPane.getChildren().add(gridPane);
        anchorPane.getChildren().add(textArea);
        anchorPane.getChildren().add(textField);
        anchorPane.getChildren().add(button8);
        menuButton.getItems().add(menuItem);
        menuButton.getItems().add(menuItem0);
        menuButton.getItems().add(menuItem1);
        anchorPane.getChildren().add(menuButton);
        anchorPane.getChildren().add(button9);
        anchorPane.getChildren().add(separator);
        anchorPane.getChildren().add(button10);
        anchorPane.getChildren().add(button11);
        anchorPane.getChildren().add(button12);
        anchorPane.getChildren().add(button13);
        anchorPane.getChildren().add(button14);
        anchorPane.getChildren().add(button15);
        currentScene = new Scene(anchorPane);
        

    }
    Scene getScene()
    {
            return currentScene;
    }
}
