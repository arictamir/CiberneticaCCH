import java.util.Scanner;

public class ImprimirPalabra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar la palabra y el número de repeticiones
        System.out.print("Introduce la palabra: ");
        String palabra = scanner.nextLine();
        
        System.out.print("Introduce cuántas veces imprimir la palabra: ");
        int n = scanner.nextInt();
        
        // Ciclo 'for' para imprimir la palabra n veces
        for (int i = 1; i <= n; i++) {
            System.out.println(palabra);  // Imprimir la palabra
        }
    }
}
