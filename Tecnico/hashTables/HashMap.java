import singlelinked.LinkedList;
import singlelinked.Node;

public class HashMap {

    /*
     * The hashmap is implemented as an array of linked lists.
     * Each index in the array corresponds to a "bucket" and
     * contains a linked list of key : size.
     * 
     */
    public LinkedList[] hashmap;

    public HashMap(int size) {
        this.hashmap = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            this.hashmap[i] = new LinkedList();
        }
    }

    public int hash(String key) {
        int hashCode = 0;
        for (int i = 0; i < key.length(); i++) {
            hashCode = hashCode + Character.codePointAt(key, i);
        }
        hashCode = hashCode % this.hashmap.length;
        return hashCode;
    }

    /*
    The .assign() method only overwrites values,
     it doesn’t check that keys are matching and
      doesn’t make use of separate chaining.
     */
    public void assign(String key, String value) {
        int arrayIndex = this.hash(key);
        LinkedList list = this.hashmap[arrayIndex];
        if (list.head == null) {
            list.addToHead(key, value);
            return;
        }
        Node current = list.head;
        while (current != null) {
            if (current.key == key) {
                current.setKeyValue(key, value);
            }
            if (current.getNextNode() == null) {
                current.setNextNode(new Node(key, value));
                break;
            }
            current = current.getNextNode();
        }
    }

    public String retrieve(String key) {
        int arrayIndex = this.hash(key);
        Node current = this.hashmap[arrayIndex].head;
        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current=current.getNextNode();
        }
        return null;
    }



    public static void main(String[] args) {
        HashMap birdCensus = new HashMap(100);
        birdCensus.assign("mandarin duck", "Central Park Pond");
      birdCensus.assign("monk parakeet", "Brooklyn College");
      birdCensus.assign("horned owl", "Pelham Bay Park");
        System.out.println(birdCensus.retrieve("mandarin duck"));
        System.out.println(birdCensus.retrieve("monk parakeet"));
        System.out.println(birdCensus.retrieve("horned owl"));

    }
}