/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglos;
/**
 *
 * @author T-102
 */
public class Primero {
    
    public static void main(String[] args){
               
        int x[]={5,-2,6};
         //para obtener un elemento del arreglo
         // usamos...
         System.out.println(x[0]);
         
         // Todos los arreglos no mutables 
         // tiene una prpiedad para saber
         //su tamaño
         
         System.out.println(x.length);
         
         //Vamos a iterar el arreglo con un ciclo for
         
        for( int i=0;i<x.length;i++){
            
            System.out.println(x[i]);
        } 
        
        //Lo mismo ´pero con el for mejorado
        for(int a:x){
            System.out.println(a);
        }
        
    }
}
