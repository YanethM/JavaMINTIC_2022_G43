/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesioniv_g43;

/**
 *
 * @author apmejiar
 */
public class PersonaClass {
    private String nombre;
    private String tipo_documento;
    private int nro_documento;

    public PersonaClass(String nombre, String tipo_documento, int nro_documento) {
        this.nombre = nombre;
        this.tipo_documento = tipo_documento;
        this.nro_documento = nro_documento;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the tipo_documento
     */
    public String getTipo_documento() {
        return tipo_documento;
    }

    /**
     * @param tipo_documento the tipo_documento to set
     */
    public void setTipo_documento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    /**
     * @return the nro_documento
     */
    public int getNro_documento() {
        return nro_documento;
    }

    /**
     * @param nro_documento the nro_documento to set
     */
    public void setNro_documento(int nro_documento) {
        this.nro_documento = nro_documento;
    }
    
    public void consultar_información_persona(int nro_documento){
        if(getNro_documento() == nro_documento){
            System.out.println(getNombre() + " " + getTipo_documento() + " " + getNro_documento());
        }else{
            System.out.println("Persona no esta registrada en el sistema");
        }
    }
}
