public class TestSite {
  public static void main(String[] args) {
    // key used to calculate the value index: MIA in assic=m=79, i=97, a=103, totals=279 more or less.
    
    int sumAssic= 279;
    //This simple mathematic function used for getting the index for a hash table.
    float index=sumAssic%11;
    System.out.println(index);
  }
}
