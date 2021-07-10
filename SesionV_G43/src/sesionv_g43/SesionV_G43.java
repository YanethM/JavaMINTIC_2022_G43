/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesionv_g43;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author apmejiar
 */
public class SesionV_G43 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayListMascota inst_arraylist = new ArrayListMascota();
        System.out.println(inst_arraylist.add_element());
        System.out.println(inst_arraylist.edit_element());
        System.out.println(inst_arraylist.remove_element());
        inst_arraylist.cant_elementos_array();
        
        Date fecha_nacimiento = new Date(117,10,13);
        Date fecha_actual = new Date();
        Scanner inst_scanner = new Scanner(System.in);
        //Obtener la edad
        Period edad = Period.between(LocalDate.of(2017,03,13), LocalDate.now());
        System.out.println(edad.getYears());
        
        //Si quiero solicitar la fecha al user, debo de establecer el formato
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Ingresa la fecha de nacimiento dd/MM/yyyy: ");
        String fecha = inst_scanner.nextLine();
        LocalDate fecha_nacimiento_2 = LocalDate.parse(fecha, formato);
        Period edad_2 = Period.between(fecha_nacimiento_2, LocalDate.now());
        System.out.println("Tienes " + edad_2.getYears()+ " años");
        
        
        SimpleDateFormat aplicar_formato_1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat aplicar_formato_2 = new SimpleDateFormat("dd-MMM-yy");
        //Año 1900 le sumo el faltante para llegar al año indicado por el usuario
        //Mes inicia desde 0 (enero) y va hasta el mes 11 (diciembre)
        // 1. Crear Instancia de la subclase
        MascotaPerroClass inst_perro_1 = new MascotaPerroClass(1, "Dante", "Bull terrier", aplicar_formato_1.format(fecha_nacimiento), 0);
        System.out.println(inst_perro_1.consultar_informacion_mascota());
        inst_perro_1.adquirir_plan_paseo_mascota(1);
        
        
        MascotaPerroClass inst_perro_2 = new MascotaPerroClass(7, "Pluto", "Beagle", aplicar_formato_2.format(fecha_nacimiento), 0);
        inst_perro_2.consultar_informacion_mascota_m();
        inst_perro_2.mostrar_determinada_mascota(inst_perro_2.getCodigo_mascota());
        inst_perro_2.adquirir_plan_paseo_mascota(7);
        VeterinariaClass inst_veterinaria = new VeterinariaClass("San Miguel", "099999-1");
        inst_perro_2.setVeterinaria(inst_veterinaria);
        System.out.println(inst_perro_2.getVeterinaria());
        
        MascotaGatoClass inst_gato1 = new MascotaGatoClass(1, "Silvestre", "Criollo", aplicar_formato_2.format(fecha_nacimiento), 105311, "Café");
        System.out.println(inst_gato1.consultar_informacion_mascota() +"\n       > " + inst_gato1.getColor());
    }
    
}
