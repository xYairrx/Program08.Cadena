/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program08.cadena;

/**
 *
 * @author Yair
 */
public class Program08Cadena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String nombre = "Yair";

        String letra1 = String.valueOf(nombre.charAt(0));
        String letra2 = String.valueOf(nombre.charAt(1));
        String letra3 = String.valueOf(nombre.charAt(2));
        String letra4 = String.valueOf(nombre.charAt(3));

        System.out.println(letra1);
        System.out.println(letra2);
        System.out.println(letra3);
        System.out.println(letra4);
        
        letra4 = letra4.toUpperCase();
        System.out.println(letra4);
        

    }

}
