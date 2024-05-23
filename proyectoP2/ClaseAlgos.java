
// Pagina 194 libro Estructura de datos en java Joyanes.
public class ClaseAlgos extends Auxiliares {

  //Convert int to string.
  private static String stringify(int integer){
    return Integer.toString(integer);
  }
  //Using DelaHashMap. for each value in unsorted list add to hashMap.
  public static void AddToHashMap(int[] array, int searchedValue) {
    DelaHashMap hashyElMapa = new DelaHashMap(array.length);
    for (int i = 0; i < array.length; i++) {
      hashyElMapa.assign(
        stringify(i),
       stringify(array[i]));
    }
    hashyElMapa.retrieve(stringify(searchedValue));
    
  }

  static void metodoRadix(int arr[]) {
    // Encuentra el número máximo para conocer la cantidad de dígitos

    int m = getMax(arr);
    // Hace counting sort para cada dígito. Si en lugar de pasar el número de
    // dígito, se pasa exp.
    // exp es 10^i donde i es el número de dígito actual
    for (int exp = 1; m / exp > 0; exp *= 10) {
      countSort(arr, exp);
    }

  }
  //secuencial, quiere decir one by one.
  public static int busquedaSecuencial(int[] arr, int elemento) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == elemento) {
        System.out.println("Encontrado con exito: " + arr[i] + " en la posicion: " + i);
        return i;
      }
    }
    System.out.println("no encontrado");
    return -1; // Elemento no encontrado
  }
  //divide the array by two, and getting closer to the searchedValue.
  public static void busquedaBinaria(double[] array, double elementSearched) {
    int low = 0;
    int high = array.length - 1;
    while (low <= high) {
      int mid = low + (high - low) / 2;
      if (array[mid] == elementSearched) {
        System.out.println("encontrado en el indice: " + mid);
        System.out.println("valor" + array[mid]);
        return;
      } else if (array[mid] < elementSearched) {
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }
    successMessage();
    System.out.println("elemento no encontrado");
  }

  public static int[] metodoIntercalacion(int[] arr1, int[] arr2) {
    int[] resultado = new int[arr1.length + arr2.length];
    int i = 0, j = 0, k = 0;

    while (i < arr1.length && j < arr2.length) {
      if (arr1[i] <= arr2[j]) {
        resultado[k] = arr1[i];
        i++;
      } else {
        resultado[k] = arr2[j];
        j++;
      }
      k++;
    }

    while (i < arr1.length) {
      resultado[k] = arr1[i];
      i++;
      k++;
    }

    while (j < arr2.length) {
      resultado[k] = arr2[j];
      j++;
      k++;
    }
    successMessage();
    printArray(resultado);
    return resultado;
  }
  //divides the array in smaller portions and gets them mixed until arranged in order.
  public static void mezclaNatural(int arreglo[]) {
    int izquierda = 0, derecha = arreglo.length - 1;
    boolean ordenado;
    do {
      ordenado = true;
      for (int i = izquierda; i < derecha; i++) {
        if (arreglo[i] > arreglo[i + 1]) {
          swap(arreglo, i, i + 1);
          ordenado = false;
        }
      }
      derecha--;
    } while (!ordenado);
    successMessage();
    printArray(arreglo);
  }
//pretty much the same that above, but i really dont understand them very well.
  public static int[] mezclaDirecta(int[] arreglo) {
    int i, j, k;
    if (arreglo.length > 1) {
      int nElementosIzq = arreglo.length / 2;
      int nElementosDer = arreglo.length - nElementosIzq;
      int arregloIzq[] = new int[nElementosIzq];
      int arregloDer[] = new int[nElementosDer];
      for (i = 0; i < nElementosIzq; i++) {
        arregloIzq[i] = arreglo[i];

      }
      // elementos izq: 01234, der: 56789
      for (i = 0; i < nElementosDer; i++) {
        arregloDer[i] = arreglo[i + nElementosIzq];
      }
      // for (i = 0; i < nElementosIzq + nElementosDer; i++) {
      // arregloDer[i + nElementosIzq] = arreglo[i];

      // }
      arregloIzq = mezclaDirecta(arregloIzq);
      arregloDer = mezclaDirecta(arregloDer);
      i = 0;
      j = 0;
      k = 0;
      while (arregloIzq.length != j && arregloDer.length != k) {
        if (arregloIzq[j] < arregloDer[k]) {
          arreglo[i] = arregloIzq[j];
          i++;
          j++;
        } else {
          arreglo[i] = arregloDer[k];
          i++;
          k++;
        }
      }
      while (arregloIzq.length != j) {
        arreglo[i] = arregloIzq[j];
        i++;
        j++;
      }
      while (arregloDer.length != k) {
        arreglo[i] = arregloDer[k];
        i++;
        k++;
      }
    }
    return arreglo;
  }
  /*It iterates through the data with decreasing gaps 
  (similar to the spacing between slices in the Shell method for volume calculation) 
  and swaps elements that are out of order based on those gaps
  */
  public static void metodoShell(double[] lista) {
    int interv, i, j, k;
    int n = lista.length;
    interv = n / 2;
    while (interv > 0) {
      for (i = interv; i < n; i++) {
        j = i - interv;
        while (j >= 0) {
          k = j + interv;
          if (lista[j] <= lista[k])
            j = -1; // par de elementos ordenado
          else {
            swap(lista, j, j + 1);
            j -= interv;
          }
        }
      }
      interv = interv / 2;
    }
    successMessage();
    printArray(integerlist(lista));

  }
  //for loop inside a for loop, swaps if bigger or smaller than.
  public static void metodoBurbuja(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          swap(arr, j, j + 1);
        }
      }
    }
    successMessage();
    printArray(arr);
  }

  public void insercion(int[] array) {
    int aux, j;
    // for each loop does a comp
    for (int i = 0; i < array.length; i++) {
      // j works as an aux, in fact it copies the element to the next slot.
      j = i;
      // We save the element in aux for comparison.
      aux = array[i];

      while (j > 0 && aux < array[j - 1]) {
        array[j] = array[j - 1];
        j--;
      }
      array[j] = aux;
    }
    printArray(array);
  }

  public void seleccion(int[] array) {
    int indiceMenor, n;
    n = array.length;
    for (int i = 0; i < n - 1; i++) {
      indiceMenor = i;
      for (int j = i + 1; j < n; j++) {
        if (array[j] < array[indiceMenor]) {
          indiceMenor = j;
        }
        if (i != indiceMenor) {
          swap(array, indiceMenor, j);
        }
      }
    }
    printArray(array);
  }
  //divides the array in two set, with a pivot point, places smaller numbers on the left, and bigger nums on the right.
  public static void quicksort(int[] list, int first, int last) {
    if (first < last) {
      int partitionIndex = partition(list, first, last);
      quicksort(list, first, partitionIndex - 1);
      quicksort(list, partitionIndex + 1, last);
    }

  }

}
