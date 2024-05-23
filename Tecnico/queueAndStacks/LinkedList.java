import java.Node;

public class LinkedList {

    public Node head;

    public LinkedList() {
        this.head = null;
    }
    // Agregar a la cabeza
    public void addToHead(String data) {
        Node newHead = new Node(data);
        Node currentHead = this.head;
        this.head = newHead;
        if (currentHead != null) {
            this.head.setNextNode(currentHead);
        }
    }
    // Agregar a la cola
    public void addToTail(String data) {
        Node tail = this.head;
        if (tail == null) {
            this.head = new Node(data);
        } else {
            while (tail.getNextNode() != null) {
                tail = tail.getNextNode();
            }
            tail.setNextNode(new Node(data));
        }
    }
    // Quitar de la cabeza
    public String removeHead() {
        // Referencia a la cabeza de la lista
        Node removedHead = this.head;
        // Si no hay elementos en la lista, devuelve null
        if (removedHead == null) {
            return null;
        }
        //Como si hay elementos,cabeza ahora apunta al siguiente de la cabeza
        this.head = removedHead.getNextNode();
        return removedHead.data;
    }
    // Imprimir lista
    public String toString() {
        Node currentNode = this.head;
        String output = "<head> ";
        while (currentNode != null) {
            // La salida se suma con el dato del nodo actual.
            output += currentNode.data + " ";
            currentNode = currentNode.getNextNode();
        }
        output += "<tail>";
        return output;
    }

}