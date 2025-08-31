package ar.edu.unju.escmi.tp2.ejercicio5;

public class Ejercicio5 {
    public static void main(String[] args) {
        int a = 8, b = 3, c = -5;
        int r1 = a + b + c;
        int r2 = 2 * b + 3 * (a - c);
        double r3 = (double) a / b;
        int r4= a % b; 
        double r5= (double) a / c;
        int r6 = a % c; 
        double r7 = (double) a * b / c;   
        double r8 = a * ((double) b / c); 
        int r9 = (a * c) % b;
        int aux=(c % b); if(aux<0)  aux=1;  
        int r10 = a * aux; 
        int r11 = (3 * a - 2 * b) % (2 * a - c);  
        double r12 = 2 * ((double) a / 5 + (4 - b * 3)) % (a + c - 2);   
        double r13 = (double) (a - 3 * b) % (c + 2 * a) / (a - c); 
        int r14 = a - b - c * 2;

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);
        System.out.println(r6);
        System.out.println(r7);
        System.out.println(r8);
        System.out.println(r9);
        System.out.println(r10);
        System.out.println(r11);
        System.out.println(r12);
        System.out.println(r13);
        System.out.println(r14);
    }
}
