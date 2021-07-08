/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesioniv_g43;

import java.time.LocalDate;

/**
 *
 * @author apmejiar
 */
public class SubclassPerro extends MascotaClass{

    public SubclassPerro(int codigo_mascota, String nombre, int nro_documento_dueño, String raza, char genero, LocalDate fecha_nacimiento, boolean desparacitado, boolean vacunas_al_dia, String tipo_alimento) {
        super(codigo_mascota, nombre, nro_documento_dueño, raza, genero, fecha_nacimiento, desparacitado, vacunas_al_dia, tipo_alimento);
    }

   
 
    public void consultar_info_perro(int codigo_mascota){
        if(getCodigo_mascota()==codigo_mascota){
            System.out.println(getCodigo_mascota() + " " + getNombre()+ " "+ getRaza()+ " " + getNro_documento_dueño() + " " + getFecha_nacimiento()); 
        }else{
            System.out.println("No se ha encontrado la mascota con código " + codigo_mascota);
        }
    }
}
