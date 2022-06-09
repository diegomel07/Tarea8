
package src.datos;

import java.util.*;
import java.io.*;;

public class Serializando {

    public static ArrayList<Contacto> cargandoContactos(){

        ArrayList<Contacto> contactosActuales = new ArrayList<>();

        try {

            FileInputStream fis = new FileInputStream("Contactos.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            // leyendo los contactos del archivo serializado en una lista
            contactosActuales = (ArrayList) ois.readObject();
 
            ois.close();
            fis.close();

        } catch (Exception e){
            
        }
            
        

        return contactosActuales;
    }
    
    public static void manejandoContacto(Contacto contacto, String metodo) {

        // cargando la lista de contactos actuales
        ArrayList<Contacto> contactosActuales = cargandoContactos();      

        
        if (metodo.equals("crear")){
            // Creando un nuevo contactp
            contactosActuales.add(contacto);
        } else if (metodo.equals("borrar")){

            // Eliminando el contacto desedado

            int r = -1;
        
            for (Contacto c : contactosActuales){
                if (c.getNombre().equals(contacto.getNombre())){
                    r = contactosActuales.indexOf(c);
                }
            }
            
            try {
                contactosActuales.remove(r);
            } catch(Exception e){
                
            } 
        }
            

        try {

            FileOutputStream fos = new FileOutputStream("Contactos.obj", false);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            // Creando un nuevo archivo serializado con la lista de contactos actualizado con el contacto nuevo o el contacto borrado
            oos.writeObject(contactosActuales);
            oos.close();
            fos.close();

        } catch (IOException e){
            e.printStackTrace();
        }
        
        
    }

    
    public static void editandoContacto(Contacto contactoAntiguo, Contacto contactoNuevo){

        // Editando un contaxto existente
        manejandoContacto(contactoAntiguo, "borrar");
        manejandoContacto(contactoNuevo, "crear");

    }

    


}


