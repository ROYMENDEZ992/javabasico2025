/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

/**
 *
 * @author Soporte
 */
public class OperadoresLogicos {
    // variables o metodos
    public void principal(){
     System.out.println("===================================");    
     System.out.println("Bienvenido a los Operados Logicos");
     System.out.println("==================================="); 
    
     boolean esVerdadero = true;
     boolean esFalso =false;
     System.out.println("Operados Logicos(AND) (y) simbolo(&&)");
     System.out.println("verdadero y verdadero: " + String.valueOf(esVerdadero && esVerdadero));
     System.out.println("true && false = " + String.valueOf(esVerdadero && esFalso));      
     System.out.println("false && true = " + String.valueOf(esFalso && esVerdadero));       
     System.out.println("false && false = " + String.valueOf(esFalso && esFalso));
    }
}
