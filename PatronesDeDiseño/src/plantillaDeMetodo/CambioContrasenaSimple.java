package plantillaDeMetodo;

/**
 *
 * @author Daniel Santiago Parra Escobar
 */
public class CambioContrasenaSimple extends CambioContrasenaTemplate {

    @Override
    protected boolean verificarContrasenaActual(Correo correo) {
        // Verificación simple de la contraseña actual
        return true;
    }

    @Override
    protected void actualizarContrasena(Correo correo, String nuevaContrasena) {
        if (verificarContrasenaActual(correo)) {
            correo.setPassword(nuevaContrasena);
        }
    }

}
