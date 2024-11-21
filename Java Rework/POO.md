# <mark style="background: #ABF7F7A6;">POO</mark>
## Clases 
- Una clase se define utilizando la palabra reservada **class**. 
- Una clase, en su forma general, no especifica el método **main**. 
- La definición de una clase crea un nuevo tipo de dato.
![[Pasted image 20241112183912.png|575]]
## Objetos 
![[Captura de pantalla 2024-11-16 a la(s) 8.47.46 p. m..png|400]]
A partir de una clase se pueden instanciar varios objetos. Cada instancia es distinta de otras, incluso si ambas tienen los mismo valores.
## Atributos
- Son propiedades o características de los objetos.
- Los objetos son descritos a partir de sus atributos.
- Los atributos tienen valores asociados.
![[Pasted image 20241112184004.png|550]]
- Un atributo es una variable creada dentro de una clase.
- Un atributo se denomina también variable de instancia.
- Los atributos de una clase pueden estar afectados por los modificadores de acceso o visibilidad: <font color="#00b050">public</font>, <font color="#ff0000">private</font> y <font color="#de7802">protected</font>.
 ![[Pasted image 20241112184040.png|243]]
![[Pasted image 20241112184059.png|625]] 
## Metodos
- Un método implementa lo que la clase es capaz de hacer.
- Es una subrutina que manipula datos definidos en la clase.
- Medio para interactuar con la clase.
- Cada método realiza una tarea y puede devolver un valor.
![[Pasted image 20241112184241.png|215]]
```java
tipo-retorno nombreMetodo( lista-parámetros ) {  
    // cuerpo del método
}

modo-acceso tipo-retorno nombre(lista-parámetros) {
   // cuerpo del método
}

```
- modo-acceso = Modificador de acceso: public, private, protected
- tipo-retorno = Tipo de dato retornado por el método o void si no retorna resultado
- nombre =  Nombre del método
- lista-parámetros = Secuencia de variables que reciben valor cuando el método es invocado (opcional)
```java
//Atributos
public class Rectangulo {
	double base;
	double altura;

//constructor
public Rectangulo(double base, double altura) {
	this.base = base;        
	this.altura = altura;  
}
//Metodo
public void calcularArea() {        
	System.out.println(base * altura);  
    }  
}

//--------
public class Test {    
	public static void main(String[] args) {
		Rectangulo rectangulo = new Rectangulo(12.5, 13.56);        
		rectangulo.calcularArea();  
    }  
}
```
### Tipo de metodos
#### Procedimiento
```java
void nombre(lista-parámetros) {
   // cuerpo del
   // procedimiento
}
```
- Método que <font color="#00b0f0">NO retorna</font> ningún valor
- Su tipo de retorno es <font color="#de7802">void</font>
- No es necesario el uso de <font color="#92d050">return</font>

> [!note] Nota
> aún en procedimientos se puede usar <font color="#92d050">return</font> para causar su terminación inmediata.
```java
//Atributos
public class OperadorArreglos {    
	private int[] datos;    

//Constructor
public OperadorArreglos(int[] datos) {        
	this.datos = new int[datos.length];        
	System.arraycopy(datos, 0, this.datos, 0,
		datos.length);  
    }    

//Metodo-procedimiento
public void calcularPromedio() {        
	double suma = 0;        
	for (int dato : datos) {            
		suma += dato;  
		}        
		
	System.out.printf("Promedio: %.2f\n",
		suma / datos.length);  
    }  
}
//Operacion
public class Test {    
	public static void main(String[] args) {        
	OperadorArreglos operadorArreglos =
		new OperadorArreglos(
			new int[] {12, 24, 64, 11, 82, 30, 4});       
	operadorArreglos.calcularPromedio();    }  
}

```
Salida: Promedio: 32,43

---

#### Función
```java
tipo-retorno nombre(lista-parámetros) {
   // cuerpo de la función
   return valor;
}
```
- Método que <font color="#00b0f0">retorna</font> un valor
- Para retornar un valor se usa <font color="#92d050">return</font>
> [!note] Nota
> <font color="#de7802">Retornar un valor</font> ocasiona la salida incondicional de la función.
> El **resultado** de la ejecución de la función debe asignarse a una variable o ser parte de alguna instrucción.
```java
//Atributos
public class OperadorArreglos {    
	private int[] datos;    
	
//Constructor
public OperadorArreglos(int[] datos) {        
	this.datos = new int[datos.length];        
	System.arraycopy(datos, 0, this.datos, 0,
		 datos.length);  
    }    
//Metodo-funcion   
public int obtenerMaximo() {        
	int maximo = datos[0];        
	for (int i = 1; i < datos.length ; i++) {            
		if (maximo < datos[i]) {                
		maximo = datos[i];  
        }  
      }        
    return maximo;  
  }  
}

//Operacion
public class Test {    
	public static void main(String[] args) {        

	OperadorArreglos operadorArreglos =
		new OperadorArreglos(                   
			new int[] {12, 24, 64, 11, 82, 30, 4});               
			
	// Formas de invocar una función               
	
	// Forma 1. Asignamos el retorno de la función
	// a una variable        
	int maximo = operadorArreglos.obtenerMaximo();        
	System.out.println("El valor máximo es: " + maximo);       
	        
	// Forma 2. Usamos el retorno en una expresión        
	System.out.println("El valor máximo es: " +
		operadorArreglos.obtenerMaximo());    
	}  
}
```
Salida: El valor máximo es 82
        El valor máximo es 82

