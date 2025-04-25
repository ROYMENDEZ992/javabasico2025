/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Soporte
 */
public class EstructuraDatoArrayList {
    public void principal(){
      List <String> nombres = new ArrayList<>();
      nombres.add("daniel");
      nombres.add("Carlos");
      nombres.add("Ana");
      nombres.add("Luis");
      //imprimir
        System.out.println("Primer nombre: " + nombres.get(0));
      // Imprimir los elementos de la lista
        System.out.println("Lista de nombres:");
        for (String nombre : nombres) {
        System.out.println(nombre);
        
       
        }
    }
    
}
