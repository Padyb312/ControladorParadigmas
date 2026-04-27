package co.edu.poli.mvc.controlador;

import co.edu.poli.mvc.modelo.Traje;
import co.edu.poli.mvc.servicios.ImplementacionOperacionCRUD;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ControladorPrincipal {

    @FXML
    private TextArea textArea;

    private ImplementacionOperacionCRUD op;

    @FXML
    public void initialize() {
        op = new ImplementacionOperacionCRUD();
        textArea.setText("Bienvenido. Seleccione una opción del menú.");
    }

    @FXML
    void abrirCrear(ActionEvent event) {
        abrirVentana("/co/edu/poli/actividad9/VentanaCrear.fxml", "Crear Traje");
    }
    @FXML
    void abrirBuscar(ActionEvent event) {
        abrirVentana("/co/edu/poli/actividad9/VentanaBuscar.fxml", "Buscar Traje");
    }

    @FXML
    void mostrarTodos(ActionEvent event) {
        Traje[] trajes = op.leerTodos();
        StringBuilder sb = new StringBuilder();
        sb.append("=== LISTA DE TRAJES ===\n\n");
        boolean hayRegistros = false;
        for (Traje t : trajes) {
            if (t != null) {
                sb.append(t.toString()).append("\n\n");
                hayRegistros = true;
            }
        }
        textArea.setText(hayRegistros ? sb.toString() : "No hay trajes registrados.");
    }

    @FXML
    void abrirModificar(ActionEvent event) {
        abrirVentana("/co/edu/poli/actividad9/VentanaModificar.fxml", "Modificar Traje");
    }

    @FXML
    void abrirEliminar(ActionEvent event) {
        abrirVentana("/co/edu/poli/actividad9/ventanaEliminar.fxml", "Eliminar Traje");
    }

    @FXML
    void guardar(ActionEvent event) {
        try {
            String resultado = op.serializar(op.leerTodos(), "", "trajes.bin");
            textArea.setText("Guardar: " + resultado);
        } catch (Exception e) {
            textArea.setText("Error al guardar: " + e.getMessage());
        }
    }

    @FXML
    void cargar(ActionEvent event) {
        try {
            Traje[] cargados = op.deserializar("", "trajes.bin");
            if (cargados != null) {
                op = new ImplementacionOperacionCRUD();
                for (Traje t : cargados) {
                    if (t != null) op.crear(t);
                }
                textArea.setText("Datos cargados correctamente.\n"
                    + "Presiona 'Mostrar Todos' para verlos.");
            } else {
                textArea.setText("No se encontró el archivo o está vacío.");
            }
        } catch (Exception e) {
            textArea.setText("Error al cargar: " + e.getMessage());
        }
    }

    @FXML
    void limpiar(ActionEvent event) {
        textArea.setText("");
    }

    private void abrirVentana(String fxmlPath, String titulo) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlPath));
            Parent root = loader.load();

            ControladorSecundario controlador = loader.getController();
            controlador.setDependencias(op, this);

            Stage stage = new Stage();
            stage.setTitle(titulo);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(new Scene(root));
            stage.showAndWait();

        } catch (Exception e) {
            textArea.setText("Error al abrir ventana: " + e.getMessage());
        }
    }

    public void mostrarEnTextArea(String texto) {
        textArea.setText(texto);
    }

    public ImplementacionOperacionCRUD getOp() {
        return op;
    }
}