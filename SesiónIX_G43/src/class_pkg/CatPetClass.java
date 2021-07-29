/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_pkg;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author apmejiar
 */
public class CatPetClass extends PetClass{
    
    private VeterinaryClass verterinary;
    Scanner inst_datos = new Scanner(System.in);
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    
    public CatPetClass(int code, String name, int yearn_born, String color, String health_status, String breed, boolean pedigree) {
        super(code, name, yearn_born, color, health_status, breed, pedigree);
    }

    public CatPetClass() {
    }

    
    
    public VeterinaryClass getVerterinary() {
        return verterinary;
    }

    public void setVerterinary(VeterinaryClass verterinary) {
        this.verterinary = verterinary;
    }
    
    public void crud_cat(){
        ArrayList<CatPetClass> catObjectArray = new ArrayList<>();
        System.out.println("Prueba de llamado al método");
    }
}
