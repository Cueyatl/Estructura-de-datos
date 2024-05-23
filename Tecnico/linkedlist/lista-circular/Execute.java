
public class Execute {
  public static void main(String[] args) {
    
    ListaCircular lst=new ListaCircular();
    lst.createNode("aba", "1234");
    lst.createNode("aba", "1234");
    lst.createNode("aba", "1234");
    lst.deleteNode(3);
    lst.readNodes();   
  }
}
