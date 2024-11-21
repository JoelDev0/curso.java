# Metodos
## Metodo Main
El método `main` en Java es el punto de entrada de ejecución en cualquier aplicación. Cuando ejecutas un programa, la máquina virtual de Java (JVM) busca el método `main` y comienza a ejecutar el código que está dentro de él. La estructura del método es siempre la misma:
```java 
public static void main(String[] args) {
// Código a ejecutar }
```
### Desglose de la declaración:

- **`public`**: Esto significa que el método `main` es accesible desde cualquier parte del programa. Esto es necesario para que la JVM pueda ejecutarlo desde fuera de la clase.
- **`static`**: Declara el método como estático, lo que significa que pertenece a la clase en sí, no a una instancia específica de la clase. Esto permite que la JVM lo ejecute sin crear una instancia de la clase.
- **`void`**: Indica que el método no devuelve ningún valor.
- **`main`**: Es el nombre específico que la JVM reconoce como punto de entrada. Si lo cambias, la JVM no lo encontrará y no podrá ejecutar el programa.
- **`String[] args`**: Es un parámetro que recibe un arreglo de `String`. Este arreglo puede contener argumentos que el usuario pase al ejecutar el programa desde la línea de comandos.

---

## Public class
En Java, la declaración `public class` define una clase pública, que es una plantilla o un plano para crear objetos. La clase es la unidad básica de código en Java, y dentro de ella defines las propiedades (atributos) y comportamientos (métodos) que los objetos de esa clase pueden tener. La estructura básica es la siguiente:
```java
public class NombreDeClase {
// Atributos y métodos de la clase }
```
### Desglose de la declaración:

- **`public`**: Es un modificador de acceso que indica que la clase es pública. Esto significa que puede ser accedida desde cualquier otra clase en el mismo proyecto, incluso desde clases en otros paquetes.
- **`class`**: Es la palabra clave en Java que se usa para definir una clase. La clase agrupa atributos y métodos que representan el estado y el comportamiento de los objetos.
- **`NombreDeClase`**: Es el nombre que le das a la clase. En Java, es una convención nombrar las clases usando _PascalCase_, es decir, cada palabra comienza con mayúscula. También, el nombre de la clase debe coincidir exactamente con el nombre del archivo, incluyendo mayúsculas y minúsculas, si el archivo contiene una clase pública. Por ejemplo, si la clase se llama `HolaMundo`, el archivo debe llamarse `HolaMundo.java`.

---

# Datos primitivos
## 1. **Tipos Enteros**
- **`byte`**: Almacena enteros de 8 bits con un rango de -128 a 127.
- **`short`**: Almacena enteros de 16 bits con un rango de -32,768 a 32,767.
- **`int`**: Almacena enteros de 32 bits, rango de -2,147,483,648 a 2,147,483,647. Es el tipo entero más común.
- **`long`**: Almacena enteros de 64 bits, rango muy grande, adecuado para valores enormes. Se usa añadiendo una `L` al final del valor, por ejemplo, `123456789L`.
## 2. **Tipos de Punto Flotante (Decimales)**
- **`float`**: Almacena números de 32 bits en coma flotante de precisión simple. Se usa añadiendo una `F` al final del valor, por ejemplo, `3.14F`.
- **`double`**: Almacena números de 64 bits en coma flotante de precisión doble. Es el tipo predeterminado para valores decimales.
## 3. **Tipo de Carácter**
- **`char`**: Almacena un único carácter Unicode de 16 bits (como `'A'` o `'9'`). Soporta caracteres especiales, como emojis o letras de diferentes alfabetos.
## 4. **Tipo Booleano**
- **`boolean`**: Almacena un valor `true` o `false`. Es común en estructuras de control como condiciones (`if`, `while`, etc.).

