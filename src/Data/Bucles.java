/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

/**
 *
 * @author Soporte
 */
public class Bucles {
        public void principal() {
        // Ejemplo de un bucle for
        System.out.println("=== Bucle For ===");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Valor de i: " + i);
        }
        
        // Ejemplo de un bucle while
        System.out.println("\n=== Bucle While ===");
        int j = 1;
        while (j <= 5) {
            System.out.println("Valor de j: " + j);
            j++;
        }
        
        // Ejemplo de un bucle do-while
        System.out.println("\n=== Bucle Do-While ===");
        int k = 1;
        do {
            System.out.println("Valor de k: " + k);
            k++;
        } while (k <= 5);
    }
}
