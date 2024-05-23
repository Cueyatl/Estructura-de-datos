import java.util.Arrays;
import java.util.Random;
import java.util.Scanner; 

public class Main extends ClaseAlgos{
    static int searchedValue;
    
    public  void execute() {
       
        Scanner scanner = new Scanner(System.in);
        //Numero mayor dentro de la lista.
        int maxNumber=15000;
        //Cantidad de elementos en la lista.
        int quantityInList=500;
        //Lista desordenada.
        int[] unsortedList = unsortedList(maxNumber,quantityInList);
        //Lista ordenada.
        int[] sortedList = sortedList(searchedValue, searchedValue);
        //lista desordenaada de tipo double.Es necesaria en algunos algos.
        double[] dlist = doubleList(unsortedList);
        System.out.println("Lista desordenada: \n");
        printArray(integerlist(dlist));
        int choice = -1;
        while (choice != 0) {
            System.out.println("\n Elige una opcion:");
            System.out.println("1. Método burbuja");
            System.out.println("2. Método Quicksort");
            System.out.println("3. Método SHELL");
            System.out.println("4. Método RADIX");
            System.out.println("5. Mezcla natural");
            System.out.println("6. Mezcla directa");
            System.out.println("7. Método de intercalación");
            System.out.println("8. Búsqueda binaria");
            System.out.println("9. Búsqueda secuencial");
            System.out.println("10. Búsqueda por funciones HASH");
            System.out.println("0. Salir del progama");
            
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            
            
            switch(choice) {
                case 0:
                    System.out.println("Exiting program...");
                    break;
                case 1:
                    metodoBurbuja(unsortedList);
                    break;
                case 2:
                    quicksort(unsortedList, 0, unsortedList.length-1);
                    successMessage();
                    printArray(unsortedList);
                    break;
                case 3:
                    System.out.println("metodo shell \n");
                    metodoShell(dlist);
                    break;
                case 4:
                    System.out.println("Metodo Radix: \n");
                    metodoRadix(unsortedList);
                    break;
                case 5:
                  System.out.println("Metodo de mezcla natural: \n");
                  mezclaNatural(unsortedList);
                  break;
                case 6:
                  System.out.println("Metodo de mezcla directa \n");
                  mezclaDirecta(unsortedList);
                  successMessage();
                  printArray(unsortedList);
                    break;
                case 7:
                    int[] sortedList2 = sortedList(maxNumber,quantityInList-2);
                    System.out.println("Metodo de intercalacion usando dos listas ordenadas. \n");
                    metodoIntercalacion(sortedList, sortedList2);
                    break;
                case 8:
                    System.out.println("Busqueda binaria, ingresar numero a buscar entre: " +
                    0 + " y " + sortedList.length );
                    double doubleSearchTarget=scanner.nextDouble();
                    double[] doubleSorted=doubleList(sortedList);
                    busquedaBinaria(doubleSorted, doubleSearchTarget);
                    break;
                case 9:
                     System.out.println("Busqueda secuencial, ingresar numero a buscar entre: "+
                    0+ " y "+ sortedList.length );
                    searchedValue=scanner.nextInt();
                    busquedaSecuencial(sortedList, searchedValue);
                    break;
                case 10:
                    System.out.println("busqueda por metodo de funciones Hash:");
                    System.out.println("Ingresa Valor a buscar");
                    searchedValue=scanner.nextInt();
                    printArray(unsortedList);
                    AddToHashMap(unsortedList, searchedValue);

                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
        
        scanner.close();
    }
    
   
}
