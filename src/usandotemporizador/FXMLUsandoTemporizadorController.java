/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usandotemporizador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;

/**
 *
 * @author jose
 */
public class FXMLUsandoTemporizadorController implements Initializable {
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    // Metodo que se ejecutará al finalizar el temporizador
    @FXML
    private void endTempo(ActionEvent event) {
        // Creamos un alert de tipo informativo
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Fin del temporizador."); // Cuerpo del mensaje
        alert.setHeaderText(""); // Establecemos la cabecera del mensaje
        alert.setTitle("OUT OF TIME"); // Titulo del mensaje
        alert.show(); // Mostramos el mensaje
    }
}
