# Estructura-de-datos
```markdown
# Tipos de datos abstractos

## Dato Abstracto

En las estructuras de datos, un dato abstracto se refiere a un tipo de dato que se define por las operaciones que se pueden realizar sobre él, sin especificar cómo se implementa internamente. Es decir, se define qué se puede hacer con el dato, pero no cómo se hace.

### Ejemplo:

Imaginemos una pila, una estructura de datos que permite almacenar y recuperar elementos en orden LIFO (último en entrar, primero en salir). Un dato abstracto de tipo pila podría definirse como:

- **Operación:** `push(elemento)`: agrega un elemento a la parte superior de la pila.
- **Operación:** `pop()`: elimina y devuelve el elemento de la parte superior de la pila.
- **Operación:** `peek()`: devuelve el elemento de la parte superior de la pila sin eliminarlo.

En este caso, no se especifica cómo se implementa la pila internamente (por ejemplo, como una lista enlazada o un array). Solo se definen las operaciones que se pueden realizar con ella.

## Clasificación de los Tipos de Datos Abstractos (TDA)

### 1. TDA básicos:

- **Números:** Enteros, reales, etc.
- **Caracteres:** Letras, símbolos, etc.
- **Booleanos:** Verdadero o falso.

### 2. TDA compuestos:

- **Colecciones:** Agrupan elementos del mismo tipo, como listas, conjuntos, diccionarios, etc.
- **Estructuras:** Agrupan elementos de diferentes tipos, como registros, árboles, etc.

### Ejemplos de TDA:

- **Pila:** Una estructura LIFO (último en entrar, primero en salir) que permite almacenar y recuperar elementos.
- **Cola:** Una estructura FIFO (primero en entrar, primero en salir) que permite almacenar y recuperar elementos.
- **Lista:** Una colección ordenada de elementos que permite acceso individual a cada elemento.
- **Conjunto:** Una colección sin orden ni elementos duplicados que permite verificar la pertenencia de un elemento.
- **Diccionario:** Una colección que mapea claves a valores, permitiendo un acceso rápido por clave.
- **Grafo:** Una estructura que representa relaciones entre objetos mediante nodos y aristas.

### Características de los TDA:

- **Abstracción:** Definen las operaciones que se pueden realizar sobre los datos, sin especificar su implementación interna.
- **Encapsulamiento:** Ocultan los detalles de implementación, lo que permite enfocarse en la funcionalidad.
- **Reusabilidad:** Se pueden usar en diferentes programas y contextos.

### Beneficios de usar TDA:

- **Flexibilidad:** Permiten cambiar la implementación de un TDA sin modificar el código que lo utiliza.
- **Modularidad:** Facilitan la creación de código modular y reutilizable.
- **Mantenimiento:** Simplifican el mantenimiento del código al separar la lógica de la implementación.

### Resumen de TDA:

En resumen, los TDA son una herramienta fundamental en la programación, ya que permiten definir interfaces claras y flexibles para trabajar con diferentes tipos de datos, lo que facilita la escritura de código eficiente y modular.

## Representación en memoria estática y dinámica

### Representación en memoria estática:

- Se define en tiempo de compilación y no cambia durante la ejecución del programa.
- La cantidad de memoria asignada se fija de antemano y no se puede modificar.
- Es ideal para estructuras de datos de tamaño fijo y conocido, como arrays.

#### Ventajas:
- Más eficiente en términos de acceso a la memoria.
- Menor consumo de memoria en algunos casos.

#### Desventajas:
- Menor flexibilidad para estructuras de datos de tamaño variable.
- Requiere planificación previa del tamaño de las estructuras.

### Representación en memoria dinámica:

- Se define en tiempo de ejecución y puede cambiar durante la ejecución del programa.
- La memoria se asigna y libera según sea necesario.
- Es ideal para estructuras de datos de tamaño variable o desconocido, como listas enlazadas.

#### Ventajas:
- Mayor flexibilidad para estructuras de datos de tamaño variable.
- Permite un uso más eficiente de la memoria.

#### Desventajas:
- Puede ser menos eficiente en términos de acceso a la memoria.
- Puede requerir más memoria en algunos casos.

### Ejemplo:

Un array de tamaño fijo es un ejemplo de representación en memoria estática. La cantidad de memoria asignada al array se define en tiempo de compilación y no cambia durante la ejecución del programa.

En cambio, una lista enlazada es un ejemplo de representación en memoria dinámica. La memoria para cada nodo de la lista se asigna en tiempo de ejecución y se libera cuando el nodo ya no es necesario.

## Recursividad

### Definición:

### Procedimientos recursivos:

### Ejemplos:

## Estructuras lineales:

### Listas

- Listas enlazadas
- Listas doblemente enlazadas
- Listas circulares

### Pilas

- Representación en memoria estática y dinámica
- Notación infija y postfija
- Recursividad con ayuda de pilas

### Colas

- Representación en memoria estática y dinámica
- Tipos de colas: simple, circular y doble
- Aplicaciones: colas de prioridad
```