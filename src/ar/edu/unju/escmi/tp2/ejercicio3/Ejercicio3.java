package ar.edu.unju.escmi.tp2.ejercicio3;

public class Ejercicio3 {
    public static void main(String[] args) {
        final int CODIGO_POSTAL_JUJUY = 4600;
        final double PI = 3.1415926535;
        final int DIAS_SEMANA = 7;
        final int MESES_ANIO = 12;

        System.out.println("Código postal de Jujuy: " + CODIGO_POSTAL_JUJUY);
        System.out.println("Valor de PI: " + PI);
        System.out.println("Días de la semana: " + DIAS_SEMANA);
        System.out.println("Meses del año: " + MESES_ANIO);
    }
}
//En este caso no es necesario usar la palabra reservada "static" porque las constantes están declaradas dentro del método main, que ya es static.