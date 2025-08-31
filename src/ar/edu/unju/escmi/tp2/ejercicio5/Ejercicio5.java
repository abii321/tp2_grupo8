package ar.edu.unju.escmi.tp2.ejercicio5;

public class Ejercicio5 {
    public static void main(String[] args) {
        short a = 8;
        short b = 3;
        short c = -5;
        System.out.println("a=8, b=3, c=-5");
        System.out.println("a+b+c = " + (a + b + c));
        System.out.println("2*b+3*(a-c) = " + (2 * b + 3 * (a - c)));
        System.out.println("a/b = " + (double)a / (double)b);
        System.out.println("a%b = " + a % b);
        System.out.println("a*b/c = " + (double)a * (double)b / (double)c);
        System.out.println("a*(b/c) = " + (double)a * (double)(b / c));
        System.out.println("(a*c)%b = " + a * c % b);
        System.out.println("a*(c%b) = " + a * (c % b));
        System.out.println("(3*a-2*b)%(2*a-c) = " + (3 * a - 2 * b) % (2 * a - c));
        System.out.println("2*(a/5+(4-b*3))%(a+c-2) = " + 2 * (a / 5 + (4 - b * 3)) % (a + c - 2));
        System.out.println("(a-3*b)%(c+2*a)/(a-c) = " + (a - 3 * b) % (c + 2 * a) / (a - c));
        System.out.println("a-b-c*2 = " + (a - b - c * 2));
    }
}
