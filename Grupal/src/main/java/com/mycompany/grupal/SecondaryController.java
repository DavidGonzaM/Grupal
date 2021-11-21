package com.mycompany.grupal;

import java.io.IOException;
import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import modelos.Alumno;

//VISTA PARA VER LA TABLA DE ALUMNADO LOS ALUMNOS
public class SecondaryController implements Initializable{

    @FXML
    private TableColumn<Alumno, String> cNombre;
    @FXML
    private TableColumn<Alumno, Date> cFecha;
    @FXML
    private TableColumn<Alumno, String> cTipo;
    @FXML
    private TableColumn<Alumno, Integer> cHoras;
    @FXML
    private TableColumn<Alumno, String> cActividad;
    @FXML
    private TableColumn<Alumno, String> cObservaciones;
    @FXML
    private Button btnDatos;
    @FXML
    private Button btnAñadir;
    @FXML
    private Button btnBorrar;
    @FXML
    private TableView<Alumno> tabla;

    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @FXML
    private void switchToDatos(ActionEvent event) {
    }

    @FXML
    private void switchToAñadir(ActionEvent event) {
    }

    @FXML
    private void borrar(ActionEvent event) {
    Alumno seleccion = tabla.getSelectionModel().getSelectedItem();
    tabla.getItems().remove(seleccion);
    
    }
    
    
}