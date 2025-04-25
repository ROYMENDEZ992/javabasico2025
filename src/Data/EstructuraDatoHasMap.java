/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Soporte
 */
public class EstructuraDatoHasMap {
    public void principal(){
        Map<String, Integer> edades = new HashMap<>();
        edades.put("Ana", 20);
        edades.put("Carlos", 25);
        edades.put("Luis", 30);
   //remover
   ///iterar
   for (Map.Entry<String, Integer> item : edades.entrySet()) {
    System.out.println("nombre: " + item.getKey() + " su edad es: " + item.getValue());
   }
   }
    
}
