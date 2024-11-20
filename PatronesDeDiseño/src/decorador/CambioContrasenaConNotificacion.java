package decorador;

/**
 *
 * @author Daniel Santiago Parra Escobar
 */
public class CambioContrasenaConNotificacion extends CambioContrasenaBase {

    private ServicioNotificacion servicioNotificacion;

    public CambioContrasenaConNotificacion(SistemaAutenticacion sistemaAutenticacion, ServicioNotificacion servicioNotificacion) {
        super(sistemaAutenticacion);
    }

    @Override
    public void cambiarContrasena(Correo correo, String nuevaContrasena) {
        servicioNotificacion = new ServicioNotificacion();
        servicioNotificacion.enviarSMSConfirmacion(correo.getTelefono());
        super.cambiarContrasena(correo, nuevaContrasena);

    }
}