---
### Método de instancia
- Es un método que puede ser invocado solo desde un objeto (instancia de una clase)
- Son los métodos más comunes en POO.
![[Pasted image 20241112184827.png|300]]
Sintaxis
```java
objeto.Metodo(lista-argumentos)
```

Ejemplo: Invocando al método asignarNotas() de la clase Alumno a través del objeto (instancia) alumno1
```java
//Clase Alumno
public class Alumno {    
//Atributos
	private String foto;    
	private String nombre;    
	private int edad;    
	private int pc1, pc2, pc3, ef;    
//Constructor
	public Alumno(String foto, String nombre, int edad) {        
		this.foto = foto;        
		this.nombre = nombre;        
		this.edad = edad;  
	}    
//Metodo
	public void asignarNotas(int[] notas) {        
		pc1 = notas[0];        
		pc2 = notas[1];        
		pc3 = notas[2];        
		ef = notas[3];  
    }  
}

//Clase pruebaAlummno
public class PruebaAlumno {    
	public static void main(String[] args) {        
		int[] notasAlumno1 = { 15, 17, 14, 18 };        
		Alumno alumno1 = new Alumno(“alex.png", “Alex", 19);  
		alumno1.asignarNotas(notasAlumno1);  //metodo de instancia
    }  
}
```
### Método estático
- Es un método que le pertenece a la clase cargada en memoria.
- No puede ser ejecutado a través de una instancia.
<mark style="background: #ABF7F7A6;">Se puede usar</mark>
- Desde la clase cargada
- Desde los métodos estáticos
- Desde los métodos de instancia
<mark style="background: #FF5582A6;">NO se puede usar</mark>
- Atributos de la instancia como si fueran estáticos
- Métodos de la instancia como si fueran estáticos