## String
- **Clase Inmutable**: Los objetos `String` son inmutables, lo que significa que una vez creados, no se pueden modificar. Cualquier operación que altere el contenido realmente crea un nuevo objeto `String`.
- **Uso Común**: Se usa para almacenar cadenas de texto, como palabras, frases o párrafos completos. Ejemplo:
```java
String saludo = "Hola, Mundo!";
    ```
- **Operador de Concatenación**: Puedes concatenar (`unir`) cadenas fácilmente usando el operador `+`. Ejemplo:
```java
String nombre = "Sebastian"; String mensaje = "Hola, " + nombre + "!";
```
- **Métodos Útiles**: La clase `String` incluye muchos métodos útiles para trabajar con texto, como `length()` (para obtener la longitud), `toUpperCase()` (para convertir a mayúsculas), `substring()` (para obtener partes de la cadena), y muchos más.

---

# Arreglos Unidimensionales
## Declaración
```java
short[] notas;
```

Partes: tipo de dato / corchetes vacíos / identificador
- No basta con declarar un arreglo, hay que crearlo (asignar memoria) para poder utilizarlo.
- Debido a que los arreglos son implementados como objetos, la creación con new es un proceso de dos pasos

```java
int[] notas = new int [10];

// o

int[] notas;
notas = new int [10];
```
Partes: se declara una variable de referencia al arreglo / se asigna memoria para el arreglo con su longitud
![[Pasted image 20241106222009.png|575]]
- Los arreglos pueden ser inicializados al crearse.
- No se necesita el operador new.
- La longitud del arreglo está determinada por el número de valores de inicialización.
```java
int[] notas = { 12, 4, 16, 11, 17, 9, 18, 6 };
```
![[Pasted image 20241106222258.png|575]]

para presentar en pantalla usar toString de arrrays
## Acceso y recorrido
```java
variable[i]
```
[i] el indice, generalmente de tipo int
![[Pasted image 20241106223234.png|550]]
- Para recorrer un arreglo hacemos uso de cualquier estructura repetitiva.
- La estructura repetitiva más utilizada en arreglos es for.
- También es factible usar while o do-while.
```java
int[] notas = { 11, 23, 16, 5, 88, 5, 8, 30, 73, 10 };  
  
for (int indice = 0; indice < 10; indice++) {        
System.out.println(notas[indice]);  
}
```
![[Pasted image 20241106223425.png|358]]
- Usando for
```java
for (int i = 0; i < data.length; i++) {
System.out.print(data[i]);
}
```
*length* indica el tamaño del arreglo

-  Usando foreach
```java
for (char letra : data) {
	System.out.print(letra);
}
```

## Copia de arreglos
- La clase System incluye el método arraycopy para copiar el contenido de un arreglo en otro.
```java
int[] fibonacci = { 1, 1, 2, 3, 5, 8 };
int[] copia = new int[6];

System.arraycopy(fibonacci, 0, copia, 0, fibonacci.length);

for (int valor : copia)    
	System.out.print(valor + " ");

```
## Ordenando un arreglo
1. implementar cualquier algoritmo de ordenamiento (bubble sort, merge sort, shell sort, etc.)
2. utilizar el método Arrays.short de Java (que implementa el algoritmo merge sort)
Ejemplo
```java
StringBuilder sb = new StringBuilder();
int[] contadores =  	{33, 45, 65, 32, 41, 38, 11};
Arrays.sort(contadores);
for (int contador : contadores) {
sb.append(contador).append(" ");
}  
System.out.print(sb); 
```
Salida: 11 32 33 38 41 45 65
```java
StringBuilder sb = new StringBuilder();
char[] frase =  {'Y', 'o', ' ', 'A', 'm', 'o', ' ', 'J', 'a', 'v', 'a'};
Arrays.sort(frase);
for (char letra : frase) {
sb.append(letra);  
}
System.out.print(sb);
```

salida : [2 espacios] AJYaamoov

---
## Comparando un arreglo
Utilizamos  Arrays.equals que devuelve true o false.

