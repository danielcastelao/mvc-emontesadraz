package com.cod.mvc.controller;

import com.cod.mvc.Model.Model;
import com.cod.mvc.View.View;

public class Controller {
    public void crearCoche(String matricula, String modelo, int velocidad){
        Model.getInstance().crearCoche(matricula, modelo, velocidad);
    }
        View view = new View();
    }
