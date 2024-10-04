import factory.*;
import vehiculos.Vehiculo;

/**
 * Clase principal para demostrar el uso del patrón de diseño Factory Method.
 * <p>
 * Esta clase crea diferentes tipos de vehículos utilizando las fábricas correspondientes
 * y luego invoca el método {@link Vehiculo#conducir()} para cada vehículo.
 * </p>
 *
 * <b>Uso:</b>
 * <pre>
 *     Main.main(args);
 * </pre>
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        // Crear una fábrica de autos y conducir el auto creado
        FabricaVehiculo fabricaAuto = new FabricaAuto();
        Vehiculo auto = fabricaAuto.crearVehiculo();
        auto.conducir();

        // Crear una fábrica de bicicletas y conducir la bicicleta creada
        FabricaVehiculo fabricaBicicleta = new FabricaBicicleta();
        Vehiculo bicicleta = fabricaBicicleta.crearVehiculo();
        bicicleta.conducir();

        // Crear una fábrica de camiones y conducir el camión creado
        FabricaVehiculo fabricaCamion = new FabricaCamion();
        Vehiculo camion = fabricaCamion.crearVehiculo();
        camion.conducir();

        // Crear una fábrica de motos y conducir la moto creada
        FabricaVehiculo fabricaMoto = new FabricaMoto();
        Vehiculo moto = fabricaMoto.crearVehiculo();
        moto.conducir();
    }
}
