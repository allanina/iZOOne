/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


public class ModeloAnimais {

    /**
     * @return the animal
     */
    public String getAnimal() {
        return animal;
    }

    /**
     * @param animal the animal to set
     */
    public void setAnimal(String animal) {
        this.animal = animal;
    }

    /**
     * @return the especie
     */
    public String getEspecie() {
        return especie;
    }

    /**
     * @param especie the especie to set
     */
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    /**
     * @return the anilha
     */
    public int getAnilha() {
        return anilha;
    }

    /**
     * @param anilha the anilha to set
     */
    public void setAnilha(int anilha) {
        this.anilha = anilha;
    }
    
    private String animal;
    private String especie;
    private int anilha; 
}
