package ar.edu.unju.escmi.tp2.ejercicio19;

public class Ejercicio19 {
    public static void main(String[] args) {
        String texto1 = "Hola";
        String texto2 = "Hola";
        String texto3 = new String("Hola");

        // Imprimir "referencias" usando identityHashCode (no es la dirección real, pero sirve para diferenciarlas)
        System.out.println("Ref texto1: " + System.identityHashCode(texto1));
        System.out.println("Ref texto2: " + System.identityHashCode(texto2));
        System.out.println("Ref texto3: " + System.identityHashCode(texto3));
        System.out.println();

        // Comparaciones de referencia (==) y de valor (equals)
        System.out.println("texto1 == texto2  -> " + (texto1 == texto2));
        System.out.println("texto1.equals(texto2) -> " + texto1.equals(texto2));
        System.out.println();

        System.out.println("texto1 == texto3  -> " + (texto1 == texto3));
        System.out.println("texto1.equals(texto3) -> " + texto1.equals(texto3));
        System.out.println();

        // Explicación breve en consola
        System.out.println("Explicación:");
        System.out.println("- Los literales de String se almacenan en el \"String Pool\"; por eso texto1 y texto2");
        System.out.println("  referencian el mismo objeto internado y (texto1 == texto2) es true.");
        System.out.println("- new String(\"Hola\") crea SIEMPRE un nuevo objeto en el heap, distinto del del pool,");
        System.out.println("  por eso (texto1 == texto3) es false.");
        System.out.println("- equals() compara el CONTENIDO (secuencias de caracteres), por lo que en ambos casos");
        System.out.println("  equals devuelve true ya que todos contienen \"Hola\".");
    }
}