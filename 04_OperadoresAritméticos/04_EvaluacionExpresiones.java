public class EvaluacionExpresiones {
    public static void main(String[] args) {
        int a = 7, b = 2;
        double c = 3.5;

        // Ejemplo de expresión con solo enteros
        int resultadoInt = a / b;  // División de enteros
        System.out.println("Resultado de a / b (enteros): " + resultadoInt);  // 3

        // Ejemplo de expresión con double
        double resultadoDouble = a / c;  // División entre un entero y un double
        System.out.println("Resultado de a / c (double): " + resultadoDouble);  // 2.0

        // Ejemplo con conversión implícita
        double resultado = (double) a / b;  // Convertir a double antes de la división
        System.out.println("Resultado de a / b convertido a double: " + resultado);  // 3.5

        // Ejemplo de expresión con mezcla de operaciones
        double expresion = (a + c) * b / 2.0;
        System.out.println("Resultado de la expresión compleja: " + expresion);  // 13.25
    }
}
