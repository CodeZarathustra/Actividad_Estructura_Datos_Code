public class MetodoQuikSortMain {

 //EJERCICIO 03- Arrego por el metodo quickSort
          /* Esta función toma el último elemento como pivote,
           coloca el elemento pivote en su posición
           posición en la matriz ordenada, y coloca todos los
           menores (más pequeños que el pivote) a la izquierda del
           pivote y todos los elementos mayores a la derecha
           del pivote */
//--------------------------------------------------------------------------------------------
        int particion(int arr[], int menor, int mayor)
        {
            int pivot = arr[mayor]; 
            int i = (menor-1); // índice del elemento más pequeño
            for (int j=menor; j<mayor; j++)
            {
                // Si el elemento actual es menor o
                // igual al pivote
                if (arr[j] <= pivot)
                {
                    i++;
      
                    // swap arr[i] and arr[j]
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
      
            // swap arr[i+1] and arr[high] (or pivot)
            int temp = arr[i+1];
            arr[i+1] = arr[mayor];
            arr[mayor] = temp;
      
            return i+1;
        }
 //--------------------------------------------------------------------------------------------
      
       /* La función principal que implementa QuickSort()
          arr[] --> Matriz a ordenar,
          bajo --> índice inicial,
          alto --> índice final */
        void sort(int arr[], int bajo, int alto)
        {
            if (bajo < alto)
            {
              /* pi es el índice de partición, arr[pi] está 
                  ahora en el lugar correcto */
                int pi = particion(arr, bajo, alto);
      
              // Ordenar recursivamente los elementos antes
                // partición y después de la partición
                sort(arr, bajo, pi-1);
                sort(arr, pi+1, alto);
            }
        }
      
        /* Una función de utilidad para imprimir matrices de tamaño n */
        static void imprimirArray(int arr[])
        {
            int n = arr.length;
            for (int i=0; i<n; ++i)
                System.out.print(arr[i]+"|");
            System.out.println();
        }
 //-------------------------------------------------------------------------------------------- 
        // Programa
        public static void main(String args[])
        {
            
           //Se genera el arreglo automaticamente
           System.out.println("--> Arreglo de rango 1-1000; Valores desordenados");
           System.out.println("--------------------------------------------------------------------");
           int[] MyArreglo= new int[10];
           for (int i = 0; i < 10; i++) {
               MyArreglo[i] = (int) (Math.random() * 1000 + 1);
               System.out.print("|" + MyArreglo[i]);
           }
           System.out.println(" ");


            int n = MyArreglo.length;
      
            MetodoQuikSortMain ob = new MetodoQuikSortMain();
            ob.sort(MyArreglo, 0, n-1);
            System.out.println("--------------------------------------------------------------------");
      
            System.out.println("--> Array ordenado mediante el metodo QuickSort: ");
            System.out.println("-------------------------------------------------");

            imprimirArray(MyArreglo);
        }
    
    //--------------------------------------------------------------------------------------------
}
