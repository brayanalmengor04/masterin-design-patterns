package Conexion;

/**
 * Clase que implementa el patrón Singleton para gestionar la conexión a la base de datos.
 * <p>
 * Esta clase garantiza que solo exista una única instancia de la conexión a la base de datos
 * durante todo el ciclo de vida de la aplicación. El constructor es privado para evitar
 * la creación de múltiples instancias y el acceso a la instancia se controla mediante el método
 * estático {@link #getInstance()}.
 * </p>
 * <b>Uso:</b>
 * <pre>
 *     DataBaseGetConexion conexion = DataBaseGetConexion.getInstance();
 *     conexion.query("SELECT * FROM tabla");
 * </pre>
 * @version 1.0
 */
public class DataBaseGetConexion {
    /**
     * Instancia única de la clase {@code DataBaseGetConexion}.
     * <p>
     * Esta variable estática mantiene la única instancia de la clase para
     * garantizar el patrón Singleton.
     * </p>
     */
    private static DataBaseGetConexion instance;
    /**
     * Constructor privado de la clase {@code DataBaseGetConexion}.
     * <p>
     * Este constructor es privado para evitar que se creen nuevas instancias
     * fuera de esta clase. La instancia solo se crea a través del método
     * {@link #getInstance()}.
     * </p>
     */
    private DataBaseGetConexion() {System.out.println("Conectando la base de datos...");}
    /**
     * Obtiene la instancia única de la clase {@code DataBaseGetConexion}.
     * <p>
     * Si la instancia no ha sido creada, este método la crea. Si ya existe una
     * instancia, simplemente la devuelve.
     * </p>
     *
     * @return La única instancia de {@code DataBaseGetConexion}.
     */
    public static DataBaseGetConexion getInstance() {
        if (instance == null) {
            instance = new DataBaseGetConexion();
        }
        return instance;
    }

    /**
     * Ejecuta una consulta en la base de datos.
     * <p>
     * Este método simula la ejecución de una consulta en la base de datos.
     * En un escenario real, debería conectarse a la base de datos y ejecutar
     * la consulta especificada.
     * </p>
     *
     * @param query La consulta SQL que se desea ejecutar.
     */
    public void query(String query) {
        System.out.println("Ejecutando consulta: " + query);
    }
}
