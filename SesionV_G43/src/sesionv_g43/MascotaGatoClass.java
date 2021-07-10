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
public class MascotaGatoClass extends MascotaClass{
    private String color;

    public MascotaGatoClass(int codigo_mascota, String nombre_mascota, String raza, String fecha_nacimiento, int nro_documento_dueño, String color) {
        super(codigo_mascota, nombre_mascota, raza, fecha_nacimiento, nro_documento_dueño);
         this.color = color;
    }
    
   

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }
    
}
