# Problema: Sistema de Transporte

Imagina que estás desarrollando un sistema para una empresa de transporte que maneja distintos tipos de vehículos: autos, camiones y motocicletas. Cada tipo de vehículo tiene diferentes características y métodos de transporte (por ejemplo, la capacidad de pasajeros, el tipo de combustible, etc.). La empresa quiere agregar nuevos tipos de vehículos en el futuro sin alterar mucho el código existente.

El problema aquí es que no queremos que la lógica de creación de estos vehículos esté esparcida por todo el código. Queremos centralizar y simplificar el proceso de creación de los vehículos.

Este es un caso típico donde el **Factory Method** es útil. Podemos crear una fábrica que se encargue de instanciar los diferentes tipos de vehículos sin que el código cliente tenga que preocuparse por los detalles de cada clase.

## Objetivo

Crear un sistema en el que podamos pedir vehículos al "sistema de transporte" sin tener que preocuparnos por cuál es la clase concreta que se instancia. En su lugar, usaremos un método de fábrica para delegar esta responsabilidad.

## 1 Interface Vehiculo
Esta interfaz define el comportamiento común que deben implementar todos los tipos de vehículos. A través de esta interfaz, el sistema puede interactuar con cualquier vehículo sin conocer su clase específica.
```java
package vehiculos;

public interface Vehiculo {
    /**
     * Método que simula  acción de conducir un vehículo.
     */
    void conducir();
} 
```


### 2. Clases Concretas de Vehículos

En este caso cree una clase llamada auto para implementar el metodo de la interfaz Vehiculo
````java 
public class Auto implements Vehiculo {
    /**
     * Implementación del método Vehiculo.conducir() para los autos.
     * Muestra un mensaje en consola simulando la acción de conducir un auto.
     */
    @Override
    public void conducir() {
        System.out.println("Estoy conduciendo un auto!");
    }
}
```` 
Cada tipo de vehículo, como `Auto`, `Camión` o `Motocicleta`, implementa la interfaz `Vehiculo` y proporciona su propia lógica específica, como la forma en que se conduce o se opera.
### 3. Paquete `Factory`

El paquete `factory` es donde se implementa el patrón **Factory Method**. El patrón permite que la creación de objetos se centralice en una fábrica, que es responsable de instanciar los vehículos sin necesidad de que el cliente conozca los detalles internos de cómo se crean.

### 4. Clase Abstracta `FabricaVehiculo` 
Esta clase abstracta define el método de fábrica que será implementado por las subclases concretas. Este método es el encargado de crear una instancia de un vehículo.
````java 
public abstract class FabricaVehiculo {
    /**
     * Método abstracto que debe ser implementado por las subclases para crear
     * una instancia de un vehículo.
     * @return una nueva instancia de un vehículo.
     */
    public abstract Vehiculo crearVehiculo();
}
```` 

### 5. Clases Concretas de Fábrica
Cada subclase concreta de `FabricaVehiculo`, como `FabricaAuto`, `FabricaCamion`, etc., implementa el método de fábrica para crear el tipo de vehículo correspondiente.
````java 
public class FabricaAuto extends FabricaVehiculo {
    /**
     * Crea una instancia de Auto
     * @return una nueva instancia de Auto.
     */
    @Override
    public Vehiculo crearVehiculo() {
        return new Auto();
    }
}
````

### 6. Ejemplo de Uso 
En el método `main`, el cliente puede utilizar una fábrica concreta (por ejemplo, `FabricaAuto`) para crear un vehículo sin conocer su implementación interna. Luego, el cliente puede interactuar con el vehículo creado a través de la interfaz `Vehiculo`.
````java 

public class Main {
    public static void main(String[] args) {
        // Crear una fábrica de autos y conducir el auto creado
        FabricaVehiculo fabricaAuto = new FabricaAuto();
        Vehiculo auto = fabricaAuto.crearVehiculo();
        auto.conducir();
    }
}
```` 

### Descripción de las Carpetas y Archivos

- **Main.java**: El punto de entrada del sistema donde se crean los vehículos utilizando las fábricas.
- **vehiculos**: Paquete que contiene la interfaz `Vehiculo` y sus implementaciones concretas.
    - **Vehiculo.java**: La interfaz que define los métodos que deben implementar todos los vehículos.
    - **impl**: Subpaquete que contiene las implementaciones concretas de la interfaz `Vehiculo`, como `Auto`, `Camion`, `Moto` y `Bicicleta`.
- **fabrica**: Paquete que implementa el **Factory Method**.
    - **FabricaVehiculo.java**: Clase abstracta que define el método de fábrica para la creación de vehículos.
    - **FabricaAuto.java**, **FabricaCamion.java**, **FabricaMoto.java**, **FabricaBicicleta.java**: Fábricas concretas que crean las instancias de los vehículos correspondientes.

![Estructura del Proyecto](/img/estructurafactory.png)
## Beneficios del Factory Method

- **Desacoplamiento**: El cliente no necesita conocer las clases concretas de los vehículos. Solo interactúa con la interfaz `Vehiculo`.
- **Facilidad de extensión**: Si se necesitan agregar nuevos tipos de vehículos en el futuro, solo se crea una nueva subclase de `FabricaVehiculo` sin modificar el código existente.
- **Centralización**: La lógica de creación de objetos está centralizada en las fábricas, lo que simplifica el mantenimiento y la evolución del sistema.

## Porque utilizarlo?
El **Factory Method** es una excelente solución para sistemas que necesitan flexibilidad al momento de crear objetos. En este caso, el patrón permite manejar fácilmente la creación de diferentes tipos de vehículos sin depender de clases concretas, facilitando la extensión del sistema en el futuro.
