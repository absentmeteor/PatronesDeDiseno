
package plantillaDeMetodo;

/**
 *
 * @author Daniel Santiago Parra Escobar
 */
public class CambioContrasenaConDobleFactor extends CambioContrasenaTemplate {
   private SistemaAutenticacion sistemaAutenticacion;

    @Override
    protected boolean verificarContrasenaActual(Correo correo) {
        sistemaAutenticacion = new SistemaAutenticacion();
        return sistemaAutenticacion.verificarContrasenaActual(correo, correo.getPassword());
    }

    @Override
    protected void actualizarContrasena(Correo correo, String nuevaContrasena) {
        if (verificarContrasenaActual(correo)) {
            correo.setPassword(nuevaContrasena);
        }

    }

}
