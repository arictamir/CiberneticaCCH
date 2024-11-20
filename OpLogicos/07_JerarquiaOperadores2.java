public class JerarquiaOperadores2 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = true;
        
        // Usando paréntesis para cambiar la precedencia
        boolean resultado = !(a || b) && c;
        System.out.println("Resultado: " + resultado);  // true
    }
}
