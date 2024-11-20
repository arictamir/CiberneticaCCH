public class JerarquiaOperadores {
    public static void main(String[] args) {
        int a = 5, b = 3, c = 2;

        // Sin paréntesis
        int resultado = a + b * c;  // Se evalúa primero la multiplicación
        System.out.println("Resultado sin paréntesis: " + resultado);  // 11 (5 + (3 * 2))

        // Con paréntesis
        resultado = (a + b) * c;  // Se evalúan primero los paréntesis
        System.out.println("Resultado con paréntesis: " + resultado);  // 16 ((5 + 3) * 2)

        // Evaluación con división y multiplicación
        resultado = a * b / c;  // Se evalúa primero la multiplicación, luego la división
        System.out.println("Multiplicación y división: " + resultado);  // 7 (5 * 3 / 2)

        // Uso de paréntesis para cambiar la jerarquía
        resultado = a * (b / c);  // Se evalúa primero la división
        System.out.println("Resultado con paréntesis para cambiar jerarquía: " + resultado);  // 7 (5 * (3 / 2))
    }
}
