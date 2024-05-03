package cod.mvc;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents a model for a parking system.
 * It maintains a list of cars and provides methods to manipulate and retrieve information about the cars.
 */
public class Model{

    // List to store all the cars in the parking
    public static List<Coche> parking = new ArrayList<>();

    /**
     * This method creates a new car and adds it to the parking list.
     * @param matricula The license plate of the car.
     * @param modelo The model of the car.
     * @param velocidad The speed of the car.
     */
    public static void crearCoche(String matricula, String modelo, int velocidad){
        Coche coche = new Coche(matricula, modelo, velocidad);
        parking.add(coche);
    }

    /**
     * This method retrieves a car from the parking list based on its license plate.
     * @param matricula The license plate of the car.
     * @return The car with the given license plate, or null if no such car exists.
     */
    public static Coche getCoche (String matricula){
        for (Coche coche : parking){
            if (coche.getMatricula().equals(matricula)){
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
        Coche coche = getCoche(matricula);
        if (coche != null){
            coche.setVelocidad(velocidad);
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
            return coche.getVelocidad();
        }
        return -1;
    }
}