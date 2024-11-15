import java.util.Scanner;

public class RangoEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();

        if (edad >= 18 && edad <= 30) {
            System.out.println("Eres joven adulto.");
        } else if (edad >= 31 && edad <= 50) {
            System.out.println("Eres adulto.");
        } else {
            System.out.println("Edad fuera de rango.");
        }
    }
}