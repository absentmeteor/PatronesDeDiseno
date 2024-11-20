
package singleton;

/**
 *
 * @author Daniel Santiago Parra Escobar
 */
public class SistemaAutenticacion {
    // Atributos del sistema de autenticación
    private static SistemaAutenticacion instancia;
    private String contrasenaActual;
    
    private SistemaAutenticacion() {}

    // Método para acceder a la única instancia de la clase
    public static SistemaAutenticacion getInstancia() {
        if (instancia == null) {
            instancia = new SistemaAutenticacion();
        }
        return instancia;
    }

    // Métodos de la clase SistemaAutenticacion
    public boolean verificarContrasenaActual(Correo correo, String contrasenaActual) {
        return correo.getPassword().equals(contrasenaActual);
    }

    public void actualizarContrasena(Correo correo, String nuevaContrasena) {
        if (nuevaContrasena != null && !nuevaContrasena.isEmpty()) {
            correo.setPassword(nuevaContrasena);
            System.out.println("La contraseña ha sido actualizada correctamente.");
        } else {
            System.out.println("Error: La nueva contraseña no puede estar vacía.");
        }
    }
}
