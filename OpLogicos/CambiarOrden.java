public class CambiarOrden {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = true;

        System.out.println(!(a || b) && c);  // Resultado: false
        System.out.println(a || (b && c));   // Resultado: true
    }
}
