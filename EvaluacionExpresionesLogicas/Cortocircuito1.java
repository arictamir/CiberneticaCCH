public class Cortocircuito1 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        // Como a es true, no se evalúa b (cortocircuito)
        if (a || b) {
            System.out.println("Al menos una es verdadera");
        } else {
            System.out.println("Ninguna es verdadera");
        }
    }
}
