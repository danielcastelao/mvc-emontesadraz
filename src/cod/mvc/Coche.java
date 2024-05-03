package cod.mvc;

public class Coche {
    private String matricula;

    private String modelo;

    private int velocidad;


    public Coche(String matricula, String modelo, int velocidad) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.velocidad = velocidad;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void acelerar() {
        velocidad += 10;
    }

    public void frenar() {
        velocidad -= 10;
    }
}
