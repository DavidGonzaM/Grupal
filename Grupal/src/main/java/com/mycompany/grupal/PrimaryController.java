package com.mycompany.grupal;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField txtNombreUsuario;
    @FXML
    private TextField txtContraseña;
    @FXML
    private CheckBox recordar;
    @FXML
    private Button btnSesion;

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    @FXML
    private void mantener(ActionEvent event) {
        System.out.println("Mantener abierta la sesión");
        System.out.println( recordar.isSelected() );
    }
}
