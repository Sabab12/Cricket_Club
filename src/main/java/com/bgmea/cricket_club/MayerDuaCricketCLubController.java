package com.bgmea.cricket_club;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.Objects;

public class MayerDuaCricketCLubController {
    @javafx.fxml.FXML
    private PasswordField passwordTextField;
    @javafx.fxml.FXML
    private TextArea DisplayForPlayersInfo;
    @javafx.fxml.FXML
    private TextField userIDTextField;
    @javafx.fxml.FXML
    private ComboBox<String> comboTextField;
    ArrayList<Batsman> batsmanArrayList;
    ArrayList<Bowlar> bowlarArrayList;

    @javafx.fxml.FXML
    public void initialize() {
        comboTextField.getItems().addAll("Batsman", "Bowler");
        batsmanArrayList = new ArrayList<>();
        bowlarArrayList = new ArrayList<>();

        batsmanArrayList.add(new Batsman("Sabab", "21/2/2001", "21 year ago", "1234", 23, "213", "123,3", "12123", "60/23"));

        bowlarArrayList.add(new Bowlar("Sabit", "21/3/2012", "21 years ago", 21, "454", "11"));


    }

    @javafx.fxml.FXML
    public void loginToSEE(ActionEvent actionEvent) {
        String username, password, Ptype;
        username = userIDTextField.getText();
        password = passwordTextField.getText();
        Ptype = comboTextField.getValue();

        if (Ptype == "Batsman") {

            for (Batsman B : batsmanArrayList) {

                DisplayForPlayersInfo.setText(B.toString());
            }
        } else if (Ptype == "Bowler") {
            for (Bowlar boler : bowlarArrayList) {
                DisplayForPlayersInfo.setText(boler.toString());
            }

        }
    }
}











