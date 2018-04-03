/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads1;

/**
 *
 * @author T-102
 */
public class TerceraForma {
    
    public static void main(String[] args) {
        
  //Esto es la clase interna anónima
  //Estudiar mucho !!!!!!
        Thread t1=new Thread(new Runnable(){
            
            public void run(){
                
                System.out.println("Yo soy un thread bueno");
        }
        }
        ); 
        
        t1.start();
    }
    
}
