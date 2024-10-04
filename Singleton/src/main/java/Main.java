import Conexion.DataBaseGetConexion;
/**
 * Clase principal que demuestra el uso del patrón Singleton a través de la clase {@code  DataBaseGetConexion}.
 * <p>
 * Esta clase simula la creación y el uso de una única instancia de la conexión a la base de datos,
 * utilizando el patrón Singleton. Se realizan dos consultas a la base de datos y se verifica que ambas
 * instancias sean idénticas.
 * </p>
 *
 * <b>Ejemplo de uso:</b>
 * <pre>
 *     DataBaseGetConexion instancia1 = DataBaseGetConexion.getInstance();
 *     instancia1.query("SELECT * FROM user");
 *
 *     DataBaseGetConexion instancia2 = DataBaseGetConexion.getInstance();
 *     instancia2.query("SELECT * FROM producto");
 *
 *     if (instancia1 == instancia2) {
 *         System.out.println("Ambas conexiones son la misma instancia!");
 *     } else {
 *         System.out.println("Las conexiones son distintas!");
 *     }
 * </pre>
 *
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {

        DataBaseGetConexion instancia1 = DataBaseGetConexion.getInstance();
        instancia1.query("SELECT * FROM user");
        DataBaseGetConexion instancia2 = DataBaseGetConexion.getInstance();
        instancia2.query("SELECT * FROM producto");

        if (instancia1 == instancia2) {
            System.out.println("Ambas conexiones son la misma instancia!");
        } else {
            System.out.println("Las conexiones son distintas!");
        }
    }
}
