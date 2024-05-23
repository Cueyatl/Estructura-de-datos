package colas.java;

// Emiliano Lopez Aguilar 2/26/24

public class Nodo {
  public String name;
  public String email;
  // Abajo se declara costo como un parametro de seguridad.
  public int costo = 2000;
  private Nodo next = null;

  public Nodo(String name, String email, int costo) {
    this.name = name;
    this.email = email;
    this.costo = costo;
    this.next = null;
  }

  public void setNext(Nodo node) {
    this.next = node;
  }

  public Nodo getNext() {
    return this.next;
  }
}
