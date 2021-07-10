/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesionv_g43;
//Agregación: 1 ... *(0-N)
//Composición: 1 ... (1-N)
/**
 *
 * @author apmejiar
 */
public class VeterinariaClass {
    private String nombre_veterinaria;
    private String NIT;

    public VeterinariaClass(String nombre_veterinaria, String NIT) {
        this.nombre_veterinaria = nombre_veterinaria;
        this.NIT = NIT;
    }

    /**
     * @return the nombre_veterinaria
     */
    public String getNombre_veterinaria() {
        return nombre_veterinaria;
    }

    /**
     * @param nombre_veterinaria the nombre_veterinaria to set
     */
    public void setNombre_veterinaria(String nombre_veterinaria) {
        this.nombre_veterinaria = nombre_veterinaria;
    }

    /**
     * @return the NIT
     */
    public String getNIT() {
        return NIT;
    }

    /**
     * @param NIT the NIT to set
     */
    public void setNIT(String NIT) {
        this.NIT = NIT;
    }
    
}
