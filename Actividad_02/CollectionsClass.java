import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;




//---------------------------------------------
    //Punto 02.1 (5-9)  EJEMPLOS EN CODIGO
//---------------------------------------------

//NOTA: Se utiliza los metodos de la interfaz List

public class CollectionsClass {

//Punto 2.1.5 LISTAS ENLAZADAS//
/*Con esta clase podemos crear una lista enlzada, puesto que 
al construir un objeto de tipo NodoObject agregamo una espacie
de "Puntero"hacía el siguiente objeto o nodo*/
 class NodoObject{
    int data;
    NodoObject next;
        NodoObject( int data, NodoObject next) {

            this.data=data;
            this.next=next;
        }


//------------------------------------------------------------------------------
//Punto 2.1.6 LISTAS DOBLEMENTE ENLAZADAS//
/*En el siguiente ejemplo podemos ver un metodo que 
que devuelve una lista enlazada utilizando la clase LinkedList*/
class ListaDobleEn{
       
    public LinkedList <String> crearLisEnl(){
                LinkedList<String> cars= new LinkedList<>();
                    cars.add("Toyota");
                    cars.add("Tesla");
                    cars.add("Nissan");

            return cars;
        }
}
//-------------------------------------------------------------------------------
//Punto 2.1.9 LISTAS DOBLEMENTE ENLAZADAS//
/*El el siguente ejempl tenemos un clase Nodo con un constructor
que permite que al instanciar un objeto de esta clase se construya
con dos punteros o referencias hacia el nodo inicio y circular cre-
ando así el respectivo circulo */

class NodoaSimpleCircular{

    NodoaSimpleCircular nodoInicio;
    NodoaSimpleCircular nodoUltimo;

    listaEnlazadaSimpleCircular( NodoaSimpleCircular nI, NodoaSimpleCircular nU) {

        this.nodoInicio=nI;
        this.nodoUltimo=nU;

    }
}
//------------------------------------------------------------------------------

}
      }