```java
char[] letras = { 'c', 'a', 'm', 'p', 'e', 'ó', 'n' };
char[] letras2 = { 'C', 'a', 'm', 'p', 'e', 'o', 'n' };

boolean iguales = Arrays.equals(letras, letras2);

System.out.println(iguales ? "Son iguales" : "Son diferentes");
```

Salida: son diferentes

---
## Arreglos Paralelos 
Técnica que permite agrupar información relacionada en varios arreglos de la misma longitud. Los arreglos paralelos pueden ser de distinto tipo de dato. Se utiliza el mismo índice para acceder a los valores de los arreglos.
![[Pasted image 20241112155730.png|231]]
```java
String[] codigos = { "TG0987", "ML029", "MS8771", "UK1025",
	"DD8543", "AVX2014", "TW005" };
String[] productos = { "Teclado Genius", "Mouse Logitech",
	"Monitor Samsung 22\"", "USB Kingston 128GB",
	"Disco Duro Western", "Audífonos VX500",
	"Tableta Wacom S" };
double[] precios = { 156.50, 45.00, 420.00, 54.50, 284.65,
	210.60, 230.50 };
```
![[Pasted image 20241112155757.png|373]]
Impresión en pantalla de los datos contenidos en los arreglos, tratados como arreglos paralelos
```java 
String[] codigos = { "TG0987", "ML029", "MS8771", "UK1025",
	"DD8543", "AVX2014", "TW005" };
String[] productos = { "Teclado Genius", "Mouse Logitech",
	"Monitor Samsung 22\"", "USB Kingston 128GB",
	"Disco Duro Western", "Audífonos VX500",
	"Tableta Wacom S" };
double[] precios = { 156.50, 45.00, 420.00, 54.50, 284.65, 210.60, 230.50 };

String separador = String.format("%44s", "").replace(" ", "-");

System.out.printf("\n%1$s\nCatálogo de productos\n%1$s\n", separador);

for(int i = 0; i < codigos.length; i++) {
	System.out.printf("%-10s%-24s%9.2f\n",
		codigos[i], productos[i], precios[i]);
}
System.out.println(separador)
```
Salida:
\--------------------------------------------
\Catálogo de productos
\--------------------------------------------
TG0987 Teclado Genius 156.50
ML029 Mouse Logitech 45.00
MS8771 Monitor Samsung 22" 420.00
UK1025 USB Kingston 128GB 54.50
DD8543 Disco Duro Western 284.65
AVX2014 Audífonos VX500 210.60
\TW005 Tableta Wacom S 230.50
\--------------------------------------------

---

# Arreglos bidimensionales
Una matriz se declara indicando
```java
int[][] tabla;
```
tipo de dato / dos pares de corchetes vacíos que representa las 2 dimensiones / identificador

## Creación con “new”
```java
int[][] notas = new int[3][4];
```
![[Pasted image 20241112162042.png|227]]
> [!important] Para no olvidar
> ![[Pasted image 20241112162113.png|450]]
> ![[Pasted image 20241112162121.png|275]]

## Creación con inicializador
La longitud de la matriz está determinada por el número de valores indicados como filas y columnas. Proporcione los valores de inicialización de cada fila separados por coma y entre llaves. Y todos los conjuntos anteriores, separados por coma, dentro de un par de llaves general

```java
int[][] matriz = { {1, 2, 3},
				{4, 5, 6},
				{7, 8, 9} };
```
![[Pasted image 20241112162237.png|175]]
## Acceso, asignación y recorrido en arreglos dimensionales
![[Pasted image 20241112162504.png|525]]
![[Pasted image 20241112162526.png|525]]
### Flujo de iteración clásico
```java
int[][] matriz = { { 18, 6, 29 },
				{ 64, 11, 7 },
				{ 30, 81, 37 },};
for (int f = 0; f < matriz.length; f++) {
	for (int c = 0; c < matriz[0].length; c++) {
		System.out.printf("%2d ", matriz[f][c]);
	}
	System.out.println();
}
```

