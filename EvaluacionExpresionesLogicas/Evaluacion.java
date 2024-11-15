public class Evaluacion {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = true;

        // Evaluación compuesta
        boolean resultado = !(a && b) || (b && c);
        System.out.println("Resultado: " + resultado);  // true
    }
}
