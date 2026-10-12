# Método de Gauss-Jordan

## Descripción
Este proyecto implementa el **Método de Gauss-Jordan** en Java para resolver un sistema de ecuaciones lineales a partir de una matriz aumentada. 
El programa reutiliza la lógica de la práctica anterior y completa el proceso en dos etapas clave:
1. **Eliminación gaussiana**: Transforma la matriz en su forma triangular superior haciendo ceros debajo de la diagonal principal (reutilizando el módulo previo).
2. **Normalización y barrido superior**: Convierte los elementos de la diagonal principal en la unidad (1) y elimina los coeficientes superiores para transformar la matriz aumentada en una matriz identidad, obteniendo el vector de soluciones de manera directa sin requerir sustitución regresiva[cite: 1].

## Lenguaje de programación
El proyecto está desarrollado en Java.

## Estructura del proyecto
- **`src/Defmatrizz.java`**: Contiene la definición y los valores de la matriz aumentada del sistema de ecuaciones[cite: 4].
- **`src/Gauss.java`**: Contiene el método modular de eliminación gaussiana heredado de la práctica anterior.
- **`src/GaussJordan.java`**: Implementa la normalización de pivotes y el barrido superior para llegar a la matriz identidad.
- **`src/Lanzador_gauss.java`**: Clase principal que inicia el flujo, invoca los métodos correspondientes y muestra la matriz reducida y las soluciones en consola.

## Requisitos
- Java instalado en el equipo (JDK).
- Un entorno de desarrollo compatible con Java, como IntelliJ IDEA, o una terminal con el compilador `javac`.

## Compilación y ejecución

### Opción 1: IntelliJ IDEA
1. Abrir el proyecto en IntelliJ IDEA.
2. Verificar que el proyecto tenga configurado un JDK de Java vigente.
3. Abrir `src/Lanzador_gauss.java`.
4. Ejecutar el método `main` de la clase.
5. Revisar la matriz reducida y las soluciones mostradas en la consola.

### Opción 2: Terminal
Desde la carpeta principal del proyecto, compilar todos los archivos fuente:
```bash
javac src/Defmatrizz.java src/Gauss.java src/GaussJordan.java src/Lanzador_gauss.java
