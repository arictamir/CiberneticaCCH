public class OrdenEvaluacion {
    public static void main(String[] args) {
        boolean x = false;
        boolean y = true;
        boolean z = false;

        System.out.println(x || !(y && z));  // Resultado: true
    }
}
