public class BST {
  // Binary search tree.
  // Celsus
  Nodo raiz;

  public BST() {
    raiz = null;
  }

  public void recorridoEnOrden(Nodo  n) {
    if (n != null) {
      recorridoEnOrden(n.izq);
      System.out.println(n.llave);
      recorridoEnOrden(n.der);
    }
  }

  public void insertar(int key, Object valor) {
    Nodo nodo = new Nodo(key);
    nodo.valor = valor;
    if (raiz == null) {
      raiz = nodo;
    } else {
      Nodo temp = raiz;
      while (temp != null) {
        nodo.padre = temp;
        if (nodo.llave >= temp.llave) {
          temp = temp.der;
        } else {
          temp = temp.izq;
        }
      }
      if (nodo.llave < nodo.padre.llave) {
        nodo.padre.izq = nodo;
      } else {
        nodo.padre.der = nodo;
      }
    }
  }

  public static void main(String[] args) {
    BST arbol = new BST();
    arbol.insertar(5, "cinco");
    arbol.insertar(2, "dos");
    arbol.insertar(4, "cuatro");
    arbol.recorridoEnOrden(arbol.raiz);
  }
}
