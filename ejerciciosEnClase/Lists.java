import java.util.*;
//Actualizar lista.
public class Lists {
  
  public static void  imprimirLista(List<String> lista){
    System.out.println("\nLista de carros: \n");
    for (int i = 0; i < lista.size(); i++) {
      System.out.println(lista.get(i));
    }
    System.out.println("\n");
  }

  public static void main(String[] args) {

    Scanner exScanner=new Scanner(System.in);
    String[] carros = {"Volvo", "BMW", "Ford", "Mazda"};
    ArrayList<String> nuevaLista=new ArrayList<>(Arrays.asList(carros));
    // Imprime lista.
    imprimirLista(nuevaLista);
    
    //Ingresa palabra a modificar.
    System.out.println("Ingrese la palabra a modificar: ");
    String modificable=exScanner.nextLine();

    //Ingresa nueva palabra.
    System.out.println("Ingrese el nuevo valor: ");
    String nuevoModificado=exScanner.nextLine();

    //Busca el indice de la palabra y sustituye por nueva palabra.
       //Toma el indice del elemento buscado.
    int index=nuevaLista.indexOf(modificable);
        //Sustituye el elemento, dos parametros: indice, elemento.
    nuevaLista.set(index,nuevoModificado);
    //Imprime lista
    imprimirLista(nuevaLista);

  }  
}

