public class CompararCadenas {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "java";
        
        System.out.println("str1 == str2: " + str1.equals(str2)); // false
        System.out.println("str1 != str2: " + !str1.equals(str2)); // true
        
        // Comparando usando compareTo
        System.out.println("str1.compareTo(str2): " + str1.compareTo(str2)); // valor negativo (str1 < str2)
    }
}
