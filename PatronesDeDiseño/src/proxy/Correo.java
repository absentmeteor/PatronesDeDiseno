
package proxy;



/**
 *
 * @author Daniel Santiago Parra Escobar
 */
public class Correo {
    private String nombre;
    private String email;
    private String password;
    private boolean permisosDeCambio ;

    public Correo(String nombre, String email,  String password, boolean permisosDeCambio) {
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        this.permisosDeCambio = permisosDeCambio;
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
    
     public void setPermisosDeCambio(boolean permisosDeCambio) {
        this.permisosDeCambio = permisosDeCambio;
    }

    public boolean tienePermisosDeCambio() {
        return permisosDeCambio;
    }   
    
}
