
---
# Problema: Sistema de Transporte



Imagina que estás desarrollando un sistema para una empresa de transporte que maneja distintos tipos de vehículos: autos, camiones y motocicletas. Cada tipo de vehículo tiene diferentes características, como la capacidad de pasajeros y el tipo de combustible. La empresa quiere agregar nuevos tipos de vehículos en el futuro sin alterar mucho el código existente.

El problema aquí es que no queremos que la lógica de creación de estos vehículos esté esparcida por todo el código, ya que dificultaría el mantenimiento y la evolución del sistema. **Queremos centralizar y simplificar el proceso de creación de los vehículos**, de manera que el código cliente no dependa de las clases concretas de vehículos.

## Solución: Patrón Factory Method

Este es un caso típico donde el **Factory Method** es útil. Con este patrón, podemos crear una fábrica que se encargue de instanciar los diferentes tipos de vehículos sin que el código cliente tenga que preocuparse por los detalles de cada clase concreta. Así, podemos agregar nuevos vehículos sin afectar el resto del sistema.

## Objetivo

El objetivo es crear un sistema en el que podamos pedir vehículos al "sistema de transporte" sin tener que preocuparnos por cuál es la clase concreta que se instancia. En su lugar, usaremos un método de fábrica para delegar esta responsabilidad.

---

## 1. Interfaz Vehículo

Esta interfaz define el comportamiento común que deben implementar todos los tipos de vehículos. A través de esta interfaz, el sistema puede interactuar con cualquier vehículo sin conocer su clase específica.

```java
package vehiculos;

public interface Vehiculo {
    /**
     * Método que simula la acción de conducir un vehículo.
     */
    void conducir();
}
```
---

### 2. Clases Concretas de Vehículos

Cada tipo de vehículo, como `Auto`, `Camión`, `Moto`, y `Bicicleta`, implementa la interfaz `Vehiculo` y proporciona su propia lógica específica de conducción.

```java
public class Auto implements Vehiculo {
    @Override
    public void conducir() {
        System.out.println("Estoy conduciendo un auto!");
    }
}
```
---


### 3. Paquete `Factory`

El paquete `factory` es donde se implementa el patrón **Factory Method**. Este patrón permite que la creación de objetos se centralice en una fábrica, que es responsable de instanciar los vehículos sin necesidad de que el cliente conozca los detalles internos de cómo se crean.

---

### 4. Clase Abstracta `FabricaVehiculo`

Esta clase abstracta define el método de fábrica que será implementado por las subclases concretas. Este método es el encargado de crear una instancia de un vehículo.

```java
public abstract class FabricaVehiculo {
    public abstract Vehiculo crearVehiculo();
}
```

---

### 5. Clases Concretas de Fábrica

Cada subclase concreta de `FabricaVehiculo`, como `FabricaAuto`, `FabricaCamion`, `FabricaMoto`, y `FabricaBicicleta`, implementa el método de fábrica para crear el tipo de vehículo correspondiente.

```java
public class FabricaAuto extends FabricaVehiculo {
    @Override
    public Vehiculo crearVehiculo() {
        return new Auto();
    }
}
```
---

### 6. Ejemplo de Uso en el Método Main

En el método `main`, el cliente puede utilizar una fábrica concreta (por ejemplo, `FabricaAuto`) para crear un vehículo sin conocer su implementación interna. Luego, el cliente puede interactuar con el vehículo creado a través de la interfaz `Vehiculo`.

```java
public class Main {
    public static void main(String[] args) {
        FabricaVehiculo fabricaAuto = new FabricaAuto();
        Vehiculo auto = fabricaAuto.crearVehiculo();
        auto.conducir();
    }
}
```

### 7. Descripción de la Estructura del Proyecto

La estructura del proyecto es la siguiente:

```
└── brayandev 
    └── methodFactory 
        ├── Main.java
        ├── vehiculos
        │   ├── Vehiculo.java
        │   └── impl
        │       ├── Auto.java
        │       ├── Camion.java
        │       ├── Moto.java
        │       └── Bicicleta.java
        └── fabrica
            ├── FabricaVehiculo.java
            ├── FabricaAuto.java
            ├── FabricaCamion.java
            ├── FabricaMoto.java
            └── FabricaBicicleta.java
```

### Imagen de la Estructura del Proyecto

### Beneficios del Factory Method

- **Desacoplamiento**: El cliente no necesita conocer las clases concretas de los vehículos. Solo interactúa con la interfaz `Vehiculo`.
- **Facilidad de extensión**: Si se necesitan agregar nuevos tipos de vehículos en el futuro, solo se crea una nueva subclase de `FabricaVehiculo` sin modificar el código existente.
- **Centralización**: La lógica de creación de objetos está centralizada en las fábricas, lo que simplifica el mantenimiento y la evolución del sistema.

### Conclusión: ¿Por qué utilizar el Factory Method?

El **Factory Method** es una excelente solución para sistemas que necesitan flexibilidad al momento de crear objetos. En este caso, el patrón permite manejar fácilmente la creación de diferentes tipos de vehículos sin depender de clases concretas, facilitando la extensión del sistema en el futuro.

---
