
package observador;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Daniel Santiago Parra Escobar
 */
public class Correo {
    private String nombre;
    private String email;
    private String password;
     private List<Observador> observadores = new ArrayList<>();

    public Correo(String nombre, String email,  String password) {
        this.nombre = nombre;
        this.email = email;
        this.password = password;
    }

     public void CambiarContrasena(String nuevaContrasena) {
        setPassword( nuevaContrasena);
        System.out.println("Contraseña cambiada para el usuario: " + nombre);
        notificarObservadores();
    }
    
     public void agregarObservador(Observador observador) {
        observadores.add(observador);
    }

    public void eliminarObservador(Observador observador) {
        observadores.remove(observador);
    }

    private void notificarObservadores() {
        for (Observador observador : observadores) {
            observador.actualizar(this);
        }
    }
    // Getters y Setters
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
}
