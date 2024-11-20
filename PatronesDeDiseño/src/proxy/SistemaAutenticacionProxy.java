package proxy;

/**
 * @author Daniel Santiago Parra Escobar
 */
public class SistemaAutenticacionProxy implements ISistemaAutenticacion {

    private SistemaAutenticacion sistemaAutenticacion;

    public SistemaAutenticacionProxy() {
        this.sistemaAutenticacion = new SistemaAutenticacion();
    }

    private boolean verificarAcceso(Correo correo) {
        return correo.tienePermisosDeCambio();
    }

    @Override
    public void CambiarContrasena(Correo correo, String nuevaContrasena) {
        if (verificarAcceso(correo)) {
            correo.setPassword(nuevaContrasena);
            System.out.println("Contraseña cambiada con éxito.");
        } else {
            System.out.println("Acceso denegado. No tienes permisos para cambiar la contraseña.");
        }
    }
}
