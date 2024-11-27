import java.util.Scanner;

public class ImprimirPalabraWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar la palabra y el número de repeticiones
        System.out.print("Introduce la palabra: ");
        String palabra = scanner.nextLine();
        
        System.out.print("Introduce cuántas veces imprimir la palabra: ");
        int n = scanner.nextInt();
        
        // Inicializar el contador
        int i = 1;
        
        // Ciclo 'while' para imprimir la palabra n veces
        while (i <= n) {
            System.out.println(palabra);  // Imprimir la palabra
            i++;  // Incrementar el contador
        }
    }
}
