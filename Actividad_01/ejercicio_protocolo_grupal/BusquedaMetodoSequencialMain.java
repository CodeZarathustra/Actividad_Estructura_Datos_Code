import java.util.Scanner;
//Jorge Blandon
class BusquedaMetodoSequencialMain {

        //Creamos un metodo especifico para buscar un numero demanera secuencial en un array dado
    public static int busquedaSecuencial(int[]arr, int llave) {
        int tamañoArray = arr.length;
        for(int i = 0; i < tamañoArray; i++){
            if(arr[i] == llave) {
            return i;
            }
        }
        return -1;
        }
        //----------------------------------------------------------------------------------------
    public static void main (String [] arg) {

        //EJERCICIO 01- Protocolo grupal- Busqueda por metodo secuencial
        Scanner sc= new Scanner(System.in);
        int A[] = new int[20];

            System.out.println("EJERCICIO 01- Protocolo grupal- Busqueda por metodo secuencial");
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
                    //LLamamos al metodo y le pasamos como argumento
                    int res=busquedaSecuencial(A, numeroBuscar);
                    if(res==-1){
                        System.out.println("-----------------------------------------------------------");
                        System.out.println("El número "+numeroBuscar+" no existe en el array!");
                        System.out.println("-----------------------------------------------------------");
                    }else{
                        System.out.println("-----------------------------------------------------------");
                        System.out.println("El número "+A[res]+" si existe en el array!");
                        System.out.println("-----------------------------------------------------------");

                    }

}

}