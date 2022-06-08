/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Serializacion;
import com.mycompany.tarea8.datos.Contacto;
import java.util.*;
import java.io.*;
/**
 *
 * @author julia
 */
public class Serializando {
    
    public static void main(String[] args) {
        
        Contacto[] contac = new Contacto[5];
        contac[0] = new Contacto("Juan Alberto Perez Avila", "3526805268", "juan@gmail.com", "Coca - Cola", "Calle 23 #55-32");
        contac[1] = new Contacto("Marta Ramirez Avila", "57598453", "marta@gmail.com", "Colombina", "Calle 54 #76-09");
        contac[2] = new Contacto("Sebastian Plinio Garcia", "523423456", "sebas@gmail.com", "Glacial", "Calle 64 #33-12");
        contac[3] = new Contacto("Lorena Lizarazo Garzon", "450349858", "lorena@gmail.com", "Nutresa", "Carrera 87 #18-29");
        contac[4] = new Contacto("Sara Jurado Briceño", "123i3590", "sarita@gmail.com", "Doña Arepa", "Carrera 5 #77-99");
        try{
            
            ObjectOutputStream escribiendo_fichero=new ObjectOutputStream(new FileOutputStream("C:\\Users\\julia\\OneDrive\\Escritorio\\libGDX Java\\contacto.txt"));
            
            escribiendo_fichero.writeObject(contac);
            escribiendo_fichero.close();
            
            ObjectInputStream recuperando_fichero=new ObjectInputStream(new FileInputStream("C:\\Users\\julia\\OneDrive\\Escritorio\\libGDX Java\\contacto.txt"));
            
            Contacto[] contacto_recuperado=(Contacto[]) recuperando_fichero.readObject();
            recuperando_fichero.close();
            
            for(Contacto e : contacto_recuperado){
                System.out.println(e);
            }
            
        }catch(IOException | ClassNotFoundException e){
            
        }
    }
    
}

class contacto implements Serializable {
    
    public contacto(String nombre, String numero, String correo, String empresa, String direccion){
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
    
    private String nombre;
    private String numero;
    private String correo;
    private String empresa;
    private String direccion;
    
}

