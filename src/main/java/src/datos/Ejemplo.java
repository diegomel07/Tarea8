/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.datos;

import java.util.ArrayList;
import java.util.Collections;


/**
 *
 * @author dimel
 */
public class Ejemplo {
    
    
    public static ArrayList<Contacto> contactos(){
        // Creando ejemplos
        Contacto cont1 = new Contacto("Juan Alberto Perez Avila", "3526805268", "juan@gmail.com", "Coca - Cola", "Calle 23 #55-32");
        Contacto cont2 = new Contacto("Marta Ramirez Avila", "57598453", "marta@gmail.com", "Colombina", "Calle 54 #76-09");

        ArrayList<Contacto> info = new ArrayList<>();
        Collections.addAll(info, cont1, cont2);
        
        return info;
    }
    
    
    
}
