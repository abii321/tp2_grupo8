package ar.edu.unju.escmi.tp2.ejercicio15;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n=0;
        do{
            System.out.println("Ingrese un número: ");
            n = sc.nextInt();
        } while(n<3 || n>10);

        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            System.out.println("Ingrese un valor: ");
            int val = sc.nextInt();
            arr[i] = val;
        }
        sc.close();

        int suma=0;
        for(int i=0; i<n; i++){
            System.out.println("Posicion: " + i + ", Valor: " + arr[i]);
            suma+=arr[i];
        }
        System.out.println("La suma de todos los valores del array es "+suma);
    }
}
