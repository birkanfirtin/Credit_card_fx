package com.example.credit_card_fx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import java.lang.Object;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.layout.Region;
import javafx.scene.control.Control;
import javafx.scene.control.TextInputControl;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

public class Controller {

    @FXML
    private  TextField myTextField;



    @FXML TextField textfieldcvv;

    @FXML
    private Button button;

    long cardinput;

    public  void submit(ActionEvent event){
        cardinput = Long.parseLong(myTextField.getText());

        textfieldcvv.getText().matches("[0-9]{4}$");



        if(myTextField.getText().matches("^[5][0-9]{15}$")){
            System.out.println("MasterCard");
        }
        else if(myTextField.getText().matches("^[4][0-9]{15}$")){
            System.out.println("Visa");
        }
        else if(myTextField.getText().matches("^3[47][0-9]{14}$")) {
            System.out.println("Amex");
        }
        else if(myTextField.getText().matches("^[35][0-9]{15}$")){
            System.out.println("JCB");}
        else {
            System.out.println("Not Valid");
        }


    }
}
