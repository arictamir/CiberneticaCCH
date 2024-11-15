import java.util.Scanner;

public class ValidarContrasena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String contrasenaCorrecta = "Java123";
        System.out.print("Ingresa la contraseña: ");
        String contrasenaIngresada = scanner.nextLine();

        if (contrasenaCorrecta.equals(contrasenaIngresada)) {
            System.out.println("Contraseña correcta");
        } else {
            System.out.println("Contraseña incorrecta");
        }
    }
}
