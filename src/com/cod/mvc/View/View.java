package com.cod.mvc.View;

import com.cod.mvc.Model.Coche;

public class View {
    /**
     * Método que muestra la velocidad del coche
     *
     * @param matricula String
     * @param velocidad int
     */
    public static void muestraVelocidad(String matricula, int velocidad) {
        System.out.println("La velocidad del coche " + matricula + " es de: " + velocidad + " Km/h");
    }

    /**
     * Método que muestra el coche
     * @param coche Coche
     */

    public static void mostrarCoche(Coche coche) {
        if (coche != null) {
            System.out.println("Matrícula: " + coche.matricula);
            System.out.println("Modelo: " + coche.modelo);
            System.out.println("Velocidad: " + coche.velocidad);
        } else {
            System.out.println("No se encontró el coche.");
        }
    }
}
