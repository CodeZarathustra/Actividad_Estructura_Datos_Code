import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


//-----------------------------------------------------
//Punto 2.1.(12-30) EJEMPLOS EN CODIGO
//-----------------------------------------------------

/*NOTA: En los siguientes ejemplos utilizo los metodos de
 manipulación de la interfaz Colletions*/
 

class ManejoDeLista {

          
    public static void main(String arg[]) {

        //Punto 2.1.12 COMPROBAR SI LA LISTA ESTA VACIA
        ArrayList<String> listVacia= new ArrayList<String>();
        boolean flag= listVacia.isEmpty();

        //------------------------------------------------------------
        //2.1.13  BUSCAR ELEMENTOS.
        /* Este algoritmo lo podemos construir de diferentes maneras 
        cada forma va depender el contexto y tiene su costo en temas 
        de complejidad O(n), que es medido por la forma en la acce-
        demos a los elemetos, en este caso la interfaz list de Java 
        no da un metodo  simple para buscar un elemento en una lista 
        a través de su INDEX*/
        int elementoABuscar=3;
        ArrayList<Integer> listBuscar= new ArrayList<Integer>();
            listBuscar.add(1);
            listBuscar.add(2);
            listBuscar.add(3);
        
            for(int i=0;i<listBuscar.size();i++) {

                    if(listBuscar.get(i)==elementoABuscar){

                        System.out.println("El elemento buscado: "+ elementoABuscar+ " existe.");
                    } else {

                        System.out.println("El elemento buscado no existe.");
                    }
            }
     
        //-----------------------------------------------------------
        //2.1.14  BUSCAR ELEMENTOS
        ArrayList<Integer> listPorIndex= new ArrayList<Integer>();
        listPorIndex.add(1);
        listPorIndex.add(2);
        listPorIndex.add(3);
            int index=listPorIndex.indexOf(3);


      //--------------------------------------------------------------
      //2.1.15 OBTENER ELEMENTO EN LA POSICIÓN
      ArrayList<Integer> listBuscarX= new ArrayList<Integer>();
            listBuscarX.add(1);
            listBuscarX.add(2);
            listBuscarX.add(3);
  
      int elementoEncontrado=(int)listBuscar.get(1);


      //--------------------------------------------------------------
      //2.1.17 AGREGAR ELEMENTO AL INICIO DE LISTA
            int itemInicio= 10;

            LinkedList<Integer> listaExample= new LinkedList<>();
            listaExample.add(1);
            listaExample.add(2);
            listaExample.add(3);

                listaExample.addFirst(itemInicio);

      //---------------------------------------------------------------
      //2.1.18 AGREGAR ELEMENTOS AL FINAL DE LA LISTA.
        int itemFinal=20;
            listaExample.addLast(itemFinal);
        
        //------------------------------------------------------------
        //2.1.19
        
        //2.1.20 AGREGAR ELEMENTO EN CUALQUIER POSICIÓN
        int itemRamdon= 100;
        listaExample.add(1, itemRamdon);
                    
        //------------------------------------------------------------
        //2.1.21 ELIMINAR ITEM AL COMIENZO
        listaExample.removeFirst();

        //------------------------------------------------------------
        //2.1.22 ELIMINAR ITEM AL FINAL
        listaExample.removeLast();


        //------------------------------------------------------------
        //2.1.23 ELIMINAR ENTRE EL PRIMERO Y EL ULTIMO  
        listaExample.remove(2);


        //------------------------------------------------------------
        //2.1.24  ELIMINAR EN CUALQUIER PARTE

        //------------------------------------------------------------
       //2.10.25 AGREGAR EN CUALQUIER PARTE DE LA LISTA.
       // es decir, agregar una sublista en otra lista.
       /*  Se crea una lista de Arrays*/
       List <String> arr01= new ArrayList<>();   

       List<List> l1= new ArrayList();
       List<List> l2= new ArrayList();
       List<List> l3= new ArrayList();
       
       List<List> listaArray= new ArrayList();
       
       listaArray.add(l1);
       listaArray.add(l2);
       listaArray.add(l3);
       //-------------------------------------------------------------
       //2.1.26 ELIMINAR SUBLISTA.
       int elimSubLista=1;
       listaArray.remove(elimSubLista);


       //-------------------------------------------------------------
       //2.1.27 LIMPIAR SUBLISTA
       listaExample.clear();

       //-------------------------------------------------------------
       //2.1.28 ORDENAR ASCENDENTE
       Collections.sort(listaExample);


       //-------------------------------------------------------------
       //2.1.29 ORDENAR ASCENDENTE
       Collections.reverse(listaExample);

       //-------------------------------------------------------------
       //2.1.30 DESORDENAR LISTA
       Collections.shuffle(listaArray);
 

    }
    

 }