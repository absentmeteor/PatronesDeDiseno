
package plantillaDeMetodo;

/**
 *
 * @author Daniel Santiago Parra Escobar
 */
public abstract class CambioContrasenaTemplate {
     public final boolean cambiarContrasena(Correo correo, String nuevaContrasena) {
        if (verificarContrasenaActual(correo)) {
            actualizarContrasena(correo, nuevaContrasena);
            return true;
        } else {
            System.out.println("Error: Contraseña actual incorrecta.");
            return false; 
        }
    }

    protected abstract boolean verificarContrasenaActual(Correo correo);
    protected abstract void actualizarContrasena(Correo correo, String nuevaContrasena);
    
}
