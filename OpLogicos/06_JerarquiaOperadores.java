public class JerarquiaOperadores {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = true;
        
        // Ejemplo sin paréntesis
        boolean resultado = !a || b && c;
        System.out.println("Resultado: " + resultado);  // true
    }
}
