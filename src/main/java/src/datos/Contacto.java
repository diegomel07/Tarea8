/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.datos;

import java.io.Serializable;

/**
 *
 * @author dimel
 */
public class Contacto implements Serializable{
    private String nombre;
    private String numero;
    private String correo;
    private String empresa;
    private String direccion;
    
    public Contacto(){
        
    }
    
    public Contacto(String nombre, String numero, String correo, String empresa, String direccion){
        this.nombre = nombre;
        this.numero = numero;
        this.correo = correo;
        this.empresa = empresa;
        this.direccion = direccion;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCorreo() {
        return this.correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEmpresa() {
        return this.empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Contacto{" + "nombre=" + nombre + ", numero=" + numero + ", correo=" + correo + ", empresa=" + empresa + ", direccion=" + direccion + '}';
    }
}
