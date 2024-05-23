// Al observar la carente calidad del programa
// puedo concluir que fue hecho en el Celsus.

public class Nodo{
  public Nodo padre;
  public Nodo der;
  public Nodo izq;
  public int llave;
  public Object valor;

  public Nodo(int key){
    llave=key;
    der=null;
    izq=null;
    padre=null;
    valor=null;
  }
}