<mark style="background: #BBFABBA6;">Cuando crear métodos estáticos</mark>
- Cuando no se necesita mantener información de estado una vez que el método ha culminado.
- Si una operación no requiere de ninguna variable de instancia para su ejecución.
- Si la funcionalidad puede ser compartida a través de múltiples instancias.
![[Pasted image 20241112185326.png|300]]
Ejemplo: Invocando al método mostrarNotas() de la clase Reporte a través de la misma clase.
```java
public class Reporte {     
//metodo
	public static void mostrarNotas(Alumno alumno) {        
		System.out.printf("%2d-%2d-%2d-%2d -> %.2f",                
			alumno.getPc1(),                
			alumno.getPc2(),                
			alumno.getPc3(),              
			alumno.getEf(),                
			alumno.getPromedio());  
    }  
}

public class PruebaAlumno {    
	public static void main(String[] args) {        
		int[] notasAlumno1 = { 15, 17, 14, 18 };        
		Alumno alumno1 = new Alumno(“alex.png", “Alex", 19);  
		alumno1.asignarNotas(notasAlumno1); 
		       
		Reporte.mostrarNotas(alumno1);   //metodo estatico
    }  
}
```
### Signatura de un método
- Los métodos de una clase se definen por su signatura (firma) la cual está formada por el nombre del método más el número y tipo de dato de los parámetros.
- Cuando se invoca un método, el compilador compara el número y tipo de los parámetros y determina qué método debe invocar.
*Signatura o Firma = Nombre del  Método + Lista de parámetros*
```java
public class GestorDatos {
    public void cambiarValores(int unidades, double[] precios) {  
        // instrucciones

    }
}
```
### Sobrecarga de métodos (overload)
- En Java, dos o más métodos pueden compartir el mismo nombre, en tanto sus parámetros sean distintos.
- En este caso, se dice que el método está *sobrecargado*.
- El propósito es proveer diferentes  versiones del mismo método.
- El proceso de crear varias versiones  del mismo método se denomina  *sobrecarga de métodos (overload*).
```java
public class Sumador {    
//Metodos
	static int suma(int a, int b) {        
		return a + b;  
	}    
	static double suma(double a, double b) {        
		return a + b;  
    }    
    static double suma(double a, double b, double c) {        
		return a + b + c;  
    }    
    static double suma(double[] numeros) {        
		double suma = 0;        
		for(double numero : numeros) {            
			suma += numero;  
		}        
		return suma;  
    }  
}

public class SumadorTest {    
	public static void main(String[] args) {        
		System.out.println(Sumador.suma(12, 24));        
		System.out.println(Sumador.suma(25.47, 256.854));        
		System.out.println(Sumador.suma(36, 16.74, 56421.6354));       
		System.out.println(Sumador.suma(                
			new double[] { 56, 18.05, 66f, 4, 600.74 }));  
    }  
}
```
*La sobrecarga permite definir nuevas versiones de un mismo método.*
Salida:
36
282.32399999999996
56474.3754
744.79
## Parámetros
- Las variables que establece un método para ser invocado se denominan parámetros.
- Los valores que enviamos a un método cuando lo invocamos se denominan argumentos.
Revisar [[3. Documentacion Java#Alcance (Scoope)]]
- Los datos enviados como argumentos deben coincidir en **cantidad**, **orden** y **tipo** con los parámetros definidos en el método.
```java
public class Calculadora {    
	public int sumar(int a, int b) {        
		return a + b;  
    }  
}

public class Test {    
	public static void main(String[] args) {        
		Calculadora calculadora = new Calculadora();        
		int resultado1 = calculadora.sumar(56, 73);        
		int resultado2 = calculadora.sumar(resultado1, 230.5); // Error!        
		int resultado3 = calculadora.sumar(125, resultado1, resultado2); // Error!
	
    }  
}
```
### Sintaxis
```java
<tipo-retorno> nombreMetodo(tipo variable1, tipo variable2, ...) {  
    // cuerpo del método

}
```
### Ejemplo
Ejemplo de envió de de dos mensajes de tipo int
```java
public class Calculadora {    
	public void sumar(int a, int b) { //parametros
		System.out.println(a + b);  
    }  
}

public class Test {    
	public static void main(String[] args) {  
		Calculadora calculadora = new Calculadora();
		calculadora.sumar(16, 25);   //argumentos
    }  
}
```
### Copiado o referenciado
![[Pasted image 20241112185741.png|750]]
## Instanciación
- El proceso de crear un objeto a partir de la definición de una clase se denomina **instanciación**.
- “Crear una instancia de clase” o “Crear un objeto” son expresiones equivalentes.
```java
Persona yo = new Persona();
```
1º Se declara una variable indicando el tipo de la clase
2º Se le asigna memoria usando new

- Se pueden crear tantas instancias de clase como se requieran.
- Cada instancia constituye un objeto independiente.
- Usa los setters y getters para asignar o leer los valores de cada objeto.
```java
Persona yo = new Persona();  
Persona miAmigo = new Persona();  
  
yo.nombres = "Jorge";  
yo.apellidos = "Rodríguez";  
miAmigo.nombres = "Fernando";  
miAmigo.apellidos = "Díaz";  
  
System.out.printf("Yo: %s, %s\n",
	yo.apellidos, yo.nombres);  
System.out.printf("Mi amigo: %s, %s\n",
	miAmigo.apellidos, miAmigo.nombres);
```
## Constructores
- Un constructor es un *método* especial de una clase.
- Permiten inicializar los atributos cuando un objeto es creado con new.
- Es invocado automáticamente.
- Su nombre debe ser el mismo de la clase.
- Una clase puede definir varios constructores.
### Constructores vacíos
- Denominado también “constructor por defecto”.
- Se crea el método pero sin valor de retorno ni parámetros.
- Puede incluir código para inicializar los atributos.
- Solo puede haber uno por clase.
```java
public class Box {
	private double width;
	private double height;
	private double depth;
	
public Box() {
	width = 10;
	height = 10;
	depth = 10;
	System.out.println(
		"Constructing box");  
    
    }  
}
public class Test {
	public static void main(String[] args) {
		Box myBox = new Box();
		System.out.printf("Volume = %9.2f cm3",
			myBox.width * myBox.height * myBox.depth);  
    }  
}
```

Salida: Constructing box
		Volume =   1000.00 cm3

---
### Constructores parametrizado
- Se crea el método pero sin valor de retorno.
- Incluye uno o varios parámetros, utilizados para inicializar los atributos.
- Si incluye parámetros para todos los atributos se denomina constructor completo.
- Una clase puede tener  varios constructores  parametrizados.
```java
class Box {
	private double width;
	private double height;
	private double depth;
public Box() {        
	width = 10;
	height = 10;
	depth = 10;

	System.out.println(
		"Constructing box");  
    }    
public Box(double width, double height, double depth) {
	this.width = width;        
	this.height = height;        
	this.depth = depth; 
}

public class Test {
	public static void main(String[] args) {  
		Box myBox = new Box();
		System.out.printf("Volume = %9.2f cm3\n",
			myBox.width * myBox.height * myBox.depth);  
			
		Box yourBox = new Box(12.5, 13.7, 10.4);
		System.out.printf("Volume = %9.2f cm3",                
			yourBox.width * yourBox.height * yourBox.depth);  
    }  
}
```
Salida: Constructing box
		Volume =   1000.00 cm3
		Volume =   1781.00 cm3