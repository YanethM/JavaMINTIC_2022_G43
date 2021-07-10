/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesionv_g43;

import java.util.ArrayList;

/**
 *
 * @author apmejiar
 */
public class ArrayListMascota {
    //Un tipo de estructura de datos, que permite coleccionar datos del mismo tipo
    ArrayList<String> nombre_mascotas_array = new ArrayList<>();
    
    //Función que permite añadir elementos al arraylist
    public ArrayList add_element(){
        this.nombre_mascotas_array.add("Dante");
        this.nombre_mascotas_array.add("Pluto");
        this.nombre_mascotas_array.add("Silvestre");
        this.nombre_mascotas_array.add("Donald");
        this.nombre_mascotas_array.add("Tom");
        return this.nombre_mascotas_array;
    }
    
    public ArrayList edit_element(){
        this.nombre_mascotas_array.set(4, "Doggie");
        return this.nombre_mascotas_array;
    }
            
    public ArrayList remove_element(){
        this.nombre_mascotas_array.remove(0);
        return this.nombre_mascotas_array;
    }
    
    public void cant_elementos_array(){
        if(this.nombre_mascotas_array.isEmpty()==true){
            System.out.println("Arraylist no contiene elementos");
        }else{
            System.out.println("Contiene " + this.nombre_mascotas_array.size() + " elementos y son: " + this.nombre_mascotas_array);
        }
        
    }
    
    
}
