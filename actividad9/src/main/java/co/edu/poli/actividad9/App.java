package co.edu.poli.actividad9;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        // Carga la vista principal al iniciar
        scene = new Scene(loadFXML("primary"), 400, 420);
        stage.setTitle("Actividad 9 - Trajes");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Cambia la vista actual por otro archivo FXML.
     * Uso: App.setRoot("secondary") o App.setRoot("primary")
     */
    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    /**
     * Carga un archivo FXML desde la carpeta de recursos del paquete.
     * Los FXML deben estar en: src/main/resources/co/edu/poli/actividad9/
     */
    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(
            App.class.getResource(fxml + ".fxml")
        );
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }
}