

public class MetodoBurbujaMain{

public static void main(String[] arg) {

    // Ejercicio 01-ProtocloIndividual Jorge Blandon 
    //Generación del arreglo y sus valores aleatoriamente. 
   
        int A[] = new int[10];

        System.out.println("EJERCICIO 01- Organización de arreglo mediante el metodo burbuja");
            System.out.println("-----------------------------------------------------------");
            System.out.println("-->Array generado automaticamente: ");
            System.out.println("-----------------------------------------------------------");
        for (int i = 0; i < 10; i++) {
            A[i] = (int) (Math.random() * 1000 + 1);    
            System.out.print("|"+A[i]);
        }
        System.out.println(" ");
        System.out.println("-----------------------------------------------------------");
//---------------------------------------------------------------------------------------
      
//Organización de arreglo mediante el metodo burbuja

       
        System.out.println("-->Array ordenado mediando el metodo burbuja: ");
        System.out.println("-----------------------------------------------------------");
        for (int i = 0; i < (A.length - 1); i++) {

            for (int j = 0; j < (A.length - 1); j++) {

                if (A[j] > A[j + 1]) {

                    int temp = A[j];

                    A[j] = A[j + 1];
                    A[j + 1] = temp;

                }
            }
        }

//-----------------------------------------------------------------------------------------
      
//Impresion de arreglo organizado. 
        System.out.println("Array ordenado mediante metodo burbuja: ");
        System.out.println("-----------------------------------------------------------");
        for (int i = 0; i < 10; i++) {
            System.out.print(A[i] + "|");
        }
        System.out.println(" ");
        
        System.out.println("-----------------------------------------------------------");

}

        

}