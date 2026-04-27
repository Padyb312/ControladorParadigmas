package co.edu.poli.mvc.controlador;

import co.edu.poli.mvc.servicios.ImplementacionOperacionCRUD;

public interface ControladorSecundario {
    void setDependencias(ImplementacionOperacionCRUD op, ControladorPrincipal principal);
}