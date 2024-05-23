public class Factorial {
	public static int iterativeFactorial(int n) {
		int result = 1;
		while (n > 0) {
			result *= n;
			n -= 1;
		}
		return result;
	}

  public static int recursiveFactorial(int n){
		return n>0? n*recursiveFactorial(n-1):  1;
	}

	public static int recursiveSum(int n){
		return n!=1? recursiveSum(n-1)+n:1;
	}
	

	public static void main(String[] args) {
		// Set int below
		int recursiveSolution = recursiveFactorial(10);
		System.out.println("The recursive solution to 10! is: " + recursiveSolution);

		int iterativeSolution = iterativeFactorial(10);
		System.out.println("The iterative solution to 10! is: " + iterativeSolution);

		int recursiveSumSolve = recursiveSum(10);
		System.out.println("The iterative solution to 10! is: " + recursiveSumSolve);
		
		int[] list={1,2,3,4,5};
	}
}