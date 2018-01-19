/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.meqr;

/**
 *
 * @author T-102
 */
public class PooMeqr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola mundo");
        

        //Generar los obejtos de las 
        //clases anteriores
        Usuario x=new Usuario();
        x.altura=1.58f;
        x.peso=62;
        Imc algo=new Imc();
        algo.u=x;
        
        //calculamos el Imc a traves de su objeto
        System.out.println(algo.calcular());
        
        
    }   
    }
