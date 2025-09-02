package ar.edu.unju.escmi.tp2.ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        int[] numeros = new int[8];
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresá 8 números enteros:");
        for (int i = 0; i < numeros.length; i++) {
            while (true) {
                System.out.print("Valor para índice " + i + ": ");
                String entrada = sc.nextLine().trim();
                try {
                    numeros[i] = Integer.parseInt(entrada);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Entrada inválida. Probá de nuevo con un entero.");
                }
            }
        }

        System.out.println("\nContenido del array (índice -> valor):");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(i + " -> " + numeros[i]);
        }

        sc.close();
    }
}