import java.util.Scanner;

public class CompararCadenas2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la primera cadena: ");
        String cadena1 = scanner.nextLine();
        System.out.print("Ingresa la segunda cadena: ");
        String cadena2 = scanner.nextLine();

        int resultado = cadena1.compareTo(cadena2);
        if (resultado == 0) {
            System.out.println("Las cadenas son iguales.");
        } else if (resultado < 0) {
            System.out.println("La primera cadena es alfabéticamente menor.");
        } else {
            System.out.println("La primera cadena es alfabéticamente mayor.");
        }
    }
}
