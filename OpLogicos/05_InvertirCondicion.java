import java.util.Scanner;

public class InvertirCondicion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();

        if (numero < 10) {
            System.out.println("El número es menor que 10.");
        } else {
            System.out.println("El número es mayor o igual que 10.");
        }

        // Invertir la condición con el operador !
        if (!(numero < 10)) {
            System.out.println("Invertido: El número es mayor o igual que 10.");
        } else {
            System.out.println("Invertido: El número es menor que 10.");
        }
    }
}
