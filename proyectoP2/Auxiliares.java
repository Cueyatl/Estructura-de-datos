/*Metodos auxiliares para los algoritmos de ClaseAlgos, y otros metodos
 * utiles como conversion de tipo de datos, imprimir lista, etc.
 */
import java.util.Arrays;
import java.util.Random;

class Auxiliares {
  public static void successMessage(){
    System.out.println("Lista ordenada: \n");
  }

  public static double[] doubleList(int[] array) {
    double[] doubledArray = new double[array.length];
    for (int i = 0; i < array.length; i++) {
        doubledArray[i] = 2 * array[i];
    }
    return doubledArray;
  }
  public static int[] integerlist(double[] array){
    int[] intArray = new int[array.length];
    for (int i = 0; i < intArray.length; i++) {
        intArray[i] = (int) array[i];
    }
    return intArray; // Added return statement
}
  public static void printArray(int[] array) {
    for (int value : array) {
      System.out.print(value + " ");
    }
  }

  public static void printArray(double[] array) {
    for (double value : array) {
      System.out.print(value + " ");
    }
  }

  public static int[] unsortedList(int maximo, int cantidad) {
    int[] array = new int[cantidad];
    for (int i = 0; i < array.length; i++) {
      array[i] = (int) Math.round(Math.random() * maximo);
    }
    return array;
  }


   // Method to generate a sorted list of random integers
  public static int[] sortedList(int maximumNumber, int quantity) {
      Random rand = new Random();
      int[] array = new int[quantity];
      
      for (int i = 0; i < quantity; i++) {
          array[i] = rand.nextInt(maximumNumber + 1);
      }
      
      Arrays.sort(array);
      
      return array;
  }
  // dentro de bubble sort. //dentro de claseAlgos
  public static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
  // dentro de claseAlgos

  public static void swap(double[] array, int i, int j) {
    double temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }

  // dentro de claseAlgos
  public void intercambio(int[] array) {
    for (int i = 0; i < array.length - 1; i++) {
      for (int j = i + 1; j < array.length; j++) {
        if (array[i] > array[j]) {
          swap(array, i, j);
        }
      }
    }
    printArray(array);
  }

  // inside Radix.java
  static int getMax(int arr[]) {
    int mx = arr[0];

    for (int i = 1; i < arr.length; i++)

      if (arr[i] > mx)
        mx = arr[i];
    return mx;
  }

  // inside Radix.java
  // Una función para hacer counting sort de arr[] según
  // el dígito representado por exp.
  static void countSort(int array[], int exp) {
    int[] output = new int[array.length];
    int[] count = new int[10];
    Arrays.fill(count, 0);

    for (int i = 0; i < array.length; i++) {
        count[(array[i] / exp) % 10]++;
    }

    for (int i = 1; i < 10; i++) {
        count[i] += count[i - 1];
    }

    for (int i = array.length - 1; i >= 0; i--) {
        output[count[(array[i] / exp) % 10] - 1] = array[i];
        count[(array[i] / exp) % 10]--;
    }

    for (int i = 0; i < array.length; i++) {
        array[i] = output[i];
    }
    successMessage();
    printArray(array);
}

  

  public static int partition(int[] list, int first, int last) {
    int pivot = list[last];
    int i = first - 1;

    for (int j = first; j < last; j++) {
        if (list[j] < pivot) {
            i++;
            swap(list, i, j);
        }
    }

    swap(list, i + 1, last);
    return i + 1;
  }
}