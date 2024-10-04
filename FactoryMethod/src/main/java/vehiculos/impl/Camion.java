package vehiculos.impl;

import vehiculos.Vehiculo;

/**
 * Clase concreta que representa un Camion y que implementa la interfaz {@link Vehiculo}.
 * <p>
 * Esta clase proporciona la implementación específica del método {@link #conducir()}
 * para los camiones .</p>
 * <b>Uso:</b>
 * <pre>
 *     Vehiculo camion = new Camion();
 *     camion.conducir();
 * </pre>
 * @version 1.0
 */
public class Camion implements Vehiculo {
    @Override
    public void conducir() {
        System.out.println("Estou conduciendo un camion!");
    }
}
