/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poliejemplo;

import java.util.*;

/**
 *
 * @author juan_
 */
public class Mascotas {

    public static void main(String[] args) {
        Animal animales[] = new Animal[12];
        
        animales[0] = new Gato();
        animales[1] = new Gato();
        animales[2] = new Gato();

        animales[3] = new Perro();
        animales[4] = new Perro();

        animales[5] = new Pollo();
        animales[6] = new Pollo();
        animales[7] = new Pollo();
        animales[8] = new Pollo();
        animales[9] = new Pollo();
        
        animales[10] =new Raton();
        animales[11] =new Raton();
        
        ServicioAnimales s = new ServicioAnimales();
         
        //Magia del Polimorfismo
        for (Animal a : animales) {
            s.servicioHacerRuido((ComportamienoAnimal) a);
        }
        
        //vamos a generar ArrayList y poner alli
        //algunos animalitos
        
        ArrayList<Animal> animalitos=new ArrayList<>();
        animalitos.add(new Pollo());
        animalitos.add(new Raton());
        animalitos.add(new Raton());
        animalitos.add(new Perro());
        animalitos.add(new Gato());
        
        for(Animal a: animalitos){
        
            s.servicioHacerRuido((ComportamienoAnimal)a);
        }

        animalitos.get(0).setEdad(1);
        System.out.println(animalitos.get(0).getEdad());
    }
}
