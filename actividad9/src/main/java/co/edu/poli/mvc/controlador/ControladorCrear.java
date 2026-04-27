package co.edu.poli.mvc.controlador;

import co.edu.poli.mvc.modelo.TrajeExploracion;
import co.edu.poli.mvc.servicios.ImplementacionOperacionCRUD;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ControladorCrear implements ControladorSecundario {

	@FXML
	private TextField crearId;
	@FXML
	private TextField crearMaterial;
	@FXML
	private TextField crearPeso;
	@FXML
	private TextField crearAltura;

	private ImplementacionOperacionCRUD op;
	private ControladorPrincipal principal;

	@Override
	public void setDependencias(ImplementacionOperacionCRUD op, ControladorPrincipal principal) {
		this.op = op;
		this.principal = principal;
	}

	@FXML
	void crear(ActionEvent event) {
		try {
			TrajeExploracion t = new TrajeExploracion(crearMaterial.getText().trim(),
					Double.parseDouble(crearPeso.getText().trim()), Double.parseDouble(crearAltura.getText().trim()),
					crearId.getText().trim(), "N/A", null, 0.0, 0.0, 100.0, 100.0, 0.0);
			String resultado = op.crear(t);
			principal.mostrarEnTextArea(resultado);
			((Stage) crearId.getScene().getWindow()).close();
		} catch (NumberFormatException e) {
			new Alert(Alert.AlertType.WARNING, "Peso y Altura deben ser números decimales.").show();
		} catch (Exception e) {
			new Alert(Alert.AlertType.WARNING, e.getMessage()).show();
		}
	}
}