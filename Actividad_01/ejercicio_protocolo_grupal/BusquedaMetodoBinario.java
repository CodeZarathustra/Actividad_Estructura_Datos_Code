import java.util.Scanner;
//Jorge Blandon
public class BusquedaMetodoBinario {

        //ACTIVIDAD 02-03- Protocolo Grupal- Busqueda por metodo binario-Recursivo.
        //En este programa se utiliza tanto la binaria tanto la aplicación de la recursividad
        //Puesto que en la función busqueda binaria se llama así misma para poder funcionar. 
        int busquedaBinaria(int arr[], int l, int r, int x)
        {
            if (r >= l) {
                int mid = l + (r - l) / 2;
     
                // Si el elemento está presente en el
                // medio mismo
                if (arr[mid] == x)
                    return mid;
     
                // Si el elemento es menor que mid, entonces
                // sólo puede estar presente en la submatriz de la izquierda
                if (arr[mid] > x)
                    return busquedaBinaria(arr, l, mid - 1, x);
     
            // Si no, el elemento sólo puede estar presente
                // en la submatriz de la derecha
                return busquedaBinaria(arr, mid + 1, r, x);
            }
     
             // Llegamos aquí cuando el elemento no está presente
            // en el array
            return -1;
        }
     //--------------------------------------------------------------------------------------------
        // Método codunctor para probar lo anterior
        public static void main(String args[])
        {
            Scanner sc= new Scanner(System.in);
            int A[] = new int[20];
    
                System.out.println("EJERCICIO 02- Protocolo grupal- Busqueda por metodo binario");
                System.out.println("-----------------------------------------------------------");
                System.out.println("-->Array generado automaticamente: ");
                System.out.println("-----------------------------------------------------------");
                        for (int i = 0; i < 20; i++) {
                            A[i] = (int) (Math.random() * 1000 + 1);    
                            System.out.print("|"+A[i]);
                        }
                //-----------------------------------------------------------------------------------------
                System.out.println(" ");
                System.out.println("-----------------------------------------------------------");
                System.out.println("Por favor ingrese el numero que desea buscar en el array: ");
                int numeroBuscar=sc.nextInt();

            BusquedaMetodoBinario ob = new BusquedaMetodoBinario();
            //int arr[] = { 2, 3, 4, 10, 40 };
            int n =A.length;
            int x = numeroBuscar;
            int res = ob.busquedaBinaria(A, 0, n - 1, x);
            if (res == -1) {
                System.out.println("-----------------------------------------------------------");
                System.out.println("Elemento no existente");
                System.out.println("-----------------------------------------------------------");}
            else {
                System.out.println("-----------------------------------------------------------");
                System.out.println("Elementos encontrado en el indice " + res);
                System.out.println("-----------------------------------------------------------");}
        }
//--------------------------------------------------------------------------------------------------
        







    
}
