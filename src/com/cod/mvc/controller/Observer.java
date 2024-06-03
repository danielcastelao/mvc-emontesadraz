package com.cod.mvc.controller;

import com.cod.mvc.Model.Coche;
import com.cod.mvc.Model.Model;

/**
 * This interface represents an observer in the observer pattern.
 */
public interface Observer {
    /**
     * This method updates the observer with the given car and model.
     * @param matricula The car to update the observer with.
     * @param velocidad The model to update the observer with.
     */
    void update(String matricula, int velocidad);
}