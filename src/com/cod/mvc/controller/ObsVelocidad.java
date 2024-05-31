package com.cod.mvc.controller;

import com.cod.mvc.Model.Coche;
import com.cod.mvc.Model.Model;

public class ObsVelocidad implements Observer{
    final static int LIMITE = 120;
    /*
    * Método que actualiza la velocidad del coche
    * @param coche Coche
    * @param model Model
     */
    @Override
    public void update(Coche coche, Model model) {
        // Vemos si se ha pasado el límite de velocidad
    if (coche.velocidad > LIMITE){
            Model.getInstance().cambiarVelocidad(coche.matricula,coche.velocidad-10);
            System.out.println("Bajada velocidad");
        }
    }
}


