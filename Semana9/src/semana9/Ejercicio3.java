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
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double [] calificaciones_programacion = {18,19,15,16,17,10};
        double [] calificaciones_basesdatos = {10,12,13,20,17,20};
        double [] promedios = new double [6];
        double promedio;
        
        for (int contador = 0; contador < promedios.length; contador++){
            promedio = (calificaciones_programacion[contador]+calificaciones_basesdatos[contador])/2;
            promedios[contador] = promedio; 
        }
        for (int contador = 0; contador < promedios.length; contador++){
            System.out.printf("%s%d\t%.2f\t%.2f\t%.2f\n","Estudiante: ",contador+1,calificaciones_programacion[contador],calificaciones_basesdatos[contador],promedios[contador]);
        }
    }
    
}
