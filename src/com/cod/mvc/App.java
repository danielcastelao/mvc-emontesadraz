package com.cod.mvc;

import com.cod.mvc.Model.Model;
import com.cod.mvc.View.View;
import com.cod.mvc.controller.Controller;

public class App {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.crearCoche("1234ABC", "Seat", 0);
        Model.cambiarVelocidad("1234ABC", 60);
        Model.bajarVelocidad("1234ABC", 50);
        Model.subirVelocidad("1234ABC", 100);
        View.muestraVelocidad("1234ABC", Model.getVelocidad("1234ABC"));
        controller.buscarYMostrarCoche("1234ABC");
    }
}
