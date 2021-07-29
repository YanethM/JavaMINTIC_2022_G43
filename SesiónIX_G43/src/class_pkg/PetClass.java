/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_pkg;

/**
 *
 * @author apmejiar
 */
public class PetClass {
    private int code;
    private String name;
    private String color;
    private String health_status;
    private String breed;
    private boolean pedigree;
    private int yearn_born;

    public PetClass() {
    }

    
    public PetClass(int code, String name, int yearn_born, String color, String health_status, String breed, boolean pedigree) {
        this.code = code;
        this.name = name;
        this.yearn_born = yearn_born;
        this.color = color;
        this.health_status = health_status;
        this.breed = breed;
        this.pedigree = pedigree;
    }

    public int getYearn_born() {
        return yearn_born;
    }

    public void setYearn_born(int yearn_born) {
        this.yearn_born = yearn_born;
    }

    
    
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getHealth_status() {
        return health_status;
    }

    public void setHealth_status(String health_status) {
        this.health_status = health_status;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public boolean isPedigree() {
        return pedigree;
    }

    public void setPedigree(boolean pedigree) {
        this.pedigree = pedigree;
    }
    
    
}
