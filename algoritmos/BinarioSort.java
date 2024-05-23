public class BinarioSort {
  
    public static void busquedaBinaria(int a[], int clave) {
      int central, bajo, alto;
      int valorCentral;
      bajo = 0;
      alto = a.length - 1;
      while (bajo <= alto) {
        central = (bajo + alto) / 2; // índice de elemento central
        valorCentral = a[central]; // valor del índice central
        if (clave == valorCentral)
          System.out.println("Encontrado " + central); // encontrado, devuelve posición
        else if (clave < valorCentral)
          alto = central - 1; // ir a sublista inferior
        else
          bajo = central + 1; // ir a sublista superior
      }      	 	
    }


       
       
        
        // Method to print an integer array
      
  
    
  }
  