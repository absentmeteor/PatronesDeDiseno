
package observador;

/**
 *
 * @author Daniel Santiago Parra Escobar
 */
public class ServicioNotificacion implements Observador {

    @Override
    public void actualizar(Correo correo) {
        enviarCorreoConfirmacion(correo.getEmail());
    }

    private void enviarCorreoConfirmacion(String email) {
        System.out.println("Correo de confirmación enviado a: " + email);
    }
}
