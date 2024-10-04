package vehiculos;

/**
 * Interfaz que define el comportamiento que debe implementar cualquier tipo de vehículo.
 * <p>
 * Cualquier clase que implemente esta interfaz debe proporcionar su propia implementación
 * del método {@link #conducir()}, que describe cómo se conduce ese vehículo en particular.
 * </p>
 *
 * <b>Uso:</b>
 * <pre>
 *     Vehiculo vehiculo = new Auto();
 *     vehiculo.conducir();
 * </pre>
 * @version 1.0
 */
public interface Vehiculo {
    /**
     * Método que simula la acción de conducir un vehículo.
     */
    void conducir();
}
