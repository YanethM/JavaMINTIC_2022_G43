/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseii_g43;

/**
 *
 * @author apmejiar
 */
public class DueñoMascotaClass {
    private String nombre;
    private String tipo_documento;
    private int num_documento;
    private String nombre_mascota;

    public DueñoMascotaClass(String nombre, String tipo_documento, int num_documento, String nombre_mascota) {
        this.nombre = nombre;
        this.tipo_documento = tipo_documento;
        this.num_documento = num_documento;
        this.nombre_mascota = nombre_mascota;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    public int getNum_documento() {
        return num_documento;
    }

    public void setNum_documento(int num_documento) {
        this.num_documento = num_documento;
    }

    public String getNombre_mascota() {
        return nombre_mascota;
    }

    public void setNombre_mascota(String nombre_mascota) {
        this.nombre_mascota = nombre_mascota;
    }
    
    public String mostrar_informacion_dueño_mascota(){
        return ">>El nombre del dueño de " + getNombre_mascota() + " es "+ getNombre() + " identificada con tipo de documento " + getTipo_documento() + " numero " + getNum_documento();
    }
}