Salida : 
18 6 29
64 11 7
30 81 37
![[Pasted image 20241112162800.png|325]]
### Flujo de iteración inverso
```java
int[][] matriz = { { 18, 6, 29 },
			{ 64, 11, 7 },
			{ 30, 81, 37 },};
for (int c = 0; c < matriz[0].length; c++) {
	for (int f = 0; f < matriz.length; f++){
		System.out.printf("%2d ", matriz[f][c]);
	}
	System.out.println();
}
```
Salida:
18 64 30
6 11 81
29 7 37
![[Pasted image 20241112162833.png|325]]

# Términos importantes
## Palabras reservadas 
 Una **palabra reservada** es una *palabra predefinida* que tiene un *significado especial* para el compilador.
- Forman parte de la sintaxis del lenguaje de programación.
- *No pueden ser utilizadas como identificadores* en los programas.
![[Pasted image 20241112164608.png|550]]
## Constantes (*final* ..)
- Las constantes son *almacenadas* en espacios reservados de la *memoria* cuyo contenido no puede modificarse.
- Por eso decimos que una constante es una *variable inmutable*.
- Por convención, se les nombra en mayúsculas.
- Una constante nombrada se declara como una variable y se agrega la palabra *final* al inicio de la declaración.
```java
final double VELOCIDAD_DE_LUZ=29493945.0;
retardopropagacion = distancia/VELOCIAD_DE:LUZ;
```
## Comentarios
 - **Los comentarios son palabras que las personas leen, pero que el compilador ignora.**
- Los comentarios ayudan a que el código sea **legible** y comprendido por quien lo lee.
- También ayudan en la **documentación** del código.
- Existen tres tipos de comentarios en Java:

``` java
 // → De una sola línea
    
- /* */ → De múltiples líneas.
    
- /** */ → De documentación (usado por herramienta _javadoc_).
```
## Sobreescritura (override)(toString)
- **Object** es la *clase base* de Java.
- Todas las clases de Java *derivan*, directa o indirectamente, de **Object**.
- Hay *métodos* de la clase **Object** que podemos reutilizar en nuestras clases.
- Si deseamos, podemos cambiar el comportamiento de éstos métodos.
- Este cambio de comportamiento se logra a través de la *sobreescritura (override)*.
### Que se puede sobrescribir
- Existen diversos métodos de Object que podemos sobre escribir, tales como equals(), toString(), hashCode(), etc.
- El método que usualmente sobrescribimos es toString().
- toString() retorna la representación de cadena de un objeto.

Ejemplo: Por defecto, toString() devuelve una expresión de cadena con el nombre de la clase, el símbolo @ y el valor hexadecimal del código hash del objeto.
```java
public class PruebaAlumno {    
	public static void main(String[] args) {        
		Alumno alumno1 = new Alumno(“alex.png", “Alex", 19);        
		System.out.println(alumno1.toString());    
	}  
}
```
Salida: Alumno@4dd8dc3
- Para sobrescribir un método debemos mantener su tipo de retorno y su firma.
```java
public class Alumno {    
	private String foto;    
	private String nombre;    
	private int edad;    
	private int pc1, pc2, pc3, ef;    
	
	// getters, setters, métodos    
	
	@Override    
	public String toString() {        
		return nombre + " - " + edad;  
    }  
}

public class PruebaAlumno {    
	public static void main(String[] args) {        
		Alumno alumno1 = new Alumno(“alex.png", “Alex", 19);        
		System.out.println(alumno1.toString());    
	}  
}
```
*La sobreescritura oculta la implementación original de un método, la cual es reemplazada por una nueva definición.*
Salida: Alex - 19
## Expresiones Regulares
una expresión regular como una secuencia de caracteres que forman una secuencia o patrón que puede ser automatizada de alguna manera.
Por ejemplo, dentro de un texto queremos eliminar todas las palabras que sean «la» podemos usar un patrón para eliminarlas. Una expresión regular nos va a permitir buscar o reemplazar una secuencia.
Para crear una expresión regular haremos uso de los cuantificadores y metacaracteres.

