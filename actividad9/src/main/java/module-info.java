module co.edu.poli.actividad9 {
    requires javafx.controls;
    requires javafx.fxml;

    // Permite a javafx.fxml acceder a los controladores
    opens co.edu.poli.vista to javafx.fxml;

    // Exporta el paquete principal
    exports co.edu.poli.vista;
}