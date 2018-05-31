/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana9;

/**
 *
 * @author Usuario
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //imprimir un arreglo
        int [] c = new int[4];//declaraación de variable arreglo
        c[0] = 10;
        
        for (int contador = 0; contador < c.length; contador++){//imprimir los datos dentro del arreglo
            System.out.println(c[contador]);
        }
    }
    
}
