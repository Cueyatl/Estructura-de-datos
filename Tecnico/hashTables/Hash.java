import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Map;

public class Hash {

  
 
  public static void main(String[] args) {
    Dictionary<Integer,String> dict= new Hashtable<>();
    Map<Integer,String> map1= new Hashtable<>();
    map1.put(1, "HANA");  
    dict.put(1, "nana");
    dict.put(2, "nanana");
    dict.put(3, "nananana");
    //printing three dict methods concatenated.
    System.out.println(
      
      dict.toString()+" "+
      dict.get(1).length()+" "+
      dict.size()
    );
    
  }
}