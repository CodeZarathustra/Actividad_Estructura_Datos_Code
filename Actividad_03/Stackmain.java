import java.util.HashMap;
import java.util.List;
import java.util.Stack;

/**
 * PilasMain
 * Para estos ejercicios de ejemplificación utilizaremos la clase
 * de la API Framework Collection de Java Stack, la cual extiende 
 * de vector y esta a su vez.
 */
 public class Stackmain {

   
public static void main(String[] args)
{


    //Se crea una nueva Stack o Pila para hacer operaciones sobre ella
    Stack<Integer> pila01= new Stack<Integer>();
     
    // Se llena la pila Agregando elementos Y agregando varios elementos a la pila
    for (int i = 0; i < 3; i++) {
        
        pila01.push(i);
    }

    //Contar número de elementos en la stack
    System.out.println("-> Contando el numero de elementos de la Pila:");
    System.out.println(pila01.capacity());
    //Vaciar y saber si una lista esta vacia
    System.out.println("-> Esta la pila vacía?:");
    System.out.println(pila01.isEmpty());
    //Mostrar los elementos de la pila y eliminando

    int flag;

    System.out.println("Mostrando elementos de la pila y eliminando varios elementos");
        for (int i = 0; i < pila01.capacity(); i++) {
            flag=pila01.pop();
            System.out.println(flag);
        }

    
    

    

        





    
    



}


    
}
