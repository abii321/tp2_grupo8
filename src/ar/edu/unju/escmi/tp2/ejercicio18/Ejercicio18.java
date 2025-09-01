package ar.edu.unju.escmi.tp2.ejercicio18;

public class Ejercicio18 {
    public static void main(String[] args) {
        Integer num1 = 1000;
        Integer num2 = 1000;

        System.out.println("Caso A: num1 = 1000, num2 = 1000");
        System.out.println("Referencia num1: " + System.identityHashCode(num1));
        System.out.println("Referencia num2: " + System.identityHashCode(num2));

        if (num1 == num2)
            System.out.println("Las referencias son iguales");
        else
            System.out.println("Las referencias NO son iguales");

        if (num1.equals(num2))
            System.out.println("Los valores son iguales");
        else
            System.out.println("Los valores NO son iguales");

        System.out.println("\n------------------------------\n");

        Integer num3 = 100;
        Integer num4 = 100;

        System.out.println("Caso B: num3 = 100, num4 = 100");
        System.out.println("Referencia num3: " + System.identityHashCode(num3));
        System.out.println("Referencia num4: " + System.identityHashCode(num4));

        if (num3 == num4)
            System.out.println("Las referencias son iguales");
        else
            System.out.println("Las referencias NO son iguales");

        if (num3.equals(num4))
            System.out.println("Los valores son iguales");
        else
            System.out.println("Los valores NO son iguales");

        System.out.println("\n------------------------------\n");

        Integer num5 = 1000;
        Integer num6 = 3000;

        System.out.println("Caso C: num5 = 1000, num6 = 3000");
        System.out.println("Referencia num5: " + System.identityHashCode(num5));
        System.out.println("Referencia num6: " + System.identityHashCode(num6));

        if (num5 == num6)
            System.out.println("Las referencias son iguales");
        else
            System.out.println("Las referencias NO son iguales");

        if (num5.equals(num6))
            System.out.println("Los valores son iguales");
        else
            System.out.println("Los valores NO son iguales");
    }
}
