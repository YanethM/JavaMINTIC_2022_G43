/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseii_g43;
//Importar clases
import java.util.Date;
/**
 *
 * @author apmejiar
 */
public class MascotaClass {
    private String nombre_mascota;
    private Date fecha_nacimiento;
    private int edad_mascota;
    private boolean padece_enfermedad;
    private String raza;
    private char sexo;
    
    //Forma 1: Constructor de la clase

    public MascotaClass(String nombre_mascota, int edad_mascota, boolean padece_enfermedad, String raza, char sexo) {
        this.nombre_mascota = nombre_mascota;
        this.edad_mascota = edad_mascota;
        this.padece_enfermedad = padece_enfermedad;
        this.raza = raza;
        this.sexo = sexo;
    }
    //Forma 2: Encapsulamiento de variables
    //La función GET para obtener o consultar el valor de un atributo
    //El método SET para modificaro o editar el valor de un atributo
   
    public String getNombre_mascota() {
        return nombre_mascota;
    }

    public void setNombre_mascota(String nombre_mascota) {
        this.nombre_mascota = nombre_mascota;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public int getEdad_mascota() {
        return edad_mascota;
    }

    public void setEdad_mascota(int edad_mascota) {
        this.edad_mascota = edad_mascota;
    }

    public boolean isPadece_enfermedad() {
        return padece_enfermedad;
    }

    public void setPadece_enfermedad(boolean padece_enfermedad) {
        this.padece_enfermedad = padece_enfermedad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
  
    //Forma 3: Función que retorna todas las funciones get de la clase
    public String mostrar_informacion_mascota(){
        //Validar si sexo es M mostrar al usuario Macho, en caso contrario si es H mostrar Hembra
        String sexo_mascota;
        if(getSexo() == 'H'){
            sexo_mascota = "Hembra";
        }else{
            sexo_mascota = "Macho";
        }
        
        //Validar si presenta o no antecedentes de enfermedad
        String padece_enfermedad_mascota;
        if(isPadece_enfermedad()== true){
            padece_enfermedad_mascota = "Si tiene historial clinico";
        }else{
            padece_enfermedad_mascota ="No tiene historial clinico";
        }
        return ">> Nombre de la mascota: " + getNombre_mascota()+ "\nEs de raza " + getRaza()+ " y tiene "+ getEdad_mascota()+ " años \n"+ padece_enfermedad_mascota +  " y es " + sexo_mascota;
    }
    
//    public char sexo_mascota(){
//        return getSexo();
//    }
//    
//    public int edad_mascota(){
//        return getEdad_mascota();
//    }
//    
//    public boolean padece_enfermedad(){
//        return isPadece_enfermedad();
//    }
//    
//    public String padece_enfermedad_con_mensaje(){
//        return "Antecedentes clinicos mascota: " + isPadece_enfermedad();
//    }
}
