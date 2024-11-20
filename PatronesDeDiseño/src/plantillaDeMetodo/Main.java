package plantillaDeMetodo;

/**
 *
 * @author Daniel Santiago Parra Escobar
 */
public class Main {

    public static void main(String[] args) {
       Correo correo = new Correo("Juan Perez", "juanperez@gmail.com",  "123");
       
        // Cambio de contraseña con autenticación simple
        CambioContrasenaTemplate cambioSimple = new CambioContrasenaSimple();
        if ( cambioSimple.cambiarContrasena(correo, "789")) {
            System.out.println("Cambio de contraseña realizado con éxito.");
            System.out.println("Nueva contraseña: " + correo.getPassword()); // Verificación del cambio
        } else {
            System.out.println("Fallo en el cambio de contraseña.");
        } 
        
        
        
         // Cambio de contraseña con autenticación de doble factor
        CambioContrasenaTemplate cambioConDobleFactor = new CambioContrasenaConDobleFactor();
        if (cambioConDobleFactor.cambiarContrasena(correo, "456")) {
            System.out.println("Cambio de contraseña realizado con éxito.");
            System.out.println("Nueva contraseña: " + correo.getPassword()); // Verificación del cambio
        } else {
            System.out.println("Fallo en el cambio de contraseña.");
        }
    }
    
}
