public class CortoCircuitoComplejo {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = true;

        // Expresión con cortocircuito
        boolean resultado = (a && b) || (c && !b);
        System.out.println("Resultado de expresión con cortocircuito: " + resultado);  // true
    }
}
