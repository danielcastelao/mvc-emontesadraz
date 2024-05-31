package com.cod.mvc.Model;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents a model for a parking system.
 * It maintains a list of cars and provides methods to manipulate and retrieve information about the cars.
 */
public class Model{
    private static Model instance = null;

    private Model() {
        // constructor privado
    }

    public static Model getInstance() {
        if (instance == null) {
            instance = new Model();
        }
        return instance;
    }
    // List to store all the cars in the parking
    public static List<Coche> parking = new ArrayList<>();

    /**
     * This method creates a new car and adds it to the parking list.
     * @param matricula The license plate of the car.
     * @param modelo The model of the car.
     * @param velocidad The speed of the car.
     */
    public static void crearCoche(String matricula, String modelo, int velocidad){
        if (velocidad < 0){
            throw new IllegalArgumentException("La velocidad no puede ser negativa");
        }
        Coche coche = new Coche(matricula, modelo);
        parking.add(coche);
    }

    /**
     * This method retrieves a car from the parking list based on its license plate.
     * @param matricula The license plate of the car.
     * @return The car with the given license plate, or null if no such car exists.
     */
    public static Coche getCoche (String matricula){
        for (Coche coche : parking){
            if (coche.matricula.equals(matricula)){
                return coche;
            }
        }
        return null;
    }

    /**
     * This method changes the speed of a car.
     * @param matricula The license plate of the car.
     * @param velocidad The new speed of the car.
     */
    public static void cambiarVelocidad(String matricula, int velocidad){
        if (velocidad < 0){
            throw new IllegalArgumentException("La velocidad no puede ser negativa");
        }
        Coche coche = getCoche(matricula);
        if (coche != null){
            coche.velocidad = velocidad;
        }
    }

    /**
     * This method retrieves the speed of a car.
     * @param matricula The license plate of the car.
     * @return The speed of the car, or -1 if no such car exists.
     */
    public static int getVelocidad(String matricula){
        Coche coche = getCoche(matricula);
        if (coche != null){
            return coche.velocidad;
        }
           return -1;
    }

    /**
     * This method retrieves the model of a car.
     * @param matricula
     * @return
     */
    public static Coche buscarMatricula(String matricula){
        for (Coche coche : parking){
            if (coche.matricula.equals(matricula)){
                return coche;
            }
        }
        return null;
    }
}