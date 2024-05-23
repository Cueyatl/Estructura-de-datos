
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

import singlelinked.Node;

public class ListaCircular {
  private static int counter=0;

  public Node head;

  public ListaCircular() {
    head = null;
  

  }

  private boolean isEmpty() {
    return head == null;
  }

  public static int countNodes(Node head) {
    if (head == null) {
        return 0; // Empty list
    }

    int count = 1;
    Node current = head;

    // Traverse until we reach the head again
    while (current.next != head) {
        current = current.next;
        count++;
    }

    return count;
}


  private String getDate(String inputFormat) {
    Date currenDate = new Date();
    SimpleDateFormat formatter = new SimpleDateFormat(inputFormat);
    return formatter.format(currenDate);
  }

  private String nodeInfo(
    String nodeName,
    String nodePhone,
    String nodeDate,
    String nodeTime,
    int nodeTicket
  ) {
    String[] infoNode = {
      "Name: "+nodeName,
      "Phone: "+nodePhone,
      "Date: "+nodeDate,
      "Time: "+nodeTime,
      "Ticket no: "+Integer.toString(nodeTicket),
    };
    StringBuilder stringBuilder = new StringBuilder();
    for (String string : infoNode) {
      stringBuilder.append(string + "\n ");
    }
    
    return stringBuilder.toString();
  }

  public String currrentNodeInfo(Node node) {
    return nodeInfo(node.name, node.phone, node.date, node.time, node.ticket);
  }

  // Crud: Create
  public void createNode(String name, String phone) {
    Node newNode = new Node();
    newNode.name = name;
    newNode.phone = phone;
    newNode.date = "date";
    newNode.time = "time";  
    newNode.ticket = counter+=1;
    
    if (isEmpty()) {
      head = newNode;
      newNode.next = head;
    }
    else{
      
      Node current = head;
    while (current.next != head) {
      current = current.next;
    }
    current.next = newNode;
    newNode.next = head;
  }
  
    System.out.println("New Node:"+newNode.ticket);
  }

  // CRUD: read.
  public void readNodes() {
    Node current = this.head;
    StringBuilder stringBuilder = new StringBuilder();
    do {
      stringBuilder.append(this.currrentNodeInfo(current) + "\n");
      current = current.next;
    } while (current != head);
    JOptionPane.showMessageDialog(null, stringBuilder.toString());
  }
  
  // Read only one node.
  public String readOneNode(int ticket){
    Node current = this.head;
    boolean found = false;
    while (!found && current.next != null) {
      current = current.next;
      found = current.ticket == ticket;
    }
    if(!found){
     JOptionPane.showMessageDialog(null, "Ticket not found.");  
     return "Ticket not found.";
    }else{
      JOptionPane.showMessageDialog(null,
       "Information of the Ticket #" + ticket 
       + ": \n\n" 
       + this.currrentNodeInfo(current));
       return  this.currrentNodeInfo(current);
    } 
  }
  // CRUD: Delete.
  public void deleteNode(int ticket){
    boolean found=false;
    Node current = this.head;
    if (current.ticket==this.head.ticket) {
      current.next=this.head;
    }
    while (!found && current.next!=head) {
      if (current.ticket==ticket-1) {
        found=true;
        this.readOneNode(current.ticket);
        Node next=current.next;
        current.next=next.next;
      }
      current=current.next;

    }
    if (!found) {
      System.out.println("Not found :/");
    }
    else{
      System.out.println("founded");
    }
  }
}
