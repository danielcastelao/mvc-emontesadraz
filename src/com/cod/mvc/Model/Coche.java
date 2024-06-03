package com.cod.mvc.Model;

import com.cod.mvc.controller.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa un coche
 */
public class Coche {
    public String matricula;

    public String modelo;

    public int velocidad;

    private List <Observer> observers = new ArrayList<>();


    /**
     * Constructor de la clase Coche
     * @param matricula Matrícula del coche
     * @param modelo Modelo del coche
     */
    public Coche(String matricula, String modelo) {
        this.matricula = matricula;
        this.modelo = modelo;
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(matricula,velocidad);
        }
    }

    public void subirVelocidad(int v) {
        velocidad += v;
        notifyObservers();
    }

    public void bajarVelocidad(int v) {
        if (velocidad - v < 0) {
            throw new IllegalArgumentException("La velocidad no puede ser negativa");
        }
        velocidad -= v;
        notifyObservers();
    }
}