### Cuantificadores para una expresión regular

Tenemos caracteres especiales que nos van a indicar el número de repeticiones de la expresión, la siguiente tabla muestra los caracteres:

|Cuantificador|Descripción|
|---|---|
|n+|Encuentra cualquier string con al menos un «n»|
|n*|Encuentra cero o más ocurrencias de n|
|n?|Encuentra en el string la aparición de n cero o una vez|
|n{x}|Encuentra la secuencia de n tantas veces como indica x.|
|n{x,}|Encuentra una secuencia de X tantas veces como indica n|

Cuantificadores en una expresión regular

### Metacaracteres en una expresión regular

| Metacaracter | Descripción                                                               |
| ------------ | ------------------------------------------------------------------------- |
| \|           | Símbolo para indicar OR.                                                  |
| .            | Encuentra cualquier carácter                                              |
| ^            | Sirve para hacer match al principio del string                            |
| $            | Hace match al final de un String                                          |
| \d           | Encuentra dígitos                                                         |
| \s           | Busca un espacio                                                          |
| \b           | Hace match al principio de una palabra.                                   |
| \uxxxx       | Encuentra el carácter Unicode especificado por el número hexadecimal xxxx |
|              |                                                                           |

Metacaracteres en una expresión regular
### Metacaracteres y ejemplos con expresiones regulares

