package co.edu.poli.mvc.controlador;

import co.edu.poli.mvc.modelo.Traje;
import co.edu.poli.mvc.modelo.TrajeExploracion;
import co.edu.poli.mvc.servicios.ImplementacionOperacionCRUD;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ControladorModificar implements ControladorSecundario {

    @FXML private TextField modificarCodigo;
    @FXML private Button    btnBuscar;
    @FXML private VBox      panelCampos;
    @FXML private TextField modificarMaterial;
    @FXML private TextField modificarPeso;
    @FXML private TextField modificarAltura;

    private ImplementacionOperacionCRUD op;
    private ControladorPrincipal principal;

    @FXML
    public void initialize() {
        panelCampos.setVisible(false);
    }

    @Override
    public void setDependencias(ImplementacionOperacionCRUD op, ControladorPrincipal principal) {
        this.op = op;
        this.principal = principal;
    }

    @FXML
    void buscarTraje(ActionEvent event) {
        Traje encontrado = op.leeruno(modificarCodigo.getText().trim());
        if (encontrado != null) {
            modificarMaterial.setText(encontrado.getMaterial());
            modificarPeso.setText(String.valueOf(encontrado.getPeso()));
            modificarAltura.setText(String.valueOf(encontrado.getAltura()));
            panelCampos.setVisible(true);
        } else {
            new Alert(Alert.AlertType.WARNING,
                "Traje no encontrado: " + modificarCodigo.getText()).show();
            panelCampos.setVisible(false);
        }
    }

    @FXML
    void modificar(ActionEvent event) {
        try {
            String codigo = modificarCodigo.getText().trim();
            Traje existente = op.leeruno(codigo);
            TrajeExploracion nuevo = new TrajeExploracion(
                modificarMaterial.getText().trim(),
                Double.parseDouble(modificarPeso.getText().trim()),
                Double.parseDouble(modificarAltura.getText().trim()),
                codigo,
                existente.getLugar_fabricacion(),
                existente.getAstronauta(),
                existente.getResistencia_impactos(),
                existente.getTiempo_uso(),
                existente.getCapacidad_oxigeno(),
                existente.getCantidad_oxigeno(),
                existente.getDesgaste()
            );
            String resultado = op.modificar(codigo, nuevo);
            principal.mostrarEnTextArea(resultado);
            ((Stage) modificarCodigo.getScene().getWindow()).close();
        } catch (NumberFormatException e) {
            new Alert(Alert.AlertType.WARNING, "Peso y Altura deben ser números decimales.").show();
        } catch (Exception e) {
            new Alert(Alert.AlertType.WARNING, e.getMessage()).show();
        }
    }
}
