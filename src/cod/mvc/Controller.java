package cod.mvc;

public class Controller {
    public static void main(String[] args) {
        Model.crearCoche("1234ABC", "Seat Ibiza", 100);
        Model.crearCoche("5678DEF", "Ford Focus", 120);
        Model.crearCoche("9012GHI", "Renault Clio", 80);

        Model.cambiarVelocidad("1234ABC", 110);
        Model.cambiarVelocidad("5678DEF", 130);
        Model.cambiarVelocidad("9012GHI", 90);

        Model.getVelocidad("1234ABC");
        Model.getVelocidad("5678DEF");
        Model.getVelocidad("9012GHI");

        Model.getCoche("1234ABC").acelerar();
        Model.getCoche("5678DEF").acelerar();
        Model.getCoche("9012GHI").acelerar();

        View view = new View();
    }
}