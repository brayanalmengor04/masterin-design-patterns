package factory;

import vehiculos.Vehiculo;
import vehiculos.impl.Auto;
import vehiculos.impl.Camion;
/**
 * Fábrica concreta que crea una instancia de la clase {@link Camion}.
 * <p>Implementa el Factory Method definido en {@link FabricaVehiculo} para crear un auto.</p>
 * <b>Uso:</b>
 * <pre>
 *     FabricaVehiculo fabrica = new FabricaAuto();
 *     Vehiculo auto = fabrica.crearVehiculo();
 *     auto.conducir();
 * </pre>
 * @version 1.0
 */
public class FabricaCamion extends FabricaVehiculo {
    @Override
    public Vehiculo crearVehiculo() {
        return new Camion();
    }
}
