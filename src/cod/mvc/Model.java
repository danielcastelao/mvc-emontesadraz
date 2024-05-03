package cod.mvc;

import java.util.ArrayList;
import java.util.List;

public class Model{

    static List<Coche> parking = new ArrayList<>();

    public static void crearCoche(String matricula, String modelo, int velocidad){
        Coche coche = new Coche(matricula, modelo, velocidad);
        parking.add(coche);
    }

    public static Coche getCoche (String matricula){
        for (Coche coche : parking){
            if (coche.getMatricula().equals(matricula)){
                return coche;
            }
        }
        return null;
    }
    public static void cambiarVelocidad(String matricula, int velocidad){
        Coche coche = getCoche(matricula);
        if (coche != null){
            coche.setVelocidad(velocidad);
        }
    }
    public static int getVelocidad(String matricula){
        Coche coche = getCoche(matricula);
        if (coche != null){
            return coche.getVelocidad();
        }
        return -1;
    }
}
