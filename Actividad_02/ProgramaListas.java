import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class ProgramaListas {
    
 //----------------------------------------
    //PUNTO 02.15 PROGRAMA EJECUTABLE QUE PERMITE HACER OPERACIONES SOBRE LISTAS
  //----------------------------------------

 
    public static void main(String[] args) {
        
        //Lista de enteros usando Vector   
        Vector<Integer> vectorList= new Vector(10);

        //Listas de String usando LinkedList
        LinkedList<String> linkedList= new LinkedList();

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
                "AGREGANDO VARIOS ELEMENTOS E IMPRIMIENDO CON CICLO FOR--->"+ linkedList.get(i)); 
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
        //




        






            

}
