package factory;

import vehiculos.Vehiculo;

/**
 * Clase abstracta que define el Factory Method para crear vehículos.
 * <p>
 * Las subclases deben implementar el método {@link #crearVehiculo()} para proporcionar
 * una instancia de un vehículo específico.
 * </p>
 * <b>Uso:</b>
 * <pre>
 *     FabricaVehiculo fabrica = new FabricaAuto();
 *     Vehiculo auto = fabrica.crearVehiculo();
 *     auto.conducir();
 * </pre>
 * @version 1.0
 */
public abstract class FabricaVehiculo {
    /**
     * Método abstracto que debe ser implementado por las subclases para crear
     * una instancia de un vehículo.
     * @return una nueva instancia de un vehículo.
     */
    public abstract Vehiculo crearVehiculo();
}
