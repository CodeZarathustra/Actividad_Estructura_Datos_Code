import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import java.util.stream.Stream;

import javax.naming.LinkException;

public class ProgramaListas {
    
 //----------------------------------------
    //PUNTO 02.15 PROGRAMA EJECUTABLE QUE PERMITE HACER OPERACIONES SOBRE LISTAS
  //----------------------------------------

 
    public static void main(String[] args) {
        
        //Lista de enteros usando Vector   
        Vector<Integer> vectorList= new Vector(50);
        for (int i = 0; i < vectorList.size(); i++) {
            
            vectorList.add(i);

        }

        //Listas de String usando LinkedList RELLENANDO CON X DATOS
        LinkedList<String> linkedList= new LinkedList();

        for (int i = 0; i < 20; i++) {
            
            String toStr= Integer.toString(i);
            String cadena= "Cadena -->"+ toStr;

        }

        //Listas usando ArrayList
        ArrayList<Gasto> arrListGastos= new ArrayList(8);
        Gasto g1= new Gasto();Gasto g5= new Gasto();
        Gasto g2= new Gasto();Gasto g6= new Gasto();
        Gasto g3= new Gasto();Gasto g7= new Gasto();
        Gasto g4= new Gasto(); Gasto g8= new Gasto();

        arrListGastos.add(g1);arrListGastos.add(g5);
        arrListGastos.add(g2);arrListGastos.add(g6);
        arrListGastos.add(g3);arrListGastos.add(g7);
        arrListGastos.add(g4);arrListGastos.add(g8);

        //UTILIZANDO METODOS

        //1. Agregar al inicio
        vectorList.add(0, 100);
        System.out.println("PRIMER ELEMENTO-->"+ vectorList.firstElement());
        //2. Agregar al final
        linkedList.addLast("Colombia");
        System.out.println("ELEMENTO  FINAL-->"+ vectorList.lastElement());
        //3. Obtener tamaño
        System.out.println("OBTENER TAMAÑO-->"+ arrListGastos.size());
        //4. Mostrar si está o no vacía
        System.out.println("Esta la lista vacía? -->"+ vectorList.isEmpty());
        //5. agregar en cualquier parte (insertar)
        vectorList.add(7, 500);
        System.out.println(
            "Insertar en cualquier parte de la lista -->");  
        for(int i=0;i<vectorList.size();i++) {

            System.out.println(vectorList.get(i)); 
            }
        //6. Agregar varios elementos
        for(int i=0;i<5;i++) {
            String item= "OBJETO";
            linkedList.add(item);
            System.out.println(
                "AGREGANDO VARIOS ELEMENTOS E IMPRIMIENDO CON CICLO FOR ASCENDENTE--->"+ linkedList.get(i)); 
            }
        //7. Mostrar los elementos usando solo System.out.print
                //Punto abordado anteriormente
        //8.8. Mostrar los elementos usando iterador
           Iterator<Integer>t= vectorList.iterator();
           while(t.hasNext()) {
            
            System.out.println("IMPRIMIENDO LISTA CON ITERATOR y WHILE---> " + t.next()); 

           }
        //9. Mostrar los elementos usando for traditional
            //Punto abordado anteriormente
        //10. Mostrar los elementos usando el for especial o foreach
           for (Gasto gasto : arrListGastos) {
               System.out.println("ITERANDO USANDO FOR EACH---> "+ gasto);
           }
        //11. Mostrar los elementos usando While
         //Punto abordado anteriormente
         //12. Mostrar los elementos usando do/while
         int itDW=0;
         do{
           
            System.out.println("IMPRIMIENDO USANDO DO WHILE--->"+linkedList.get(itDW));
            itDW++;

        } while(itDW<linkedList.size());
        //14. Mostrar los elementos usando streem
        vectorList.forEach((Integer n)-> {
            System.out.print(n);
        });
        //14. Mostrar los elementos usando streem
        Stream<Integer> streamGastoList= vectorList.stream();
        System.out.print("IMPRIMIENDO POR STREAM");
        streamGastoList.forEach((n)->System.out.println(n));
        //15. Mostrar los elementos ascendentemente usando For
        //Punto ya abordado
        //16. Mostrar los elementos descendentemente usando For
        System.out.print("IMPRIMIENDO DECENDENTE");
        for (int i=vectorList.size(); 0 < i; i-- ) {
                System.out.println(vectorList.get(i-1));

        }
        //17. Obtener el primer elemento
        System.out.print("IMPRIMIENDO PRIMER ELEMENTO");
        System.out.print(vectorList.firstElement());
        //18. Obtener el último elemento
        System.out.print("IMPRIMIENDO ULTIMO ELEMENTO");
        System.out.print(vectorList.lastElement());
        //19. Obtener el elemento de la posición X
        //20. Obtener la posición del elemento Y
        System.out.print("OBTENIENDO ELEMENTO POSICIÓN x Y y");
        int x=3, y=2;
            arrListGastos.get(x);
            arrListGastos.get(y);
        //21. Saber si un elemento está dentro de la lista buscando desde el inicio
        //22. Saber si un elemento está dentro de la lista buscando desde el final
        
        int flag488= 5;
        for (int n :  vectorList) {
            if(n==flag488){
                System.out.print("Elemento encontrado");
            }else{
                System.out.print("Elemento no encontrado");
            }   
        }

        System.out.print("BUSCANDO DESDE EL FINAL");
        for (int i=vectorList.size(); 0 < i; i-- ) {
           
            int flag=vectorList.get(i-1);
            if(flag==flag488){
                System.out.print("Elemento encontrado");
            }else{
                System.out.print("Elemento no encontrado");
            }   

        }
        //23.Para los valores numéricos obtener el mínimo, el máximo, en
        //promedio y la sumatoria de los elementos.
        int max, min;

        max=min=vectorList.get(0);

        for (int i = 0; i < vectorList.size(); i++) {
              
        if(vectorList.get(i)>max){
        
            max=vectorList.get(i);
            
        }
        
        if(vectorList.get(i)<min){
        
            min=vectorList.get(i);
            
        }
        System.out.print("IMPRIMIENDO MAXIMO->"+ max+ "  IMPRIMIENDO MÍNIMO: "+min );  
}
        //24. Eliminar el primer elemento
        //25. Eliminar el último elemento
        //26. Eliminar un elemento en la Posición X
        System.out.print("IMPRIMIENDO PRIMER,ULTIMO ELEMENTO, ELEMENTO POSICICIÓN X");
        int xPosi= 6;
        vectorList.removeElement(vectorList.indexOf(vectorList.lastElement()));
        vectorList.remove(vectorList.lastElement());
        vectorList.remove(xPosi); 

        //Eliminar la primera ocurrencia del elemento Y (el primer Y que
        //encuentre en la lista)

        int y1=10%3;

        for (int i = 0; i < vectorList.size(); i++) {
            if (y1==vectorList.get(i)) {
                vectorList.remove(i);
                System.out.print("Primera ocurrencia del elemento Y eliminada");

            }else {
                System.out.print("No encontrado");

            }
        }
        //28. Eliminar varios elementos de la lista, es decir, eliminar una sublista o
            //rango de elementos.
          //  29. Borrar todos los elementos de la lista.


          System.out.print("REMOVIENDO UN ELEMENTOS DE LA LIST: ");
          for (int i = 0; i < vectorList.size(); i++) {
              if (i%2==0) {
                System.out.println(i);
                vectorList.remove(i);
              }
          }

          System.out.print("REMOVIENDO TODOS LOS ELEMENTOS DE LA LISTA: ");
          vectorList.removeAllElements();


          System.out.print("CONVIRTIENDO A ARRAY: ");
          Integer[] arr = new Integer[linkedList.size()];
          arr = linkedList.toArray(arr);
          System.out.print("ARRAY: " + arr.toString());
        // 32. Obtener una lista a partir de un arreglo, usando clase Arrays
        System.out.print("CONVIRTIENDO A DE UN ARRAY A UNA LISTA: ");
        System.out.println(Arrays.asList(arr).getClass());
          //33. Copiar o clonar una lista
        System.out.print("COPIANDO UNA LISTA: "); 
        Object nuevoArray=arrListGastos.clone();
        //34. Unir dos listas en una
        
        ArrayList<Integer> lisUno= new ArrayList<>();
        ArrayList<Integer> lisDos= new ArrayList<>();
        System.out.print("UNIR DOS LISTAS EN UNA: "); 
        List<Integer> uni = new ArrayList<Integer>();
        uni.addAll(lisUno);
        uni.addAll(lisDos);

        
        //35. Reemplazar cada elemento X por elemento Y
        String elementoX= "Elemento X";
        System.out.print("REMPLAZAR X POR Y: ");
          for (int i = 0; i < linkedList.size(); i++) {
              linkedList.add(i, elementoX);
                System.out.println(linkedList.get(i));
          }

        //40. Comparar si dos arreglos son iguales, , usando clase Arrays
        System.out.print("COMPARAR SI DOS ARREGLOS SON INGUALES: "); 

        int [] arr01={124,5,65,32,64};
        int [] arr02={45,25,69,36,85,944,58};
        int equal=Arrays.compare(arr01, arr02);
        System.out.println(equal); 

        //36. Buscar un elemento usando búsqueda Binaria
        System.out.print("BUSQUEDA BINARIA: ");
        Arrays.binarySearch(arr01, 5);
        //37. Mostrar los elementos en desorden
  
        //38. Extraer una sublista de la lista origen
        //39. Crear una lista a partir de una
         System.out.print("CREAR Y ESTRAER SUBLISTA: "); 
         List<Gasto> sul=arrListGastos.subList(2, 4);

         for (Gasto gasto : sul) {
            System.out.print(gasto);
         }










          








        






            

}
