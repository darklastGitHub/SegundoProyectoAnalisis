/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author HP GABY
 */
public class Ejecutor {

    private String nombre;
    private String criterio;
    private int limite;

    public Ejecutor(String nombre, String criterio, int limite) {
        this.nombre = nombre;
        this.criterio = criterio;
        this.limite = limite;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCriterio() {
        return criterio;
    }

    public void setCriterio(String criterio) {
        this.criterio = criterio;
    }

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

}
