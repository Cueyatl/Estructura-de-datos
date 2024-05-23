package colas.java;

// Emiliano Lopez Aguilar 2/26/24

import javax.swing.JOptionPane;

public class Cola {

  private Nodo inicioCola;
  private Nodo finalCola;
  String colaOutputString = "";

  public Cola() {
    inicioCola = null;
    finalCola = null;
  }

  public boolean colaVacia() {
    return inicioCola == null;
  }

  // insertar en la cola.
  public void insertar(String name, String email, int costo) {
    Nodo newNode = new Nodo(name, email, costo);

    if (colaVacia()) {
      inicioCola = newNode;
      finalCola = newNode;
    } else {
      finalCola.setNext(newNode);
      finalCola = newNode;
    }
    System.out.println("Inserted node: " + newNode.name + "\n");

  }

  // extraer de la cabeza.
  public String extraer() {
    Nodo removedHead = inicioCola;
    if (colaVacia()) {
      System.out.println("la lista esta vacia.");
      return "La lista esta vacia";
    }
    inicioCola = removedHead.getNext();
    System.out.println("Removed Head: " + removedHead.name);
    return removedHead.name;
  }

  // metodo para mostrar los datos del nodo como una lista en el patron "x,x,".
  private String objectInformation(
      String nameNode,
      String emailNode,
      int costoNode) {
    String[] infoNode = { nameNode, emailNode, Integer.toString(costoNode) };
    StringBuilder stringBuilder = new StringBuilder();
    for (String string : infoNode) {
      stringBuilder.append(string + ", ");
    }
    return stringBuilder.toString();
  }

  // while loop que muestra la info de cada nodo en un solo String separada por
  // "\n".
  public void mostrarContenido() {
    Nodo recorriNodo = inicioCola;
    StringBuilder colaOutput = new StringBuilder();
    while (recorriNodo != null) {
      colaOutput.append(this.objectInformation(recorriNodo.name, recorriNodo.email, recorriNodo.costo) + "\n");
      recorriNodo = recorriNodo.getNext();
    }
    JOptionPane.showMessageDialog(null, colaOutput.toString());
    colaOutputString = "";
  }

  // Metodo auxiliar para contar nodos.
  public int countNodes() {
    int contadorNodos = 0;
    Nodo recorriNodo = inicioCola;
    while (recorriNodo != null) {
      contadorNodos++;
      recorriNodo=recorriNodo.getNext();
    }
    return contadorNodos;
  }
}
