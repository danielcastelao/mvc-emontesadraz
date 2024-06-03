package com.cod.mvc.Model;

import com.cod.mvc.controller.Observer;

import java.util.ArrayList;

/**
 * Esta interfaz representa un objeto que puede ser observado por otros objetos.
 * Los objetos observadores pueden registrarse para recibir notificaciones cuando el objeto observable cambia.
 */
public interface Observable {
    ArrayList<Observer> observers = new ArrayList<Observer>();
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(Coche coche);
}
