# Tarea: arquitectura MVC

Tarea para implementar arquitectura MVC

Utiliza objetos coches, modifica la velocidad y la muestra

---

## Clases ```Controller``` y ```Model```

- Implementa la clase ```Controller``` y ```Model``` según el diagrama de clases.

- Implementa los métodos ```crearCoche()```, ```getCoche()```, ```cambiarVelocidad()``` y ```getVelocidad()```

- Realiza los test necesarios para comprobar que funcionan correctamente

### Diagrama de clases:

```mermaid
classDiagram
    class Coche {
        String: matricula
        String: modelo
        Integer: velocidad
    }
      class Controller{
          +main()
      }
      class View {+muestraVelocidad(String, Integer)}
      class Model {
          ArrayList~Coche~: parking
          +crearCoche(String, String, String)
          +getCoche(String)
          +cambiarVelocidad(String, Integer)
          +getVelocidad(String)
      }
    Controller "1" *-- "1" Model : association
    Controller "1" *-- "1" View : association
    Model "1" *-- "1..n" Coche : association
      
```

---

### Diagrama de Secuencia

Ejemplo básico del procedimiento, sin utilizar los nombres de los métodos


```mermaid
sequenceDiagram
    participant Model
    participant Controller
    participant View
    Controller->>Model: Puedes crear un coche?
    activate Model
    Model-->>Controller: Creado!
    deactivate Model
    Controller->>+View: Muestra la velocidad, porfa
    activate View
    View->>-View: Mostrando velocidad
    View-->>Controller: Listo!
    deactivate View
```

El mismo diagrama con los nombres de los métodos

```mermaid
sequenceDiagram
    participant Model
    participant Controller
    participant View
    Controller->>Model: crearCoche("Mercedes", "BXK 1234")
    activate Model
    Model-->>Controller: Coche
    deactivate Model
    Controller->>+View: muestraVelocidad("BXK 1234", velocidad)
    activate View
    View->>-View: System.out.println()
    View-->>Controller: boolean
    deactivate View
```

### Examen 3
## Primera Parte

Editamos la clase Model para añadir un Singleton. Lo que vamos a hacer es que el constructor sea privado y añadir un método estático que devuelva la instancia de la clase. 

```java
public class Model {
    private static Model instance = null;
    private ArrayList<Coche> parking;

    private Model() {
        parking = new ArrayList<>();
    }

    public static Model getInstance() {
        if (instance == null) {
            instance = new Model();
        }
        return instance;
    }
    
}
```
Todo esto lo hacemos en una rama nueva llamada "examen3".

## Segunda Parte
Aqui vamos a añadir a Model un método para buscar un coche por su matricula. 

```java
 public static Coche buscarMatricula(String matricula){
    for (Coche coche : parking){
        if (coche.matricula.equals(matricula)){
            return coche;
        }
    }
    return null;
}
```
Este método lo vamos a implementar en la clase Controller.

Luego tendremos que implementarlo a otras clases distintas. Por ejemplo en controller:

```java
public void buscarYMostrarCoche(String matricula) {
        Coche coche = Model.getInstance().buscarMatricula(matricula);
        View.mostrarCoche(coche);
    }
```
Aqui lo que hacemos es buscar el coche por su matricula y luego mostrarlo.

Luego lo implementamos en la clase View:

```java
public static void mostrarCoche(Coche coche) {
    if (coche != null) {
        System.out.println("Matrícula: " + coche.matricula);
        System.out.println("Modelo: " + coche.modelo);
        System.out.println("Velocidad: " + coche.velocidad);
    } else {
        System.out.println("No se encontró el coche.");
    }
}
```
Por último, lo implementamos en la clase App.