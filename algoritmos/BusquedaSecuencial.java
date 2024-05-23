public class BusquedaSecuencial {

  public static int busquedaSecuencial(int[] arr, int elemento) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == elemento) {
        System.out.println(i);
        return i;
      }
    }

    return -1; // Elemento no encontrado
  }
}
