
package decorador;

/**
 *
  * @author Daniel Santiago Parra Escobar
 */
public class CambioContrasenaBase {
    
    private SistemaAutenticacion sistemaAutenticacion;

    public CambioContrasenaBase(SistemaAutenticacion sistemaAutenticacion) {
        this.sistemaAutenticacion = sistemaAutenticacion;
    }

    public void cambiarContrasena(Correo correo, String nuevaContrasena) {
        if (sistemaAutenticacion.verificarContrasenaActual(correo, correo.getPassword())) {
            sistemaAutenticacion.actualizarContrasena(correo, nuevaContrasena);
        } else {
            System.out.println("Error al verificar la contraseña actual.");
        }
    }
}
