/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesioniv_g43;

import java.util.Scanner;

/**
 *
 * @author apmejiar
 */
public class VehiculoClass {
    
    //1. Declarar las variables de forma privada
    //2. Encapsulate fields(GET y SET). Clic secundario> Refactor> Encapsulate fields
    //3. Insertar el constructor de la clase. Clic secundario> Insert code> Constructor
    //4. Crear función o método que retorna o imprime los getter de la clase
    
    private String placa;
    private String marca;
    private int modelo;
    private String color;
    private boolean tiene_soat;
    private String fecha_matricula;

    public VehiculoClass(String placa, String marca, int modelo, String color, boolean tiene_soat, String fecha_matricula) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tiene_soat = tiene_soat;
        this.fecha_matricula = fecha_matricula;
    }

    
    
    
    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public int getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(int modelo) {
        this.modelo = modelo;
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

    /**
     * @return the tiene_soat
     */
    public boolean isTiene_soat() {
        return tiene_soat;
    }

    /**
     * @param tiene_soat the tiene_soat to set
     */
    public void setTiene_soat(boolean tiene_soat) {
        this.tiene_soat = tiene_soat;
    }

    /**
     * @return the fecha_matricula
     */
    public String getFecha_matricula() {
        return fecha_matricula;
    }

    /**
     * @param fecha_matricula the fecha_matricula to set
     */
    public void setFecha_matricula(String fecha_matricula) {
        this.fecha_matricula = fecha_matricula;
    }
    
    //FORMA I: Función que retorna los GETTER de la clase
    public String consultar_informacion_vehiculo(){
        return "Vehiculo consultado desde la función:\n      >> Placa: " + getPlaca() + "\n      >> Marca: " + getMarca() + "\n      >> Color: " + getColor() + "\n      >> Fecha de matricula: " + getFecha_matricula()+ "\n      >> Modelo: " + getModelo() + "\n      >> SOAT al día: " + isTiene_soat();
    }
    
    //FORMA II: Método que imprime los GETTER de la clase
    public void consultar_info_vehiculo(){
        System.out.println("\nVehiculo consultado desde el método:\n      >> Placa: " + getPlaca() + "\n      >> Marca: " + getMarca() + "\n      >> Color: " + getColor() + "\n      >> Fecha de matricula: " + getFecha_matricula()+ "\n      >> Modelo: " + getModelo() + "\n      >> SOAT al día: " + isTiene_soat());
    }
    
    public void consultar_por_placa(String placa_consulta_usuario){
        if(getPlaca() == placa_consulta_usuario){
            System.out.println("\nPlaca consultada: " + getPlaca() + "\n      >> Marca: " + getMarca() + "\n      >> Color: " + getColor() + "\n      >> Fecha de matricula: " + getFecha_matricula()+ "\n      >> Modelo: " + getModelo() + "\n      >> SOAT al día: " + isTiene_soat());
        }else{
            System.out.println("\nLa placa " + placa_consulta_usuario + " no se encuentra registrada en el sistema.");
        }
    }
    
    public void consultar_por_placa_suministrada_usuario(String placa_consulta_usuario){
        if(getPlaca().equals(placa_consulta_usuario)){
            System.out.println("\nPlaca consultada: " + getPlaca() + "\n      >> Marca: " + getMarca() + "\n      >> Color: " + getColor() + "\n      >> Fecha de matricula: " + getFecha_matricula()+ "\n      >> Modelo: " + getModelo() + "\n      >> SOAT al día: " + isTiene_soat());
        }else{
            System.out.println("\nLa placa " + placa_consulta_usuario + " no se encuentra registrada en el sistema.");
        }
    }
    
    public void consultar_por_placa_suministrada_user(){
        Scanner inst_entrada_datos = new Scanner(System.in);
        System.out.println(">> Placa: ");
        String placa_consulta_usuario = inst_entrada_datos.nextLine();
        if(getPlaca().equals(placa_consulta_usuario)){
            System.out.println("\nPlaca consultada: " + getPlaca() + "\n      >> Marca: " + getMarca() + "\n      >> Color: " + getColor() + "\n      >> Fecha de matricula: " + getFecha_matricula()+ "\n      >> Modelo: " + getModelo() + "\n      >> SOAT al día: " + isTiene_soat());
        }else{
            System.out.println("\nLa placa " + placa_consulta_usuario + " no se encuentra registrada en el sistema.");
        }
    }
}
