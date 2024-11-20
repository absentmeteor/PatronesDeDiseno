package proxy;

import java.util.Scanner;

/**
 *
 * @author Daniel Santiago Parra Escobar
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Correo correo = new Correo("Juan Perez", "juan", "123", false);
        System.out.println("Ingrese la contrasena anterior:");
        String oldPassword = sc.next();
        SistemaAutenticacion system = new SistemaAutenticacion();

        if (system.verificarContrasenaActual(correo, oldPassword)) {
            correo.setPermisosDeCambio(true);
            SistemaAutenticacionProxy sistemaProxy = new SistemaAutenticacionProxy();
            System.out.println("Ingrese la nueva contraseña: ");
            String NewPassword = sc.next();
            sistemaProxy.CambiarContrasena(correo, NewPassword);
            System.out.println("Contrasena actual:" + correo.getPassword());
        } else {
            System.out.println("La contraseña anterior es incorrecta, el usuario no tiene permisos de cambio");
        }

    }

}
