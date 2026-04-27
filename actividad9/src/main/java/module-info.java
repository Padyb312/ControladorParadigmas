module co.edu.poli.actividad9 {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	requires javafx.base;

	// Permite a javafx.fxml acceder a los controladores
	opens co.edu.poli.mvc.vista to javafx.graphics, javafx.fxml;
	opens co.edu.poli.mvc.controlador to javafx.graphics, javafx.fxml;

	// Exporta el paquete principal
	exports co.edu.poli.mvc.vista;
}