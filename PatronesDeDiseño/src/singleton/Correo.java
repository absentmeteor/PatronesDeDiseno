
package singleton;

/**
 *
 * @author Daniel Santiago Parra Escobar
 */
public class Correo {
    private String nombre;
    private String email;
    private String password;

    public Correo(String nombre, String email,  String password) {
        this.nombre = nombre;
        this.email = email;
        this.password = password;
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
