package colas.java;
// Emiliano Lopez Aguilar 2/26/24

import javax.swing.JOptionPane;

public class Principal {

  public static void main(String[] args) {
    // Parametros iniciales del nodo al crearlo.
    int opcion = 0, nodoCosto = 200000;
    String nodoName = "";
    String nodoEmail = "";

    Cola cola = new Cola();
    do {
      try {
        opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
            "MENU PRINCIPAL\n"
                + "1. Insertar en la cola.\n"
                + "2. Retirar de la cola.\n"
                + "3. Mostrar el contenido de la cola.\n"
                + "4. Salir del programa.",
            "Seleccione una opción"));
        switch (opcion) {
          case 1: // Insertar en la cola
            nodoName = JOptionPane.showInputDialog(null, "Ingrese el nombre del nodo:");
            nodoEmail = JOptionPane.showInputDialog(null, "Ingrese el email del nodo:");

            int cantidadNodos = cola.countNodes();
            double descuento = 0;
            // if statement para aplicar descuento a los primeros en la cola.
            if (cantidadNodos < 3) {
              descuento = 0.5;
            } else if (cantidadNodos >= 3 && cantidadNodos < 5) {
              descuento = 0.3;
            }
            // Formula para porcentaje de descuento.
            double nodoCostoDescuento = nodoCosto * (1 - descuento);
            
            // ingreso de datos.
            cola.insertar(nodoName, nodoEmail, (int) nodoCostoDescuento / 100);

            break;
          
          case 2:
            if (!cola.colaVacia()) {
              JOptionPane.showMessageDialog(null,
                  "Se extrajo un nodo con el valor: "
                      + cola.extraer());
            } else {
              JOptionPane.showMessageDialog(null,
                  "La cola esta vacia");
            }
            break;

          case 3:
            cola.mostrarContenido();
            JOptionPane.showMessageDialog(null,
                "Cantidad de nodos:" + cola.countNodes());
            break;

          case 4:
            opcion = 4;
            break;
          default:
            JOptionPane.showMessageDialog(null,
                "Opcion no valida");
            break;

        }
      } catch (NumberFormatException e) {

      }
    } while (opcion != 4);
  }
}
