
package decorador;

/**
 *
  * @author Daniel Santiago Parra Escobar
 */
public class SistemaAutenticacion {

    public boolean verificarContrasenaActual(Correo correo, String contrasenaActual) {
        return correo.getPassword().equals(contrasenaActual);
    }

    public void actualizarContrasena(Correo correo, String nuevaContrasena) {
        correo.setPassword(nuevaContrasena);
        System.out.println("Contraseña actualizada en el sistema para el usuario: " + correo.getNombre());
    }
}

