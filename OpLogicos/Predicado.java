import java.util.Scanner;

public class Predicado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el valor de a (true/false): ");
        boolean a = scanner.nextBoolean();
        System.out.print("Ingresa el valor de b (true/false): ");
        boolean b = scanner.nextBoolean();

        boolean resultado = !(a && b) || (b && !a);
        System.out.println("Resultado de !(a && b) || (b && !a): " + resultado);
    }
}
