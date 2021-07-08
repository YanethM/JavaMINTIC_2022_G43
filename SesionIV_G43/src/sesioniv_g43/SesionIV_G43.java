/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesioniv_g43;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;
/**
 *
 * @author apmejiar
 */
public class SesionIV_G43 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner inst_datos = new Scanner(System.in);
        LocalDate fecha_nacimiento_perro = LocalDate.of(2016, Month.MARCH, 3);
        LocalDate fecha_nacimiento_gato = LocalDate.of(2019, Month.APRIL, 23);
        
        SubclassPerro inst_perro = new SubclassPerro(1, "Rocky", 1053, "Bull terrier", 'M', fecha_nacimiento_perro, true, true, "Hills");
        inst_perro.consultar_info_perro(1);
        
        
        SubClassGato inst_gato = new SubClassGato(2, "Donatelo", 1053, "Persia", 'M', fecha_nacimiento_gato, true, true, "Hills");
        inst_gato.consultar_info_gato(2);
        
        //Información estática suministrada por el programador
        SubclaseDueñoMascota inst_dueño = new SubclaseDueñoMascota("Miguel Angel", "C.C.", 1053);
        inst_dueño.consultar_información_persona(1053);
        SubclaseVeterinarioClass inst_veterinario = new SubclaseVeterinarioClass("Juan", "C.C.", 1035);
        inst_veterinario.consultar_información_persona(1035);
        
        
        //Información suministrada por el usuario
        System.out.println(">> Nombre: ");
        String nombre_u = inst_datos.nextLine();
        System.out.println(">> Tipo de documento: ");
        String tipo_documento_u = inst_datos.nextLine();
        System.out.println(">> Nro de documento: ");
        int documento_u = inst_datos.nextInt();
        SubclaseDueñoMascota inst_dueño2 = new SubclaseDueñoMascota(nombre_u, tipo_documento_u, documento_u);
        inst_dueño2.consultar_información_persona(documento_u);
    }
    
}
