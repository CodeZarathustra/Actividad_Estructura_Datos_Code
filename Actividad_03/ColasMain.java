import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import javax.naming.LinkException;

/**
 * ColasMain
 * 
 * En este Ejemplo se utiliza la interface Queue, 
 * perteneciste al Framework Collection en Java
 */
public class ColasMain {

    public static void main(String[] args) {
        
        //Se crea una colección de tipo cola sobre la que trabajar
        Queue<Integer> list01= new LinkedList<>();
        
            //Se llena la cola con 50 numeros
            for (int i = 0; i < 20; i++) {
                list01.add(i);
                
            }
            list01.stream().forEach((x)-> System.out.print(x +"| "));
            System.out.println(" ");

           //Contar los elementos de una Cola
           
           System.out.println("-> El tamaño de la Cola: "+list01.size());

           //Saber si una Cola esta vacia
           System.out.println("-> Esta la Cola vacia? :  "+list01.isEmpty());

           //Acceder a un elemento de la Cola
           list01.add(154);

           System.out.println("-> Lista con elemento agregado: ");
           list01.stream().forEach((x)-> System.out.print(x +"| "));
           System.out.println(" ");

           //Borrar todos los elementos de la cola
           System.out.println("-> Removiendo todos lo elementos de la Cola:");
           list01.clear();
           System.out.println("-> Esta la Cola vacia? :  "+list01.isEmpty());


       
                
    }

      
        
    
}