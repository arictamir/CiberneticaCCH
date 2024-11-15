public class Cortocircuito2 {
    public static void main(String[] args) {
        boolean a = false;
        boolean b = true;

        // Como a es false, no se evalúa b (cortocircuito)
        if (a && b) {
            System.out.println("Ambas son verdaderas");
        } else {
            System.out.println("No ambas son verdaderas");
        }
    }
}
