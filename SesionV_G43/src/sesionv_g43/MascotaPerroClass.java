/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesionv_g43;

import java.util.Scanner;

/**
 *
 * @author apmejiar
 */
public class MascotaPerroClass extends MascotaClass{

    public MascotaPerroClass(int codigo_mascota, String nombre_mascota, String raza, String fecha_nacimiento, int nro_documento_dueño) {
        super(codigo_mascota, nombre_mascota, raza, fecha_nacimiento, nro_documento_dueño);
    }

    //Método que permite ofrecer planes a los dueños de perros
    public void adquirir_plan_paseo_mascota(int codigo_perro_consultar){
        System.out.println("Deseas adquirir el plan mensual que ofrece el paseador de perreos? (Sí, No)");
        //Solicitar al usuario que ingrese la respuesta por consola
        Scanner inst_scanner = new Scanner(System.in);
        String respuesta_usuario = inst_scanner.nextLine();
        if(respuesta_usuario.toLowerCase().equals("sí") || respuesta_usuario.toLowerCase().equals("si")){
            System.out.println("       >> Asignar plan de paseo de mascotas a " + super.getNombre_mascota());
        }else{
            System.out.println("       >> Hasta pronto.");
        }
    }

    void setVeterinaria(String san_Miguel, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
