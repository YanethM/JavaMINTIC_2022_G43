/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesiónix_g43;

import class_pkg.CatPetClass;
import class_pkg.DogPetClass;

/**
 *
 * @author apmejiar
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DogPetClass dog = new DogPetClass();
        dog.crud_arrayListObject();
        CatPetClass cat = new CatPetClass();
        cat.crud_cat();
    }
    
}
