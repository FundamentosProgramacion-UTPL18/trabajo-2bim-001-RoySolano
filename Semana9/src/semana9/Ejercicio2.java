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
        int [] c = {1,2,3,4,5,6,7};
        int producto = 0;
        
        for (int contador = 0; contador < c.length; contador++){
            if (c[contador]%2 == 0){
                System.out.printf("\n%s%d\n\n","Tabla del: ",c[contador]);
                for (int contador_interior = 1; contador_interior <= 12; contador_interior ++){
                    producto = c[contador]*contador_interior;
                    System.out.printf("%d x %d = %d\n",c[contador],contador_interior,producto);
                }
                
            }
        }
    }
    
}
