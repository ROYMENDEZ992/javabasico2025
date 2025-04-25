/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

/**
 *
 * @author Soporte
 */
public class Expciones {
        public void principal() {
        // Ejemplo: manejar división por cero
        try {
            int a = 10;
            int b = 0;
            int resultado = a / b;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: no se puede dividir por cero.");
        }

        // Ejemplo: manejo de número inválido al convertir String a int
        try {
            String texto = "abc";
            int numero = Integer.parseInt(texto);
            System.out.println("Número convertido: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: el texto no es un número válido.");
        }

        System.out.println("Programa terminado correctamente.");
    }
}
