
import java.util.Arrays;

public class Matrices {
  //Matrices utilizando listas de listas.(matrices).
  public int[] menorMayor(int[][] matrix){
    int menor = matrix[0][0];
    int mayor = matrix[0][0];
    //for indentado para navegar por la matriz.
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        //Crea un nuevo menor y mayor al cumplir cierta condición.
        if (matrix[i][j] < menor) {
            menor = matrix[i][j]; 
        } else if (matrix[i][j] > mayor) {
            mayor = matrix[i][j];
        }
      }
    }
    return new int[]{menor,mayor};
  }
 //Metodo sumar

  // Metodo NEGATIVO para formula general 
  //-b+-(raiz de b cuadrada -4ac)/2a
  static double formulaNegativo(double a, double b, double c){
      //codigo aqui.
    return 0;
  }
  static double formulaPositivo(double a, double b, double c){
  // Metodo POSITIVO para formula general 
  // Regresa cero de manera temporal.
    return 0;
  }
  
 
 public static void main(String[] args) {
  //Declarando datos y clases.
  int datos; 
  double clases;
  //matriz de 5cols*4rows.
  int[][] matrices={
  {515,542,643,696,700},
  {704,739,782,784,814},
  {832,956,987,1482,1023},
  {1052,1296,1333,1474,1023}};
  //Calculos
  datos=matrices.length*matrices[0].length;
  clases=Math.ceil(Math.sqrt((datos)+1));

  Matrices ejecutaMatrices=new Matrices();
   //extremos ejecuta metodo menorMayor.
    int[] extremos=ejecutaMatrices.menorMayor(matrices);
    int limiteInferior=extremos[0];
    int limiteSuperior=extremos[1];
    // Imprime num clases.
    System.out.println(limiteInferior+" " +limiteSuperior);
   System.out.println("Numero de clases: "+clases);
   //Formula intervaloExacto
   double intervaloExacto=(limiteSuperior-limiteInferior)/clases;
  System.out.println(Math.ceil(intervaloExacto));
 
  for (int i = limiteInferior; i <limiteSuperior; i+=intervaloExacto+1) {
    int j=i;
    System.out.println(i+" "+(j+=intervaloExacto));
  }
}
} 

