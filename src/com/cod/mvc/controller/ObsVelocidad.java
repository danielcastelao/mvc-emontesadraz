package com.cod.mvc.controller;

import com.cod.mvc.Model.Coche;
import com.cod.mvc.Model.Model;

/**
 * Esta clase representa un observador en el patrón observador.
 */
public class ObsVelocidad implements Observer{
    final static int LIMITE = 120;
    /*
    * Método que actualiza la velocidad del coche
    * @param coche Coche
    * @param model Model
     */
    @Override
    public void update(String matricula, int velocidad) {
        // Vemos si se ha pasado el límite de velocidad
    if (velocidad > LIMITE){
            Model.getInstance().cambiarVelocidad(matricula,velocidad-10);
            System.out.println("Bajada velocidad");
        }
    }
}


