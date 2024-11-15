import java.util.Scanner;

public class NumeroPositivoYPar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();

        if (numero > 0 && numero % 2 == 0) {
            System.out.println("El número es positivo y par.");
        } else {
            System.out.println("El número no cumple con las condiciones.");
        }
    }
}
