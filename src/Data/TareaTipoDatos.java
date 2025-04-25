/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

/**
 *
 * @author Soporte
 */
public class TareaTipoDatos {
    public void principal() {
        // Tipos de datos primitivos
        int entero = 100;
        double decimal = 3.14;
        char letra = 'A';
        boolean esVerdad = true;

        // Tipos de datos no primitivos
        String texto = "Hola Mundo";
        int[] numeros = {1, 2, 3, 4, 5};  // Arreglo de enteros
        java.util.List<String> lista = new java.util.ArrayList<>();
        lista.add("Manzana");
        lista.add("Banana");

        // Mostrar los valores
        System.out.println("Tipo int: " + entero);
        System.out.println("Tipo double: " + decimal);
        System.out.println("Tipo char: " + letra);
        System.out.println("Tipo boolean: " + esVerdad);
        System.out.println("Tipo String: " + texto);
        System.out.println("Tipo Array: ");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();  // Salto de línea

        System.out.println("Tipo List<String>: " + lista);
    }
}
