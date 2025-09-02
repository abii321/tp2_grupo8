package ar.edu.unju.escmi.tp2.ejercicio4;

public class Ejercicio4 {
    public static void main(String[] args) {
        int num = 3;

        // Triangular de num: Tn = num * (num + 1) / 2
        long triangular = (long) num * (num + 1) / 2;

        // Uso de Math.pow (devuelve double): (Tn)^2
        long resultadoConPow = (long) Math.pow(triangular, 2);

        // Alternativa exacta sin pow (opcional, para comparar)
        long resultadoDirecto = triangular * triangular;

        System.out.println("num = " + num);
        System.out.println("Triangular = " + triangular);
        System.out.println("Resultado con Math.pow = " + resultadoConPow);
        System.out.println("Resultado directo      = " + resultadoDirecto);
    }
}
