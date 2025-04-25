/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import java.util.Scanner;

/**
 *
 * @author Soporte
 */
public class Condicionales {
    
        public void principal() {
        // Crear un objeto Scanner para leer entradas del usuario
            Scanner scanner = new Scanner(System.in);

        // Ejemplo con if-else
        System.out.println("Ingrese un número:");
        int numero = scanner.nextInt();

        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else if (numero < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }

        // Ejemplo con switch
        System.out.println("\nSeleccione una opción (1-3):");
        System.out.println("1. Mostrar mensaje A");
        System.out.println("2. Mostrar mensaje B");
        System.out.println("3. Mostrar mensaje C");

        int opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Has seleccionado la opción A.");
                break;
            case 2:
                System.out.println("Has seleccionado la opción B.");
                break;
            case 3:
                System.out.println("Has seleccionado la opción C.");
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
    }
}
