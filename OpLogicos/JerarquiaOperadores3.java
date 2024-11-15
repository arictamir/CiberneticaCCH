public class JerarquiaOperadores3 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = true;
        
        // Con paréntesis diferentes
        boolean resultado = !(a && b) || c;
        System.out.println("Resultado: " + resultado);  // true
    }
}
