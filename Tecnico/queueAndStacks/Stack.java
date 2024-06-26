import singlelinked.LinkedList;

public class Stack {

  public LinkedList stack;
  public int size;
  static final int DEFAULT_MAX_SIZE = Integer.MAX_VALUE;
  public int maxSize;

  public Stack() {
      this(DEFAULT_MAX_SIZE);
  }

  public Stack(int maxSize) {
      this.stack = new LinkedList();
      this.size = 0;
      this.maxSize = maxSize;
  }
  public boolean hasSpace(){
    return this.size<this.maxSize;
  }
  public boolean isEmpty(){
    return this.size==0;
  }
  // Define push() below

  /**
   * Agrega un nuevo String data a la lista enlazada.
   * @param data
   */
  public void push(String data){
    if (this.hasSpace()) {
      this.stack.addToHead(data); 
      this.size++;
      System.out.println("Added " +data+"! Stack size is now "+this.size);
    } else {
      throw new Error("Stack is full!");
    }
   }
  
  public String pop(){
    if (!this.isEmpty()) {
      String data = this.stack.removeHead();
      this.size--;
      System.out.println("Removed " + data + "! Stack size is now " + this.size);
      return data;
    } else {
      throw new Error("Stack is empty!");
    }
  }

  public String peek(){
    if (!this.isEmpty()) {
      return this.stack.head.data;
    } else {
      return null;
    }
  }

  public static void main(String[]args) {
      
      Stack dishes = new Stack();
      dishes.push("blue plate");
      dishes.push("white plate");
      dishes.push("yellow plate");    
      System.out.println("The " + dishes.stack.head.data + " is at the top of the stack.");
      dishes.pop();
      dishes.pop();
      dishes.peek();

   }
} 
