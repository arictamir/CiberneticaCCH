public class FuncionesMath {
    public static void main(String[] args) {
        // Valor absoluto
        int x = -10;
        System.out.println("Valor absoluto de " + x + ": " + Math.abs(x));  // 10

        // Raíz cuadrada
        double y = 16;
        System.out.println("Raíz cuadrada de " + y + ": " + Math.sqrt(y));  // 4.0

        // Potencia
        double base = 2;
        double exponente = 3;
        System.out.println(base + " elevado a " + exponente + ": " + Math.pow(base, exponente));  // 8.0

        // Valor máximo entre dos números
        int a = 5, b = 10;
        System.out.println("Máximo entre " + a + " y " + b + ": " + Math.max(a, b));  // 10

        // Valor mínimo entre dos números
        System.out.println("Mínimo entre " + a + " y " + b + ": " + Math.min(a, b));  // 5

        // Número aleatorio entre 0 y 1
        System.out.println("Número aleatorio entre 0 y 1: " + Math.random());

        // Uso de una expresión más compleja
        double resultado = Math.sqrt(Math.pow(3, 2) + Math.pow(4, 2));
        System.out.println("Resultado de la fórmula de Pitágoras: " + resultado);  // 5.0
    }
}
