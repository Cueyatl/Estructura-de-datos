// Algoritmo de ordenamiento Shell.
public class Shell extends Auxiliares {

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
    printArray(lista);
  }


}
