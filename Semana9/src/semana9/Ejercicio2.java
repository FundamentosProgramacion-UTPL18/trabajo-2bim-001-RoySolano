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
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //presentar una tabla de multipicación hasta el 12 de cada valor par de un arreglo
        int [] c = {1,2,3,4,5,6,7};//declaración de variable arreglo
        int producto = 0;//variable que almacena en producto entre un valos del arreglo y el contador
        
        for (int contador = 0; contador < c.length; contador++){//ciclo para recorrer el arreglo
            if (c[contador]%2 == 0){//condición para solo trabajar con los valores pares del arreglo
                System.out.printf("\n%s%d\n\n","Tabla del: ",c[contador]);//encabezado de la tabla de multiplicar
                for (int contador_interior = 1; contador_interior <= 12; contador_interior ++){//ciclo para operar con los valores
                    producto = c[contador]*contador_interior;//contador_interior es un factor en la multiplicación
                    System.out.printf("%d x %d = %d\n",c[contador],contador_interior,producto);//presentación de datos
                }
                
            }
        }
    }
    
}
