
public class DoublyLinkedList {
  public static void main(String[] args) {
  DoublyLinkedList camion = new DoublyLinkedList();

  camion.addToHead("galerias");
  camion.addToHead("universidad de celaya");
  camion.addToHead("Aurrera");
  camion.addToTail("boulevard Coppel");
  camion.addToTail("12 de Octubre");
  camion.addToTail("Tresguerras");
  camion.removeHead();
  camion.removeTail();
  camion.removeByData("Aurrera");
  camion.printList();
  }

  public Node head;
  public Node tail; 

  public DoublyLinkedList() {
    this.head = null;
    this.tail = null;
  }

  
  //Agregar a la cabeza
  public void addToHead(String data) {
    Node newHead = new Node(data);
    Node currentHead = this.head;

    if (currentHead != null) {
      currentHead.setPreviousNode(newHead);
      newHead.setNextNode(currentHead);
    }
    this.head = newHead;

    if (this.tail == null) {
      this.tail = newHead;
    }
  }
  // Agregar a la cola
  public void addToTail(String data) {
    Node newTail = new Node(data);
    Node currentTail = this.tail;

    if (currentTail != null) {
      currentTail.setNextNode(newTail);
      newTail.setPreviousNode(currentTail);
    }
    this.tail = newTail;

    if (this.head == null) {
      this.head = newTail;
    }
  }
  // Quitar de la cabeza
  public String removeHead() {
    Node removedHead = this.head;

    if (removedHead == null) {
      return null;
    }
    this.head = removedHead.getNextNode();

    if (this.head != null) {
      this.head.setPreviousNode(null);
    }
    if (removedHead == this.tail) {
      this.removeTail();
    }
    return removedHead.data;
  }
  // Quitar de la cola
  public String removeTail() {
    Node removedTail = this.tail;

    if (removedTail == null) {
      return null;
    }
    this.tail = removedTail.getPreviousNode();

    if (this.tail != null) {
      this.tail.setNextNode(null);
    }
    if (removedTail == this.head) {
      this.removeHead();
    }
    return removedTail.data;
  }
  // Remover por los datos.
  public Node removeByData(String data) {
    Node nodeToRemove = null;
    Node currentNode = this.head;

    while (currentNode != null) {
      if (currentNode.data.equals(data)) {
        nodeToRemove = currentNode;
        break;
      }
      currentNode = currentNode.getNextNode();
    }

    if (nodeToRemove == null) {
      return null;
    }
    if (nodeToRemove == this.head) {
      this.removeHead();
    } else if (nodeToRemove == this.tail) {
      this.removeTail();
    } else {
      Node nextNode = nodeToRemove.getNextNode();
      Node previousNode = nodeToRemove.getPreviousNode();
      nextNode.setPreviousNode(previousNode);
      previousNode.setNextNode(nextNode);
    }
    return nodeToRemove;
  }
  // Imprimir linked array
  public String printList() {
    Node currentNode = this.head;
    String output = "<cabeza> ";
    while (currentNode != null) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("\n ");
      stringBuilder.append(currentNode.data);
      
      output += stringBuilder.toString();
      currentNode = currentNode.getNextNode();
    }
    output += "<cola>";
    System.out.println(output);
    return output;
  }

}
