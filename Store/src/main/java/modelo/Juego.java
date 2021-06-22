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
public class Juego {
    private String nombre;
    private String categoria;
    private String tipo;
    private String genero;
    private String plataforma;
    private int precio;

    public Juego(String nombre, String categoria, String tipo, String genero, String plataforma, int precio) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.tipo = tipo;
        this.genero = genero;
        this.plataforma = plataforma;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Juego{" + "nombre=" + nombre + ", categoria=" + categoria + ", tipo=" + tipo + ", genero=" + genero + ", plataforma=" + plataforma + ", precio=" + precio + '}';
    }
    
    
}
