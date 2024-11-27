public class PromedioNumeros {
    public static void main(String[] args) {
        int num1 = 10, num2 = 20, num3 = 30;

        // Calcular el promedio
        double promedio = (num1 + num2 + num3) / 3.0;

        // Encontrar el número máximo y el número mínimo
        int max = Math.max(num1, Math.max(num2, num3));
        int min = Math.min(num1, Math.min(num2, num3));

        // Imprimir los resultados
        System.out.println("Promedio: " + promedio);
        System.out.println("Número máximo: " + max);
        System.out.println("Número mínimo: " + min);
    }
}