|Expresión regular|Descripción|
|---|---|
|`.`|Hace match con cualquier caracter|
|`^regex`|Encuentra cualquier expresión que coincida al principio de la línea.|
|`regex$`|Encuentra la expresión que haga match al final de la línea.|
|`[abc]`|Establece la definición de la expresión, por ejemplo la expresión escrita haría match con a, b o c.|
|`[abc][vz]`|Establece una definición en la que se hace match con a, b o c y a continuación va seguido por v o por z.|
|`[^abc]`|Cuando el símbolo ^ aparece al principio de una expresión después de [, negaría el patrón definido. Por ejemplo, el patrón anterior negaría el patrón, es decir, hace match para todo menos para la a, la b o la c.|
|`[e-f]`|Cuando hacemos uso de -, definimos rangos. Por ejemplo, en la expresión anterior buscamos hacer match de una letra entre la e y la f.|
|`Y\|X`|Establece un OR, encuentra la Y o la X.|
|HO|Encuentra HO|
|`$`|Verifica si el final de una línea sigue.|
CLASES DE CARACTERES 
\[abc] Coincide con a, b, o c. 
[^abc] Negación, coincide con todo excepto a, b, o c. 
\[a-c] Rango, coincide con a, b, o c. 
\[a-c\[f-h]] Unión, coincide con a, b, c, f, g, h. 
\[a-c&&\[b-c]] Intersección, coincide con b o c. 
\[a-c&&[^b-c]] Sustracción, coincide con a.

CLASES DE CARACTERES PREDEFINIDAS
. Cualquier carácter. 
\d Un dígito: \[0-9] 
\D Un no-dígito: [^0-9] 
\s Un carácter de espacio en blanco: \[ \t\n\x0B\f\r] 
\S Un carácter que no es espacio en blanco: [^\s] 
\w Un carácter de palabra: \[a-zA-Z_0-9] 
\W Un carácter que no es de palabra: [^\w]

COINCIDENCIAS DE LÍMITES
^ El inicio de una línea. 
$ El final de una línea. 
\b Un límite de palabra. 
\B Un límite que no es de palabra. 
\A El inicio de la entrada. 
\G El final de la coincidencia anterior. 
\Z El final de la entrada excepto el terminador final, si existe. 
\z El final de la entrada.

GRUPOS Y REFERENCIAS HACIA ATRÁS 
Un grupo es una subsecuencia capturada de caracteres que puede ser usada después en la expresión con una referencia hacia atrás.
(...) Define un grupo. 
\N Se refiere a un grupo coincidente. 
(\d\d) Un grupo de dos dígitos. 
(\d\d)/\1 Dos dígitos repetidos dos veces. 
\1 Se refiere al grupo coincidente.

OPERACIONES LÓGICAS 
XY X seguido de Y. 
X|Y X o Y.

## Caracter de escape
En Java, un **carácter de escape** es un carácter especial que se usa con una barra invertida (`\`) para representar caracteres que no pueden escribirse directamente en una cadena de texto. Estos caracteres permiten agregar saltos de línea, tabulaciones, comillas, etc., en una cadena.

### Principales caracteres de escape:

|Carácter de escape|Descripción|
|---|---|
|`\n`|Salto de línea|
|`\t`|Tabulación|
|`\\`|Barra invertida (`\`)|
|`\"`|Comilla doble (`"`)|
|`\'`|Comilla simple (`'`)|
|`\r`|Retorno de carro (usado en algunos sistemas antiguos)|
|`\b`|Retroceso (backspace)|
|`\f`|Avance de página|
ejemplo
```java
public class Main {
    public static void main(String[] args) {
        // Usando caracteres de escape
        String texto = "Esto es una línea.\nY esta es otra línea.";
        System.out.println(texto);
        // Salida:
        // Esto es una línea.
        // Y esta es otra línea.

        String tabulacion = "Columna1\tColumna2\tColumna3";
        System.out.println(tabulacion);
        // Salida:
        // Columna1    Columna2    Columna3

        String comillas = "Ella dijo: \"Hola Mundo\"";
        System.out.println(comillas);
        // Salida:
        // Ella dijo: "Hola Mundo"
    }
}

```

 ## Operadora Matemáticos
### **Operadores básicos:**

|Operador|Descripción|Ejemplo|Resultado|
|---|---|---|---|
|`+`|Suma|`5 + 3`|`8`|
|`-`|Resta|`10 - 4`|`6`|
|`*`|Multiplicación|`6 * 7`|`42`|
|`/`|División|`20 / 4`|`5`|
|`%`|Módulo (residuo de la división)|`10 % 3`|`1`|

---

### **Operadores de asignación compuesta:**

Estos operadores combinan una operación matemática con la asignación.

|Operador|Descripción|Ejemplo|Equivalente|
|---|---|---|---|
|`+=`|Suma y asignación|`x += 5;`|`x = x + 5;`|
|`-=`|Resta y asignación|`x -= 3;`|`x = x - 3;`|
|`*=`|Multiplicación y asignación|`x *= 2;`|`x = x * 2;`|
|`/=`|División y asignación|`x /= 4;`|`x = x / 4;`|
|`%=`|Módulo y asignación|`x %= 2;`|`x = x % 2;`|

---

### **Operadores de incremento y decremento:**

|Operador|Descripción|Ejemplo|Resultado|
|---|---|---|---|
|`++`|Incremento en 1 (pre o post)|`++x` o `x++`|`x + 1`|
|`--`|Decremento en 1 (pre o post)|`--x` o `x--`|`x - 1`|
```java
public class Main {
    public static void main(String[] args) {
        int a = 10, b = 3;

        System.out.println("Suma: " + (a + b));       // Suma: 13
        System.out.println("Resta: " + (a - b));     // Resta: 7
        System.out.println("Multiplicación: " + (a * b)); // Multiplicación: 30
        System.out.println("División: " + (a / b));  // División: 3 (entera)
        System.out.println("Módulo: " + (a % b));    // Módulo: 1
    }
}

public class Main {
    public static void main(String[] args) {
        int x = 5;

        x += 2; // x = x + 2
        System.out.println("Suma compuesta: " + x); // 7

        x *= 3; // x = x * 3
        System.out.println("Multiplicación compuesta: " + x); // 21

        x %= 4; // x = x % 4
        System.out.println("Módulo compuesto: " + x); // 1
    }
}
```
escala de prioridad en operaciones matematicas
- parentesis
- potencia
- multiplicación
- division
- suma
- resta