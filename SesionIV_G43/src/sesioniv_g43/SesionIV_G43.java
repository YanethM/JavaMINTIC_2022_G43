/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesioniv_g43;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.Date;
/**
 *
 * @author apmejiar
 */
public class SesionIV_G43 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LocalDate fecha_nacimiento_perro = LocalDate.of(2016, Month.MARCH, 3);
        LocalDate fecha_nacimiento_gato = LocalDate.of(2019, Month.APRIL, 23);
        
        SubclassPerro inst_perro = new SubclassPerro(1, "Rocky", 1053, "Bull terrier", 'M', fecha_nacimiento_perro, true, true, "Hills");
        inst_perro.consultar_info_perro(1);
        
        
        SubClassGato inst_gato = new SubClassGato(2, "Donatelo", 1053, "Persia", 'M', fecha_nacimiento_gato, true, true, "Hills");
        inst_gato.consultar_info_gato(2);
    }
    
}
