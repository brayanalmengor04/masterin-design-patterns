package vehiculos.impl;

import vehiculos.Vehiculo;


/**
 * Clase concreta que representa una Moto y que implementa la interfaz {@link Vehiculo}.
 * <p>
 * Esta clase proporciona la implementación específica del método {@link #conducir()}
 * para las motos.</p>
 * <b>Uso:</b>
 * <pre>
 *     Vehiculo moto = new Moto();
 *     moto.conducir();
 * </pre>
 * @version 1.0
 */
public class Moto implements Vehiculo {
    @Override
    public void conducir() {
        System.out.println("Estoy conduciendo una moto!");
    }
}
