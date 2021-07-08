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
public class MascotaClass {
    private int codigo_mascota;
    private String nombre;
    private int nro_documento_dueño;
    private String raza;
    private char genero;
    private LocalDate fecha_nacimiento;
    private boolean desparacitado;
    private boolean vacunas_al_dia;
    private String tipo_alimento;

    public MascotaClass(int codigo_mascota, String nombre, int nro_documento_dueño, String raza, char genero, LocalDate fecha_nacimiento, boolean desparacitado, boolean vacunas_al_dia, String tipo_alimento) {
        this.codigo_mascota = codigo_mascota;
        this.nombre = nombre;
        this.nro_documento_dueño = nro_documento_dueño;
        this.raza = raza;
        this.genero = genero;
        this.fecha_nacimiento = fecha_nacimiento;
        this.desparacitado = desparacitado;
        this.vacunas_al_dia = vacunas_al_dia;
        this.tipo_alimento = tipo_alimento;
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
     * @return the genero
     */
    public char getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(char genero) {
        this.genero = genero;
    }


    /**
     * @return the desparacitado
     */
    public boolean isDesparacitado() {
        return desparacitado;
    }

    /**
     * @param desparacitado the desparacitado to set
     */
    public void setDesparacitado(boolean desparacitado) {
        this.desparacitado = desparacitado;
    }

    /**
     * @return the vacunas_al_dia
     */
    public boolean isVacunas_al_dia() {
        return vacunas_al_dia;
    }

    /**
     * @param vacunas_al_dia the vacunas_al_dia to set
     */
    public void setVacunas_al_dia(boolean vacunas_al_dia) {
        this.vacunas_al_dia = vacunas_al_dia;
    }

    /**
     * @return the tipo_alimento
     */
    public String getTipo_alimento() {
        return tipo_alimento;
    }

    /**
     * @param tipo_alimento the tipo_alimento to set
     */
    public void setTipo_alimento(String tipo_alimento) {
        this.tipo_alimento = tipo_alimento;
    }

    /**
     * @return the fecha_nacimiento
     */
    public LocalDate getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    /**
     * @param fecha_nacimiento the fecha_nacimiento to set
     */
    public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
    
    
}
