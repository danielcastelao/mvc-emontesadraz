package com.cod.mvc.Model;

import com.cod.mvc.controller.Observer;

import java.util.ArrayList;

public interface Observable {
    ArrayList<Observer> observers = new ArrayList<Observer>();
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(Coche coche);
}
