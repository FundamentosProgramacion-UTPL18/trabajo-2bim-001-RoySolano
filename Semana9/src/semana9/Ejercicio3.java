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
        //presentar el reporte de calificaciones y promedios de 6 estudiantes mediante arreglos
        double [] calificaciones_programacion = {18,19,15,16,17,10};
        double [] calificaciones_basesdatos = {10,12,13,20,17,20};
        double [] promedios = new double [6];
        double promedio;
        
        for (int contador = 0; contador < promedios.length; contador++){//ciclo para operar con los valores
            promedio = (calificaciones_programacion[contador]+calificaciones_basesdatos[contador])/2;
            promedios[contador] = promedio;//insertación del promedio entre calificaciones en el arreglo promedios 
        }
        for (int contador = 0; contador < promedios.length; contador++){//ciclo para presentar el reporte
            System.out.printf("%s%d\t%.2f\t%.2f\t%.2f\n","Estudiante: ",contador+1,calificaciones_programacion[contador],calificaciones_basesdatos[contador],promedios[contador]);
        }
    }
    
}
