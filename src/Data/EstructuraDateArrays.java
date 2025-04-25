/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

/**
 *
 * @author Soporte
 */
public class EstructuraDateArrays {
    public void principal(){
        int edad = 10;
        String nombre ="Pepito"; 
        int[] edades = {10, 20, 30, 40, 50};
        String[] nombres = {"Pepito","Carlos", "Ana", "Luis"};
        Object[] nombresEdades ={"juan","Maria",50,true,};
        //imprimir un valor 
        System.out.println(edades[0]);
         //contar lascantidades de valores que tienen un array
        System.out.println(edades.length);
   
        for(int i=0; i<= nombresEdades.length ;i++){
            System.out.println(nombresEdades[i]);
        }
        System.out.println("Miguel");



    System.out.println("\nArray de nombres con índices:");

    for (int i = 0; i < nombres.length; i++) {

      System.out.println("Índice " + i + ": " + nombres[i]);
      if (nombres[i].equalsIgnoreCase("nataly")) {
        System.out.println(" Aquí está tu nombre: " + nombres[i]);
      }
    }
    System.out.println("\nArray de edades con índices:");
    for (int i = 0; i < edades.length; i++) {
      System.out.println("Índice " + i + ": " + edades[i]);
    }
    System.out.println("\nArray de nombresEdades (valores mixtos) con índices:");

    for (int i = 0; i < nombresEdades.length; i++) {
      System.out.println("Índice " + i + ": " + nombresEdades[i]);

    }

  }
}
