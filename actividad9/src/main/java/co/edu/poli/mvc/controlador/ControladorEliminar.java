package co.edu.poli.mvc.controlador;

import co.edu.poli.mvc.modelo.Traje;
import co.edu.poli.mvc.servicios.ImplementacionOperacionCRUD;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.util.Optional;

public class ControladorEliminar implements ControladorSecundario {

    @FXML private TextField campoCodigo;

    private ImplementacionOperacionCRUD op;
    private ControladorPrincipal principal;

    @Override
    public void setDependencias(ImplementacionOperacionCRUD op, ControladorPrincipal principal) {
        this.op = op;
        this.principal = principal;
    }

    @FXML
    void eliminar(ActionEvent event) {
        try {
            Alert confirm = new Alert(Alert.AlertType.CONFIRMATION,
                "¿Desea eliminar el traje: " + campoCodigo.getText() + "?");
            Optional<ButtonType> result = confirm.showAndWait();
            if (result.isPresent() && result.get() == ButtonType.OK) {
                Traje eliminado = op.eliminar(campoCodigo.getText().trim());
                if (eliminado != null) {
                    principal.mostrarEnTextArea("Traje eliminado: " + eliminado.getNumero_traje());
                } else {
                    principal.mostrarEnTextArea("Traje no encontrado: " + campoCodigo.getText());
                }
                ((Stage) campoCodigo.getScene().getWindow()).close();
            }
        } catch (Exception e) {
            new Alert(Alert.AlertType.WARNING, "Error: " + e.getMessage()).show();
        }
    }
}