package com.example.prueba2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class FinalController {


    private CompraController controllercompra;
    private Stage stage;
    @FXML
    private Label txtCorreo;

    public void init(String text, Stage stage, CompraController compraController) {
        txtCorreo.setText(text);
        this.controllercompra = compraController;
        this.stage = stage;
    }
    @FXML
    private void Salir (ActionEvent event){
        System.out.println("Gracias por pasarse por nuestra aplicación");
        System.exit(0);
    }


}
