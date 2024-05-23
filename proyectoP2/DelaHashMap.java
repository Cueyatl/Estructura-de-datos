//steps to work.
/*
 *DONE create a hashtable using a linked list.
 *DONE      create puy and get methods.
 *DONE create and use the hashMethod
 *DONE      java.security
 *DONE      follow Hash.java throw a string return to int.
 *DONE add elements with a for loop
 *DONE Create and implement a linkedlist with nodes for collisions
 *DONE      use of personal linked list and nodes for bins.
 *DONE implement that shit with the int[] array.
 *DONE Create and iplement hash based search.
 *      show hash code, searched value and position found.
 * profit?
 */
/*Implementando una lista simplemente enlazada crea un mapa Hash con dos metodos
 * una para insertar elementos y otro para buscar que implementa una while loop.
 * Tambien utiliza un algoritmo hash-256 que se encuentra en Hash.java.
 */
import java.util.Arrays;

public class DelaHashMap {
    Hash hash = new Hash();
    /*
     * The hashmap is implemented as an array of linked lists.
     * Each index in the array corresponds to a "bucket" and
     * contains a linked list of key : size.
     * 
     */

    //Creating linked list.
    public LinkedList[] hashmap;

    private final LinkedList[] bucketArray; // Bucket array of linked lists

    public DelaHashMap(int size) {
        this.bucketArray = new LinkedList[size]; // Initialize bucket array
        for (int i = 0; i < size; i++) {
            this.bucketArray[i] = new LinkedList(); // Initialize each bucket with a linked list
        }
    }

    // hash returns String hashkey
    /*
     * The .assign() method only overwrites values,
     * it doesn’t check that keys are matching and
     * doesn’t make use of separate chaining.
     */
    public void assign(String key, String value) {
        byte[] hashedKey = hash.calculateHashCode(key);

        // Calculate the bucket index based on the hash value and the bucket array size
        int arrayIndex = Math.abs(Arrays.hashCode(hashedKey)) % this.bucketArray.length;

        System.out.println("valor en indice: "+ arrayIndex);
        //genereating bucketArray in the indexArray.
        LinkedList list = this.bucketArray[arrayIndex];
        //no head, create head.
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
        if (key == null) {
            //Failed to pass key case.
            throw new IllegalArgumentException("Key cannot be null");
        }

        // Hash the key using SHA-256 from Hash java
        byte[] hashedKey = hash.calculateHashCode(key);

        // Calculate the bucket index based on the hash value and the bucket array size
        int index = Math.abs(Arrays.hashCode(hashedKey)) % this.bucketArray.length;

        // Traverse the linked list at the bucket
        Node current = this.bucketArray[index].head;
        while (current != null) {
            if (current.key.equals(key)) { // Key comparison using equals()
                return current.value;
            }
            current = current.getNextNode();
        }

        // Key not found
        System.out.println("Valor no encontrado");
        return null;
    }



}