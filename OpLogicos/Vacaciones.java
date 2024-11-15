import java.util.Scanner;

public class Vacaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cuántos años de antigüedad tienes? ");
        int antiguedad = scanner.nextInt();
        System.out.print("¿Has completado todas tus tareas? (true/false) ");
        boolean tareasCompletadas = scanner.nextBoolean();

        if (antiguedad > 1 && tareasCompletadas) {
            System.out.println("Puedes tomar vacaciones.");
        } else {
            System.out.println("No puedes tomar vacaciones.");
        }
    }
}
