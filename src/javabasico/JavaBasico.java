/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javabasico;

import Data.OperadoresAritmeticos;
import Data.OperadoresLogicos;
import java.util.Scanner;

public class JavaBasico {


    public static void main(String[] args) {
      System.out.println("=== JAVA BASICO ===");
      System.out.println("ROYER");
      System.out.println("=================");
      System.out.println("========MENU=========");
      System.out.println("1.Operadores Logicos");
      System.out.println("2.Operadores Aritmeticos");
      System.out.println("3.Operadores Comparaciones");
      System.out.println("4.Tipo Datos");
      System.out.println("5.Condicionales");
      System.out.println("6.Bucles");
      System.out.println("7.Exepciones");
      System.out.println("8.Array");
      System.out.println("9.listas");
      System.out.println("10.Mapa de Valores");
      
      Scanner sc = new Scanner(System.in);
      int opcion = sc.nextInt();
      System.out.println("la opcion seleccionada es:" + opcion);
      
      
      boolean salir = true;
      while(salir){
          switch(opcion){
              case 1:
                  OperadoresLogicos ol = new OperadoresLogicos();
                  ol.principal();
                  break;
                  
              case 2:
                 OperadoresAritmeticos oa = new OperadoresAritmeticos();
                 oa.principal();
              case 3:
                  ///...
              default:
              System.out.println("opcion no encontrada intentalo de nuevo");
              
          }
         salir = false;
     }
             
   
      
    }
     
}
