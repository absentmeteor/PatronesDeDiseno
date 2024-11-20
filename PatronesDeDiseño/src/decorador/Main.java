package decorador;

import java.util.Scanner;

/**
 *
 * @author Daniel Santiago Parra Escobar
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Correo correo = new Correo("Juan Perez", "juan@gmail.com", "123", "3124567890");
        SistemaAutenticacion sistemaAutenticacion = new SistemaAutenticacion();
        ServicioNotificacion servicioNotificacion = new ServicioNotificacion();
        System.out.println("Ingrese la contraseña anterior:");
        String oldPassword = sc.next();
        if (sistemaAutenticacion.verificarContrasenaActual(correo, oldPassword)) {
            CambioContrasenaConNotificacion cambioConSms = new CambioContrasenaConNotificacion(sistemaAutenticacion, servicioNotificacion);
            // Realiza el cambio de contraseña y envía el SMS
            System.out.println("Ingrese la nueva contraseña: ");
            String NewPassword = sc.next();
            cambioConSms.cambiarContrasena(correo, NewPassword);
            System.out.println("Su contraseña actual es:" + correo.getPassword());
        } else {
            System.out.println("Contraseña actual incorrecta.");
        }

    }

}
