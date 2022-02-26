public class MetodoInsercionMain {

    public static void main(String[] arg) {

      // Ejercicio 02-ProtocloIndividual Jorge Blandon.
       //Generación del arreglo y sus valores aleatoriamente. 
                                          
        System.out.println("EJERCICIO 02- Organizacion de arreglo mediante el metodo de inserción directa.");
        System.out.println("--------------------------------------------------------------------");
        int[] MyArreglo= new int[10];
        System.out.println("--> Arreglo de rango 1-1000; Valores desordenados");
        System.out.println("--------------------------------------------------------------------");
        for (int i = 0; i < 10; i++) {
            MyArreglo[i] = (int) (Math.random() * 1000 + 1);
            System.out.print("|" + MyArreglo[i]);
        }
        System.out.println(" ");
        
        //------------------------------------------------------------------------------------------------------
        //Organización del arreglo mediante el metodo inserción directa. 
        int p, j;
            int aux;
            for (p = 1; p < MyArreglo.length; p++){ 
                      aux = MyArreglo[p];           
                      j = p - 1;            
                      while ((j >= 0) && (aux < MyArreglo[j])){                                
                                                        
                        MyArreglo[j + 1] = MyArreglo[j];   
                                     j--;               
                      }
                      MyArreglo[j + 1] = aux;       
            }
//-----------------------------------------------------------------------------------------------------------------------
//Impresión del arreglo ordenado
            System.out.println("--------------------------------------------------------------------");
            System.out.println("--> Array ordenado mediante metodo de inserccion directa: ");
            for (int i = 0; i < 10; i++) {
                System.out.print(MyArreglo[i] + "|");
            }
            System.out.println(" ");
        

        System.out.println("--------------------------------------------------------------------");

    }
    
}
