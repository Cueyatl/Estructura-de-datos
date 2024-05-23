#include <iostream>
using namespace std;
// Definición de la estructura Nodo para la lista simple
struct Nodo {
    int dato;
    Nodo* siguiente;
};

struct DatosNodo{
            int  dato;
            int posicion;
        };
// Clase para la lista simple
class ListaSimple {
private:
    Nodo* cabeza=NULL;
public:
    ListaSimple() : cabeza(nullptr) {}
    // Método para agregar un elemento al inicio de la lista
    void agregarAlInicio(int valor) {
        Nodo* nuevoNodo = new Nodo();
        nuevoNodo->dato = valor;
        nuevoNodo->siguiente = cabeza;
        cabeza = nuevoNodo;
    }
    void agregarAlFinal(int valor){
      Nodo*  nuevoNodo=new Nodo();
      if (this->cabeza==NULL)
      {
        this->agregarAlInicio(valor);
        return;
      }
      
    }

    DatosNodo buscarNodo(int valor){
        Nodo* nodoActual=cabeza;
        bool encontrado=false;
        int posicion=1;
        int valorEncontrado;
        if (nodoActual->dato==cabeza->dato)
        {
            nodoActual->dato=cabeza->dato;
            encontrado=true;
        }
        while (!encontrado && nodoActual!=NULL)
        {
            encontrado= (nodoActual->dato == valor);
            posicion++;   
            nodoActual=nodoActual->siguiente;   
        }
        encontrado ? valorEncontrado=nodoActual->dato:valorEncontrado=-1;
        DatosNodo nodoEncontrado={valorEncontrado, posicion};
        cout<<"Valor "<<valorEncontrado<<" en posicion "<<posicion<<endl;
        return nodoEncontrado;
    }
    // Método para imprimir la lista
    void imprimir() {
        Nodo* temp = cabeza;
        while (temp != nullptr) {
            cout<<temp->dato<<" ";
            temp = temp->siguiente;
        }
        cout<<endl;
        }
    
};
int main() {
    ListaSimple lista;
    lista.agregarAlInicio(3);
    lista.agregarAlInicio(5);
    lista.agregarAlInicio(7);
    lista.buscarNodo(7);
    lista.imprimir();
 
    return 0;
}

