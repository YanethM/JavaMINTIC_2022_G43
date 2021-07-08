/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesioniv_g43;
import java.text.SimpleDateFormat;
import java.util.Date;
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
        //Uso de la clase Date
        Date fecha_actual = new Date();
        SimpleDateFormat formato_fecha_uno = new SimpleDateFormat("dd/MM/yyyy");
        Scanner inst_datos_entrada = new Scanner(System.in);
        
        //1. Instanciar la clase
        VehiculoClass inst_vehiculo = new VehiculoClass("MIN2021", "MISIÓN TIC", 2022, "Blue&Pink", true, formato_fecha_uno.format(fecha_actual));
        System.out.println(inst_vehiculo.consultar_informacion_vehiculo());
        inst_vehiculo.consultar_info_vehiculo();
        //Enviar la placa cómo valor estático
        inst_vehiculo.consultar_por_placa("MIN2021");
        inst_vehiculo.consultar_por_placa("MIN2022");
        //Solicitar la placa al usuario
        System.out.println("Ingrese la placa a consultar: ");
        String placa = inst_datos_entrada.nextLine();
        inst_vehiculo.consultar_por_placa_suministrada_usuario(placa);
        System.out.println("\n**************SCANNER DESDE CLASE VEHICULO********¨****");
        inst_vehiculo.consultar_por_placa_suministrada_user();
    }
    
}
