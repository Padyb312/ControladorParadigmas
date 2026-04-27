package co.edu.poli.mvc.controlador;

import co.edu.poli.mvc.modelo.Traje;
import co.edu.poli.mvc.servicios.ImplementacionOperacionCRUD;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ControladorBuscar implements ControladorSecundario {

	@FXML
	private TextField campoCodigo;

	private ImplementacionOperacionCRUD op;
	private ControladorPrincipal principal;

	@Override
	public void setDependencias(ImplementacionOperacionCRUD op, ControladorPrincipal principal) {
		this.op = op;
		this.principal = principal;
	}

	@FXML
	void buscar(ActionEvent event) {
		try {
			Traje t = op.leeruno(campoCodigo.getText().trim());
			if (t != null) {
				principal.mostrarEnTextArea(t.toString());
			} else {
				principal.mostrarEnTextArea("Traje no encontrado: " + campoCodigo.getText());
			}
			((Stage) campoCodigo.getScene().getWindow()).close();
		} catch (Exception e) {
			new Alert(Alert.AlertType.WARNING, "Error: " + e.getMessage()).show();
		}
	}
}