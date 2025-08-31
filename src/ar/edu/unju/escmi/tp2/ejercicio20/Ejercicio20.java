package ar.edu.unju.escmi.tp2.ejercicio20;

public class Ejercicio20 {
    public static void main(String[] args) {
        String textoOriginal = "Nombre";
        String textoModificado = textoOriginal.replace("e", "a");
        System.out.println("textoOriginal = " + textoOriginal);
        System.out.println("textoModificado = " + textoModificado);
    }
}

/*  ¿Por qué el valor de textoOriginal no cambia después de llamar al método replace()? 
    El valor de textoOriginal no cambia porque los strings son inmutables. 
    Entonces, cuando se ejecuta replace, no se modifica el objeto original, sino que se crea un nuevo objeto String con los cambios. 
    El valor de textoOriginal sigue siendo "Nombre", y a textoModificado se le asigna una direccion de memoria distinta, con su propio valor.
 */
