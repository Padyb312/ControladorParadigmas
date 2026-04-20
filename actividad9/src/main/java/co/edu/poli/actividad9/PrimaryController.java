package co.edu.poli.actividad9;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class PrimaryController {

    @FXML
    private Label primaryLabel;

    private int contadorTexto = 0;
    private double tamanoFuente = 18;

    // -------------------------------------------------------
    // Cambiar color del Label
    // -------------------------------------------------------

    @FXML
    private void cambiarColorRojo() {
        primaryLabel.setStyle("-fx-font-size: " + tamanoFuente + "px; -fx-font-weight: bold; -fx-text-fill: #e74c3c;");
    }

    @FXML
    private void cambiarColorVerde() {
        primaryLabel.setStyle("-fx-font-size: " + tamanoFuente + "px; -fx-font-weight: bold; -fx-text-fill: #2ecc71;");
    }

    @FXML
    private void cambiarColorAzul() {
        primaryLabel.setStyle("-fx-font-size: " + tamanoFuente + "px; -fx-font-weight: bold; -fx-text-fill: #3498db;");
    }

    // -------------------------------------------------------
    // Cambiar texto del Label (cicla entre mensajes)
    // -------------------------------------------------------

    @FXML
    private void cambiarTexto() {
        String[] textos = {
            "¡Hola desde Primary!",
            "JavaFX es genial 🚀",
            "Aprendiendo Controllers",
            "¡Sigue practicando! 💪"
        };
        contadorTexto = (contadorTexto + 1) % textos.length;
        primaryLabel.setText(textos[contadorTexto]);
    }

    // -------------------------------------------------------
    // Aumentar tamaño de fuente (máximo 36px)
    // -------------------------------------------------------

    @FXML
    private void aumentarFuente() {
        if (tamanoFuente < 36) {
            tamanoFuente += 2;
            primaryLabel.setStyle(
                primaryLabel.getStyle()
                    .replaceAll("-fx-font-size: \\d+(\\.\\d+)?px",
                                "-fx-font-size: " + tamanoFuente + "px")
            );
        } else {
            primaryLabel.setText("¡Fuente al máximo! (36px)");
        }
    }

    // -------------------------------------------------------
    // Resetear todo al estado inicial
    // -------------------------------------------------------

    @FXML
    private void resetear() {
        tamanoFuente = 18;
        contadorTexto = 0;
        primaryLabel.setText("¡Hola desde Primary!");
        primaryLabel.setStyle("-fx-font-size: 18px; -fx-font-weight: bold; -fx-text-fill: #19d1ce;");
    }

    // -------------------------------------------------------
    // Cambiar a la ventana secundaria
    // -------------------------------------------------------

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}