import java.util.Scanner;

public class ValidarEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();

        if (edad >= 18) {
            System.out.println("Eres adulto.");
        } else {
            System.out.println("Eres menor de edad.");
        }
    }
}
