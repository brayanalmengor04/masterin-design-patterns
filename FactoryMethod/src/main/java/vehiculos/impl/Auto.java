package vehiculos.impl;

import vehiculos.Vehiculo;

/**
 * Clase concreta que representa un Auto y que implementa la interfaz {@link Vehiculo}.
 * <p>
 * Esta clase proporciona la implementación específica del método {@link #conducir()}
 * para los autos.</p>
 * <b>Uso:</b>
 * <pre>
 *     Vehiculo auto = new Auto();
 *     auto.conducir();
 * </pre>
 * @version 1.0
 */
public class Auto implements Vehiculo {
    /**
     * Implementación del método {@link Vehiculo#conducir()} para los autos.
     * Muestra un mensaje en consola simulando la acción de conducir un auto.
     */
    @Override
    public void conducir() {
        System.out.println("Estoy conduciendo un auto!");
    }
}
