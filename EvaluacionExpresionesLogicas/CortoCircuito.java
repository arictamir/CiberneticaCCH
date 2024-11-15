public class CortoCircuito {
    public static void main(String[] args) {
        boolean a = false, b = true;
        System.out.println(a && b); // No se evalúa b, ya que a es false.
        System.out.println(a || b); // No se evalúa b, ya que a es false.
    }
}
