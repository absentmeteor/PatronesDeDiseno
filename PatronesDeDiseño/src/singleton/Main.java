
package singleton;

import java.util.Scanner;

/**
 *
 * @author Daniel Santiago Parra Escobar
 */
public class Main {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Creación de un usuario
        Correo correo = new Correo("Juan Perez", "juan@gmail.com", "123");
        
        SistemaAutenticacion sistema = SistemaAutenticacion.getInstancia();
        System.out.println("Ingrese su contraseña anterior: ");
        String oldpassword = sc.next();
        // Verificar la contraseña actual del usuario
        boolean esCorrecta = sistema.verificarContrasenaActual(correo, oldpassword);
        if (esCorrecta) {
            System.out.println("Contraseña actual verificada.");
            System.out.println("Ingrese su nueva contraseña: ");
            String password = sc.next();
            // Actualizar la contraseña del usuario
            sistema.actualizarContrasena(correo, password);
        } else {
            System.out.println("Contraseña actual incorrecta.");
        }
        System.out.println("Su contraseña actual es:"+correo.getPassword());
        
    }
    
}
