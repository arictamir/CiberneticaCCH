import java.util.Scanner;

public class AccesoSitio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Estás autenticado (true/false)? ");
        boolean autenticado = scanner.nextBoolean();
        System.out.print("¿Tienes más de 18 años (true/false)? ");
        boolean mayorDe18 = scanner.nextBoolean();

        if (autenticado && mayorDe18) {
            System.out.println("Acceso concedido.");
        } else {
            System.out.println("Acceso denegado.");
        }
    }
}
