package ar.edu.unju.escmi.tp2.ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresá un año: ");
        String entrada = sc.nextLine().trim();

        try {
            int año = Integer.parseInt(entrada);

            boolean esBisiesto = (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);

            if (esBisiesto) {
                System.out.println(año + " es un año bisiesto.");
            } else {
                System.out.println(año + " NO es un año bisiesto.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida. Debe ser un número entero de año.");
        } finally {
            sc.close();
        }
    }
}