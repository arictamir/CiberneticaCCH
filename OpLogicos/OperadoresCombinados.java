public class OperadoresCombinados {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = true;
        
        // Combinando operadores lógicos
        System.out.println("(a && b) || c: " + ((a && b) || c));  // true, porque c es verdadero
        System.out.println("!(a && b): " + !(a && b));  // true, porque a && b es false
    }
}
