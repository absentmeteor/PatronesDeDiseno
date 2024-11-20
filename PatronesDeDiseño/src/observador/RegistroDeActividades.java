
package observador;

/**
 *
 * @author Daniel Santiago Parra Escobar
 */
public class RegistroDeActividades implements Observador {

    @Override
    public void actualizar(Correo correo) {
        registrarEvento(correo, "La contraseña ha sido actualizada.");
    }

    private void registrarEvento(Correo correo, String descripcion) {
        System.out.println("Evento registrado para el usuario: " + correo.getNombre());
        System.out.println("Descripción del evento: " + descripcion);
    }
}

