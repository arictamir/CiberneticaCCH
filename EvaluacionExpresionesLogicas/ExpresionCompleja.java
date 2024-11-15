public class ExpresionCompleja {
    public static void main(String[] args) {
        boolean p = true, q = false, r = true;
        System.out.println((p && !q) || (r && !p));  // Resultado: true
    }
}
