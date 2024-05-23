/**
 * mezclaNatural
 */
public class MezclaNat extends Auxiliares{


  
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
  }

  public void natural(int arreglo[]) {
    int izquierda = 0, izq = 0, derecha = arreglo.length - 1, der = derecha;
    boolean ordenado = false;
    do {
      ordenado = true;
      izquierda = 0;
      while (izquierda < derecha) {
        izq = izquierda;
        while (izq < der && arreglo[izq] <= arreglo[izq + 1]) {
          izq++;
        }
        der = izq + 1;
        while (der == derecha - 1 || der < derecha && arreglo[der] <= arreglo[der + 1]) {
          der++;
        }
        if (der <= derecha) {
          // FIX ME
          mezclaDirecta(arreglo);

          ordenado = false;
        }
        izquierda = izq;
      }
    } while (!ordenado);
  }
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
      for (i = 0; i < nElementosIzq + nElementosDer; i++) {
        arregloDer[i - nElementosIzq] = arreglo[i];

      }
      arregloIzq = mezclaDirecta(arregloIzq);
      arregloDer = mezclaDirecta(arregloDer);
      i=0;
      j=0;
      k=0;
      while (arregloIzq.length!=j && arregloDer.length!=k) {
        if (arregloIzq[j]<arregloDer[k]) {
          arreglo[i]=arregloIzq[j];
          i++;
          j++;
        }else{
          arreglo[i]=arregloDer[k];
          i++;
          k++;
        }  
      }
      while (arregloIzq.length!=j) {
        arreglo[i]=arregloIzq[j];
        i++;
        j++;
      }
      while (arregloDer.length!=k) {
        arreglo[i]=arregloDer[k];
        i++;
        k++;
      }
    }
    return arreglo;
  }
}