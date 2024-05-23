import java.util.Scanner;
//Ciclos
public class Ciclos {
    public static void main(String[] args) {

        Scanner valor =new Scanner(System.in);
        int respuesta=1;

        int precio=0;
        int subtotal=0;
        int totalArticulos=1;

        while (respuesta==1) {
            System.out.println("Dame el precio del articulo"+totalArticulos);
            precio=valor.nextInt();

            subtotal+=precio;
            totalArticulos++;
            System.out.println("Desea continuar? si:1, no:0");
            respuesta=valor.nextInt();
        }
        System.out.println("El subtotal es:"+subtotal);
        System.out.println("El iva es:"+subtotal*0.16);
        System.out.println("total: "+ subtotal+(subtotal*0.16));
    }
}
