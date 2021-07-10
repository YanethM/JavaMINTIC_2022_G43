/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesionv_g43;

/**
 *
 * @author apmejiar
 */
public class MascotaClass {
    //1. Declarar atributos globales de la clase con visibilidad private
    //2. Encapsulate fields. Clic secundario > refactor > encapsulate fields > Select all
    
    //3. Insertar el constructor de la clase. Clic secundario > Insert code > Constructor >Select all
    //4. Creamos el método o la función que devuelve la información de los GETTER
    private int codigo_mascota;
    private String nombre_mascota;
    private String raza;
    private String fecha_nacimiento;
    private int nro_documento_dueño;
    private VeterinariaClass veterinaria;
    
    public MascotaClass(int codigo_mascota, String nombre_mascota, String raza, String fecha_nacimiento, int nro_documento_dueño) {
        this.codigo_mascota = codigo_mascota;
        this.nombre_mascota = nombre_mascota;
        this.raza = raza;
        this.fecha_nacimiento = fecha_nacimiento;
        this.nro_documento_dueño = nro_documento_dueño;
    }
    
    /**
     * @return the codigo_mascota
     */
    public int getCodigo_mascota() {
        return codigo_mascota;
    }

    /**
     * @param codigo_mascota the codigo_mascota to set
     */
    public void setCodigo_mascota(int codigo_mascota) {
        this.codigo_mascota = codigo_mascota;
    }

    /**
     * @return the nombre_mascota
     */
    public String getNombre_mascota() {
        return nombre_mascota;
    }

    /**
     * @param nombre_mascota the nombre_mascota to set
     */
    public void setNombre_mascota(String nombre_mascota) {
        this.nombre_mascota = nombre_mascota;
    }

    /**
     * @return the raza
     */
    public String getRaza() {
        return raza;
    }

    /**
     * @param raza the raza to set
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }

    /**
     * @return the fecha_nacimiento
     */
    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    /**
     * @param fecha_nacimiento the fecha_nacimiento to set
     */
    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }


    /**
     * @return the nro_documento_dueño
     */
    public int getNro_documento_dueño() {
        return nro_documento_dueño;
    }

    /**
     * @param nro_documento_dueño the nro_documento_dueño to set
     */
    public void setNro_documento_dueño(int nro_documento_dueño) {
        this.nro_documento_dueño = nro_documento_dueño;
    }
    
    //Función que retorna la información de la mascota
    public String consultar_informacion_mascota(){
        return "Mascota consultada: " + getCodigo_mascota()+ "\n        >" + getNombre_mascota() + "\n        >" + getFecha_nacimiento() + "\n        >" + getRaza();
    }
    
    //Método que imprime la información de la mascota
    public void consultar_informacion_mascota_m(){
        System.out.println("Mascota consultada: " + getCodigo_mascota()+ "\n        >" + getNombre_mascota() + "\n        >" + getFecha_nacimiento() + "\n        >" + getRaza());
    }
    
    //Método que imprime la información de la mascota al consultarla por el código
    public void mostrar_determinada_mascota(int codigo_consulta){
        if(getCodigo_mascota() == codigo_consulta){
            System.out.println("Mascota consultada: " + getCodigo_mascota()+ "\n        >" + getNombre_mascota() + "\n        >" + getFecha_nacimiento() + "\n        >" + getRaza());
        }else{
            System.out.println("Mascota no registrada en el sistema");
        }
    } 

    /**
     * @return the veterinaria
     */
    public VeterinariaClass getVeterinaria() {
        return veterinaria;
    }

    /**
     * @param veterinaria the veterinaria to set
     */
    public void setVeterinaria(VeterinariaClass veterinaria) {
        this.veterinaria = veterinaria;
    }
}
