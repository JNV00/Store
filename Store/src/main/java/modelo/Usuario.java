/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.math.BigInteger;
import java.util.Vector;


/**
 *
 * @author Jorge Luis Murrieta
 */
public class Usuario {
    private String id;
    private String nombreCuenta;
    private int edad;
    private String correo;
    private String contraseña;
    private Vector listaDeseos;
    private Vector juegos;
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombreCuenta() {
        return nombreCuenta;
    }

    public void setNombreCuenta(String nombreCuenta) {
        this.nombreCuenta = nombreCuenta;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Vector getListaDeseos() {
        return listaDeseos;
    }

    public void setListaDeseos(Vector listaDeseos) {
        this.listaDeseos = listaDeseos;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nombreCuenta=" + nombreCuenta + ", edad=" + edad + ", correo=" + correo + ", contrase\u00f1a=" + contraseña + ", listaDeseos=" + listaDeseos + '}';
    }
    
    
    
}
