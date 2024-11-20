package observador;

import java.util.Scanner;

/**
 *
 * @author Daniel Santiago Parra Escobar
 */
public class Main {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        Correo correo = new Correo("Juan Pérez", "juanperez@gmail.com",  "321");

        // Crear observadores
        ServicioNotificacion servicioNotificacion = new ServicioNotificacion();
        RegistroDeActividades registroDeActividades = new RegistroDeActividades();

        // Suscribir los observadores al usuario
        correo.agregarObservador(servicioNotificacion);
        correo.agregarObservador(registroDeActividades);
        
        System.out.println("Ingrese la nueva contraseña: ");
        String nuevaContrasena = sc.next();
        correo.CambiarContrasena(nuevaContrasena);
       
    }
    
}
