package ar.edu.unju.escmi.tp2.ejercicio17;
public class Ejercicio17 {

    public static void main(String[] args) {

        // Caso 1: Valores iguales dentro del rango [-128, 127]
        System.out.println("---- Caso 1: Valores Iguales ----");
        Integer num1 = 50;
        Integer num2 = 50;

        // Imprimir referencias de memoria
        System.out.println("Referencia de num1 es: " + System.identityHashCode(num1));
        System.out.println("Referencia de num2 es: " + System.identityHashCode(num2));

        // Comparar referencias con el operador '=='
        if (num1 == num2) {
            System.out.println("Las referencias son iguales (==)");
        } else {
            System.out.println("Las referencias NO son iguales (==)");
        }

        // Comparar valores con el método 'equals()'
        if (num1.equals(num2)) {
            System.out.println("Los valores son iguales (equals())");
        } else {
            System.out.println("Los valores NO son iguales (equals())");
        }

        System.out.println("\n----------------------------------");

        // Caso 2: Valores distintos dentro del rango [-128, 127]
        System.out.println("---- Caso 2: Valores Distintos ----");
        num1 = 50;
        num2 = 80;

        // Imprimir referencias de memoria
        System.out.println("Referencia de num1 es: " + System.identityHashCode(num1));
        System.out.println("Referencia de num2 es: " + System.identityHashCode(num2));

        // Comparar referencias con el operador '=='
        if (num1 == num2) {
            System.out.println("Las referencias son iguales (==)");
        } else {
            System.out.println("Las referencias NO son iguales (==)");
        }

        // Comparar valores con el método 'equals()'
        if (num1.equals(num2)) {
            System.out.println("Los valores son iguales (equals())");
        } else {
            System.out.println("Los valores NO son iguales (equals())");
        }
    }
}