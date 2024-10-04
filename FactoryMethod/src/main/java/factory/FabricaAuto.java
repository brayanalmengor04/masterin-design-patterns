package factory;

import vehiculos.Vehiculo;
import vehiculos.impl.Auto;
/**
 * Fábrica concreta que crea una instancia de la clase {@link Auto}.
 * <p>Implementa el Factory Method definido en {@link FabricaVehiculo} para crear un auto.</p>
 * <b>Uso:</b>
 * <pre>
 *     FabricaVehiculo fabrica = new FabricaAuto();
 *     Vehiculo auto = fabrica.crearVehiculo();
 *     auto.conducir();
 * </pre>
 * @version 1.0
 */
public class FabricaAuto extends FabricaVehiculo {
    /**
     * Crea una instancia de {@link Auto}.
     * @return una nueva instancia de Auto.
     */
    @Override
    public Vehiculo crearVehiculo() {
        return new Auto();
    }
}
