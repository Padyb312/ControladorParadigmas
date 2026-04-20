package co.edu.poli.actividad9;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

public class SecondaryController {

    @FXML
    private Pane miPane;

    @FXML
    private Button botonInterno;

    @FXML
    private Label labelHola;

    private int contadorLabel = 0;
    private boolean botonHabilitado = true;

    // -------------------------------------------------------
    // Cambiar color de fondo del Panel
    // -------------------------------------------------------

    @FXML
    private void colorMorado() {
        miPane.setStyle("-fx-background-color: #8e44ad; -fx-background-radius: 8;");
    }

    @FXML
    private void colorNaranja() {
        miPane.setStyle("-fx-background-color: #e67e22; -fx-background-radius: 8;");
    }

    @FXML
    private void colorTurquesa() {
        miPane.setStyle("-fx-background-color: #1abc9c; -fx-background-radius: 8;");
    }

    // -------------------------------------------------------
    // Cambiar el texto del Label interno
    // -------------------------------------------------------

    @FXML
    private void cambiarTextoLabel() {
        String[] textos = {
            "Hola Mundo",
            "JavaFX Rocks!",
            "¡Cambiando textos!",
            "Secondary View 🎯"
        };
        contadorLabel = (contadorLabel + 1) % textos.length;
        labelHola.setText(textos[contadorLabel]);
    }

    // -------------------------------------------------------
    // Acción del botón interno del Panel
    // -------------------------------------------------------

    @FXML
    private void accionBotonInterno() {
        labelHola.setText("¡Botón presionado!");
        labelHola.setStyle("-fx-text-fill: #f1c40f; -fx-font-weight: bold;");
    }

    // -------------------------------------------------------
    // Habilitar / Deshabilitar el botón interno
    // -------------------------------------------------------

    @FXML
    private void toggleBoton() {
        botonHabilitado = !botonHabilitado;
        botonInterno.setDisable(!botonHabilitado);
        botonInterno.setText(botonHabilitado ? "Boton Interno" : "Deshabilitado");
    }

    // -------------------------------------------------------
    // Volver a la ventana primaria
    // -------------------------------------------------------

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
}