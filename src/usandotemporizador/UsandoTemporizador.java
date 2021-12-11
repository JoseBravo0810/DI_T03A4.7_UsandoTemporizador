package usandotemporizador;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author jose
 */
public class UsandoTemporizador extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        // Cargamos FXML que serñá el nodo raiz de la escena
        Parent root = FXMLLoader.load(getClass().getResource("FXMLUsandoTemporizador.fxml"));
        
        // Creamos la escena con el nodo root
        Scene scene = new Scene(root);
        
        // Establecemos la escena como la escena activa del escenario
        stage.setScene(scene);
        // Mostramos el escenario
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
