public class Fibonacci {
  public static void main(String[] args) {
    Fibonacci executeFibonacci=new Fibonacci();
    System.out.println(
      executeFibonacci.fibo(12)
      );
  }
  public int fibo(int n){
    if (n==1||n==2){
      return 1;
    }
    else{
      return fibo(n-1)+fibo(n-2);
    }
// 
  }    
}
