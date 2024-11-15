public class EvaluacionParentesis1 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = true;

        // Usando paréntesis para cambiar el orden de evaluación
        boolean resultado = (a || b) && c;
        System.out.println("Resultado con paréntesis: " + resultado);  // true
    }
}
