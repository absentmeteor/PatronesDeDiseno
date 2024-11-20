
package proxy;
/**
 * @author Daniel Santiago Parra Escobar
 */
public class SistemaAutenticacion {
    public boolean verificarContrasenaActual(Correo correo, String contrasenaActual) {
        return correo.getPassword().equals(contrasenaActual);
    }
}
