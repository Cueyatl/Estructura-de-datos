import java.util.Scanner;
public class Nomina{

  public static void main(String[] args) {
    // Crear scanner.
    Scanner c=new Scanner(System.in);
    //Declaracion de variables.
    int horas, pago;
    double descuento, bono, total;
    
    System.out.println("Ingrese horas trabajadas: ");
    horas=c.nextInt();
    //Operaciones
    pago=horas*160;
    descuento=pago*0.90;
    bono=pago*0.03;
    total=descuento+bono;
    System.out.println("El pago correspondiente es de $"+total);
  }
}