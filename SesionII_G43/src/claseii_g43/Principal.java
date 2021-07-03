/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseii_g43;
import java.util.Scanner;
/**
 *
 * @author apmejiar
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner inst_lectura_input = new Scanner(System.in);
        System.out.println("Ingresa el nombre de tu mascota");
        String nombre_mascota = inst_lectura_input.nextLine();
        // Crear una instancia de la clase Mascota
        MascotaClass inst_mascota = new MascotaClass(nombre_mascota,6,true,"labrador",'H');
        DueñoMascotaClass inst_dueñom = new DueñoMascotaClass("Yaneth", "C.C.", 999, inst_mascota.getNombre_mascota());
        //Consultar nombre de la mascota
        System.out.println("            >>Nombre: " + inst_mascota.getNombre_mascota());
        
        //Modificar el nombre de la mascota
        inst_mascota.setNombre_mascota("Dante");
        DueñoMascotaClass inst_dueñom1 = new DueñoMascotaClass("Yaneth", "C.C.", 999, inst_mascota.getNombre_mascota());

        
        //Consultar la edad a la mascota
        System.out.println("            >>Edad: " + inst_mascota.getEdad_mascota());
        
        //Modificar el antecedente de padece enfermedad
        inst_mascota.setPadece_enfermedad(false);
        System.out.println("            >>Antecedentes de enfermedad: " + inst_mascota.isPadece_enfermedad());
        
        //Llamar función mostrar_informacion_mascota de la clase MascotaClass
        System.out.println(inst_mascota.mostrar_informacion_mascota());
        System.out.println(inst_dueñom.mostrar_informacion_dueño_mascota());
        System.out.println(inst_dueñom1.mostrar_informacion_dueño_mascota());
    }   
    
    
}
