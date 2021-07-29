/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_pkg;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author apmejiar
 */
public class DogPetClass extends PetClass {

    private VeterinaryClass veterinary;
    Scanner inst_datos = new Scanner(System.in);
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";

    public DogPetClass(int code, String name, int yearn_born, String color, String health_status, String breed, boolean pedigree) {
        super(code, name, yearn_born, color, health_status, breed, pedigree);
    }

    public DogPetClass() {
    }

    public VeterinaryClass getVeterinary() {
        return veterinary;
    }

    public void setVeterinary(VeterinaryClass veterinary) {
        this.veterinary = veterinary;
    }

    public void crud_arrayListObject() {
        ArrayList<DogPetClass> dogObjectArray = new ArrayList<>();
        boolean exit_program = false;
        while (!exit_program) {
            System.out.println(ANSI_BLUE + "Seleccione una opción:\n    1. Crear perrito\n    2. Consultar registros\n    3. Consultar perrito especifico\n    4. Editar\n    5. Eliminar\n" + ANSI_RESET + ANSI_RED + "    6.Salir del programa" + ANSI_RESET);
            int option = Integer.parseInt(inst_datos.nextLine());

            switch (option) {
                case 1:
                    System.out.println("Cuántos perritos deseas crear?");
                    int cant_dog = Integer.parseInt(inst_datos.nextLine());
                    for (int i = 0; i < cant_dog; i++) {
                        System.out.println("Código: ");
                        int code = Integer.parseInt(inst_datos.nextLine());

                        System.out.println("Nombre: ");
                        String name = inst_datos.nextLine();

                        System.out.println("Año de nacimiento: ");
                        int yearn_born = Integer.parseInt(inst_datos.nextLine());

                        System.out.println("Raza: ");
                        String breed = inst_datos.nextLine();

                        System.out.println("Color: ");
                        String color = inst_datos.nextLine();

                        System.out.println("Estado de salud: ");
                        String health_status = inst_datos.nextLine();

                        System.out.println("Es pedigree? (Si, No) ");
                        String pedigree = inst_datos.nextLine();

                        if (pedigree.toLowerCase().equals("si") || pedigree.toLowerCase().equals("sí")) {
                            super.setPedigree(true);
                        } else {
                            super.setPedigree(false);
                        }

                        DogPetClass dog = new DogPetClass(code, name, yearn_born, color, health_status, breed, super.isPedigree());
                        dogObjectArray.add(dog);
                        System.out.println(ANSI_RED + "=====================MASCOTA CREADA CON ÉXITO=====================" + ANSI_RESET);
                    }
                    break;
                case 2:
                    System.out.println(ANSI_BLUE + "========================BASE DE DATOS MINTIC INC========================" + ANSI_RESET);
                    for (int i = 0; i < dogObjectArray.size(); i++) {
                        DogPetClass dog = dogObjectArray.get(i);
                        System.out.println("=============================================================");
                        System.out.println(ANSI_RED + "Nombre: " + ANSI_RESET + dog.getName());
                        System.out.println(ANSI_RED + "Código: " + ANSI_RESET + dog.getCode());
                        System.out.println(ANSI_RED + "Año de nacimiento: " + ANSI_RESET + dog.getYearn_born());
                        System.out.println(ANSI_RED + "Raza: " + ANSI_RESET + dog.getBreed());
                        System.out.println(ANSI_RED + "Estado de salud: " + ANSI_RESET + dog.getHealth_status());
                        System.out.println(ANSI_RED + "Pedigree: " + ANSI_RESET + dog.isPedigree());
                        System.out.println(ANSI_BLUE + "=============================================================" + ANSI_RESET);
                    }
                    break;
                case 3:

                    System.out.println("Indica el indice de la mascota a consultar");
                    int pet_show = Integer.parseInt(inst_datos.nextLine());
                    if (pet_show >= 0 && pet_show <= dogObjectArray.size()) {
                        DogPetClass dog = dogObjectArray.get(pet_show);
                        System.out.println(ANSI_RED + "Nombre: " + ANSI_RESET + dog.getName());
                        System.out.println(ANSI_RED + "Código: " + ANSI_RESET + dog.getCode());
                        System.out.println(ANSI_RED + "Año de nacimiento: " + ANSI_RESET + dog.getYearn_born());
                        System.out.println(ANSI_RED + "Raza: " + ANSI_RESET + dog.getBreed());
                        System.out.println(ANSI_RED + "Estado de salud: " + ANSI_RESET + dog.getHealth_status());
                        System.out.println(ANSI_RED + "Pedigree: " + ANSI_RESET + dog.isPedigree());

                    }
                    break;
                case 4:
                    System.out.println("Indica el indice de la mascota a editar");
                    pet_show = Integer.parseInt(inst_datos.nextLine());
                    if (pet_show >= 0 && pet_show <= dogObjectArray.size()) {
                        DogPetClass dog = dogObjectArray.get(pet_show);
                        System.out.println(ANSI_RED + "Nombre: " + ANSI_RESET + dog.getName());
                        System.out.println(ANSI_RED + "Código: " + ANSI_RESET + dog.getCode());
                        System.out.println(ANSI_RED + "Año de nacimiento: " + ANSI_RESET + dog.getYearn_born());
                        System.out.println(ANSI_RED + "Raza: " + ANSI_RESET + dog.getBreed());
                        System.out.println(ANSI_RED + "Estado de salud: " + ANSI_RESET + dog.getHealth_status());
                        System.out.println(ANSI_RED + "Pedigree: " + ANSI_RESET + dog.isPedigree());
                        System.out.println("Qué deseas editar?\n    1. Nombre\n    2. Año de nacimiento\n    3. Estado de salud");
                        int option_edit = Integer.parseInt(inst_datos.nextLine());
                        if (option_edit == 1) {
                            System.out.println(ANSI_RED + "Nombre nuevo" + ANSI_RESET);
                            String name = inst_datos.nextLine();
                            dog.setName(name);
                        } else if (option == 2) {
                            System.out.println(ANSI_RED + "Año de nacimiento nuevo" + ANSI_RESET);
                            int born_year = Integer.parseInt(inst_datos.nextLine());
                            dog.setYearn_born(born_year);
                        } else if (option == 3) {
                            System.out.println(ANSI_RED + "Estado de salud actual" + ANSI_RESET);
                            String health_status = inst_datos.nextLine();
                            dog.setHealth_status(health_status);
                        } else {
                            System.out.println(ANSI_RED + "ERROR" + ANSI_RESET);
                        }
                    }
                    break;
                case 5:
                    System.out.println("Indica el indice de la mascota a eliminar");
                    pet_show = Integer.parseInt(inst_datos.nextLine());

                    if (pet_show >= 0 && pet_show <= dogObjectArray.size()) {
                        DogPetClass dog = dogObjectArray.get(pet_show);
                        System.out.println("Estás seguro que deseas eliminar la mascota código " + dog.getCode() + " (Sí, No)");
                        System.out.println(ANSI_RED + "Nombre: " + ANSI_RESET + dog.getName());
                        System.out.println(ANSI_RED + "Código: " + ANSI_RESET + dog.getCode());
                        String delete_dog = inst_datos.nextLine();

                        if (delete_dog.toLowerCase().equals("si") || delete_dog.toLowerCase().equals("sí")) {
                            dogObjectArray.remove(pet_show);
                            System.out.println(ANSI_BLUE + "========================BASE DE DATOS MINTIC INC========================" + ANSI_RESET);
                            for (int i = 0; i < dogObjectArray.size(); i++) {
                                DogPetClass current_list = dogObjectArray.get(i);
                                System.out.println("=============================================================");
                                System.out.println(ANSI_RED + "Nombre: " + ANSI_RESET + current_list.getName());
                                System.out.println(ANSI_RED + "Código: " + ANSI_RESET + current_list.getCode());
                                System.out.println(ANSI_RED + "Año de nacimiento: " + ANSI_RESET + current_list.getYearn_born());
                                System.out.println(ANSI_RED + "Raza: " + ANSI_RESET + current_list.getBreed());
                                System.out.println(ANSI_RED + "Estado de salud: " + ANSI_RESET + current_list.getHealth_status());
                                System.out.println(ANSI_RED + "Pedigree: " + ANSI_RESET + current_list.isPedigree());
                                System.out.println(ANSI_BLUE + "=============================================================" + ANSI_RESET);
                            }
                        } else {
                            System.out.println(ANSI_BLUE + "======================Cancelando proceso======================" + ANSI_RESET);
                        }
                    }
                    break;
                case 6:
                    break;
                default:
                    System.out.println(ANSI_RED + "ERROR" + ANSI_RESET);
            }
        }
    }

}
