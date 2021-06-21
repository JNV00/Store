/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Yo
 */
public class Juegos {
    private String edad;
    private int precio;
    private String genero;
    private String caracteristica;
    private String tipo;
    private String plataforma;

    public Juegos(String edad, int precio, String genero, String caracteristica, String tipo, String plataforma) {
        this.edad = edad;
        this.precio = precio;
        this.genero = genero;
        this.caracteristica = caracteristica;
        this.tipo = tipo;
        this.plataforma = plataforma;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    @Override
    public String toString() {
        return "Juegos{" + "edad=" + edad + ", precio=" + precio + ", genero=" + genero + ", caracteristica=" + caracteristica + ", tipo=" + tipo + ", plataforma=" + plataforma + '}';
    }
    
    
}
