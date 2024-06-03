package com.cod.mvc.controller;

import com.cod.mvc.Model.Coche;
import com.cod.mvc.Model.Model;
import com.cod.mvc.View.View;

public class Controller {

    /**
     * Método que crea un coche
     *
     * @param matricula
     * @param modelo
     * @param velocidad
     */
    public void crearCoche(String matricula, String modelo, int velocidad) {
        Model.getInstance().crearCoche(matricula, modelo, velocidad);
    }

    /**
     * Método que busca la matricula de un coche y lo muestra
     *
     * @param matricula
     */
    public void buscarYMostrarCoche(String matricula) {
        Coche coche = Model.getInstance().buscarMatricula(matricula);
        View.mostrarCoche(coche);
    }

    View view = new View();
}
