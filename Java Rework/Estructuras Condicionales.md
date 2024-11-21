# <span style="background:#fff88f">Estructuras Condicionales</span>

- Una **condición** es un **conjunto** de **requisitos** o **criterios** que, de cumplirse, permiten realizar una serie de acciones.   
- En Java, una **condición** se **expresa** a través de **operadores** **relacionales** y **lógicos**.
- Una expresión condicional devuelve un tipo de dato **boolean** (true o false)
## Aspectos importantes 
### OR,AND
AND (&&) , y
OR (||), o
```java
int a = 10, b = 0;

// Esta línea previene la división entre cero
if (b != 0 && (a % b) == 0) {
    System.out.println(b + " es un factor de " + a);
} else {
    System.out.println(b + " NO es un factor de " + a);
}

// Esta línea no previene la división entre cero
if (b != 0 & (a % b) == 0) {
    System.out.println(b + " es un factor de " + a);
}
```
Salida
0 NO es un factor de 10
Exception in thread "main"
java.lang.ArithmeticException: / by zero
    at Basics.Validations.Draft.main(Draft.java:19)
### NOT
NOT (!), no
- Representado mediante el signo de exclamación: **!**
- Es un **operador** **unario**, usado como **prefijo**.
- **Invierte** el **valor** de la **expresión booleana**.
- Así, si la expresión es true, **NOT** la cambia a false, y viceversa.
```java
int x = 15, y = 8;
boolean xEsMayor = (x > y);

System.out.println("x es mayor a y: " + xEsMayor);
System.out.println("x es menor a y: " + !xEsMayor);
```
expresion alternativa usando not
```java
boolean xEsMayor = !(x < y);
```
Salida
x es mayor a y: true
x es menor a y: false
## if, if-else, else
### Condicional Simple
- Una estructura condicional simple permite ejecutar ciertas instrucciones solo cuando la condición se cumple (true)
- Sintaxis:
```java
if (<condicion>){
//codigo condicional
}
```

![[Pasted image 20241112172302.png|325]]
```java
float precioProducto = 328.45f;
int unidadesCompradas = 8;

boolean aplicaDescuento = (unidadesCompradas > 5) ||
                          (precioProducto * unidadesCompradas > 2000.0);

if (aplicaDescuento) {
    System.out.println("¡Enhorabuena! Tiene 10% de descuento");
}
```

---

### Condicional Doble
 Una estructura condicional doble permite ejecutar un conjunto de instrucciones si la condición se cumple (<font color="#00b050">true</font>), y…
- Si la condición no se cumple (<font color="#ff0000">false</font>), entonces se ejecuta otro conjunto de instrucciones.
```java
if (<condicion>){
//codigo condicional 1
} else {
// codigo condicional 2
}
```
![[Pasted image 20241112172510.png|375]]
```java
float precioProducto = 328.45f;
int unidadesCompradas = 8;
boolean aplicaDescuento = (unidadesCompradas > 5) || 
                         (precioProducto * unidadesCompradas > 2000.0);

if (aplicaDescuento) {
    System.out.println("Enhorabuena! Tiene 10% de descuento");
} else {
    System.out.println("Gracias por su compra");
}
```

Usos comunes
- **Alterar entradas**
    - Se refiere a la lectura de ciertos datos en base a una o varias condiciones
- **Alterar procesos**
    - Implica la realización de cálculos distintos en base a una o varias condiciones
- **Alterar salidas**
    - Consiste en mostrar diferentes mensajes o resultados en base a una o varias condiciones

### Condicional simple anidada
- Es aquella donde una condicional simple se encuentra dentro de otra condicional simple.
- Las instrucciones se ejecutan solo si las condiciones son verdaderas.
- Se pueden incluir más instrucciones antes y después de las condiciones anidadas.

```java
if (<condicion>){
//Intrucciones (opcionales)
	if (<Condicion>){
	// Instruccion 1
	// Instruccion 2
	//...
	}
// Intrucciones (opcional)
}
```

![[Pasted image 20241112180416.png|550]]
### Operadores condicionales ? , :
Conocido también como **operador ternario.**
Provee una forma abreviada de evaluar una expresión condicional.
Usado como alternativa a la estructura *if..else*
Hace uso de los símbolos: *?* y *:*
Sintaxis:
<font color="#1f497d">variable</font> = (<font color="#7030a0">condición</font>) <font color="#f79646">? </font>(retorno si es <font color="#00b050">true</font>) : (retorno si es <font color="#ff0000">false</font>);
Escribir un programa que solicite la edad de una persona y muestre con un mensaje si es mayor o menor de edad.
```java
Scanner lector = new Scanner(System.in);
System.out.print("Ingrese su edad: ");
int edad = lector.nextInt();

String mensaje = edad >= 18 ? "Es mayor de edad" : "Es menor de edad";

System.out.println(mensaje);
```

Escribir un programa que solicite un número entero y muestre con un mensaje si es
positivo, negativo o cero.

```java
Scanner lector = new Scanner(System.in);
System.out.print("Ingrese un número entero: ");
int numero = lector.nextInt();

String mensaje = numero > 0 ? "Positivo" :
	numero < 0 ? "Negativo" : "Cero";
	
System.out.println(mensaje);
```

## Switch-case
switch provee una bifurcación múltiple, lo que habilita a un programa a seleccionar entre muchas alternativas.
switch es mucho más eficiente que utilizar if anidados. 
Soporta tipos byte, short, int, char, String o enumeraciones.
```java
switch (expresión) {
	case valor1:
		// código condicional 1
		break;
	case valor2:
		// código condicional 2
		break;
	case valorN:
		// código condicional N
		break;
	default:
	// código por defecto
}
```


```java
int estadoProyecto = 3;
String descripcion = "";

switch (estadoProyecto) {
	case 0: descripcion = "Creado";
		break;
	case 1: descripcion = "Asignado";
		break;
	case 2: descripcion = “En progreso";
		break;
	case 3: descripcion = "Finalizado";
		break;
	case 4: descripcion = "Cancelado";
		break;
	case 5: descripcion = "Suspendido";
		break;
}
System.out.println(“El estado del Proyecto es" + descripcion.toUpperCase());
```

Conocido el valor de la variable, se compara con cada valor hasta encontrar la coincidencia y se ejecutan las sentencias contenidas en ese bloque.
La instrucción break es importante para salir de la estructura y ejecutar la siguiente sentencia fuera de switch.

Se hace uso del método toUpperCase() para convertir el
mensaje a mayúsculas.
Es posible tener bloques case vacíos. Son útiles para agrupar opciones.

```java
int scoreNPS = 9;

switch (scoreNPS) {
	case 0:
	case 1:
	case 2:
	case 3:
	case 4:
	case 5:
	case 6:
	System.out.println("Detractor");
		break;
	case 7:
	case 8:
	System.out.println("Pasivo");
		break;
	case 9:
	case 10:
	System.out.println("Promotor");
		break;
}
```

```java
int scoreNPS = 9;

switch (scoreNPS) {
    case 0, 1, 2, 3, 4, 5, 6:
        System.out.println("Detractor");
        break;
    case 7, 8:
        System.out.println("Pasivo");
        break;
    case 9, 10:
        System.out.println("Promotor");
        break;
}
```
## Switch mejorado
**JDK 14** (2020) introduce switch al *estilo* de una *función* que retorna un valor.
Mejoras:
Sólo el código ubicado a la derecha de la etiqueta es ejecutado si ocurre una coincidencia (obviamos *break*)
Una nueva instrucción yield para devolver el valor resultante.
**Importante**: el nuevo switch requiere que todos los posibles valores sean cubiertos.
```java
int scoreNPS = 9;

String descripcion = switch (scoreNPS) {
	case 0, 1, 2, 3, 4, 5, 6 -> "Detractor";
	case 7, 8 -> "Pasivo";
	case 9, 10 -> "Promotor";
	default -> “No válido";
};

System.out.println(descripcion);
```
Nótese el uso obligatorio de default en este ejemplo.
```java
int scoreNPS = 5;
int contadorDetractor = 0;
int contadorPasivo = 0;
int contadorPromotor = 0;

String descripcion = switch (scoreNPS) {
	case 0, 1, 2, 3, 4, 5, 6 -> {
	contadorDetractor++;
		yield "Detractor";
	}
	case 7, 8 -> {
	contadorPasivo++;
		yield "Pasivo";
	}
	case 9, 10 -> {
	contadorPromotor++;
		yield "Promotor";
	}
	default -> “No válido";
};
System.out.println(descripcion);
```
**switch** utilizando varias sentencias por caso y la instrucción **yield**.
## Patter Matching en switch
Desde JDK 21, además de constantes, las expresiones de selección de un switch pueden compararse con patrones (*pattern matching*)
Las comparaciones se realizan tanto con tipos primitivos como con tipos de referencia (*type pattern*).
La cláusula **when** (opcional) permite establecer expresiones condicionales basadas en el tipo de dato evaluado (*guarded pattern*).
```java
public class DemoSwitchPatternMatching {
	public enum DefinicionCalificacion { Excelente, MuyBien, Satisfactorio, Suficiente, Insatisfactorio };
	
public static void main(String[] args) {
DefinicionCalificacion resultado = DefinicionCalificacion.Insatisfactorio;
Integer calificacion = 89;

resultado = switch (calificacion) {
	case Integer c when (c >= 90 && c <=100) -> DefinicionCalificacion.Excelente;
	case Integer c when (c >= 70 && c <=89) -> DefinicionCalificacion.MuyBien;
	case Integer c when (c >= 50 && c <=69) -> DefinicionCalificacion.Satisfactorio;
	case Integer c when (c >= 30 && c <=49) -> DefinicionCalificacion.Suficiente;
	case Integer c when (c >= 0 && c <=29) -> DefinicionCalificacion.Insatisfactorio;
	default -> throw new IllegalArgumentException("Calificación no válida");
};
System.out.println(resultado);
}
}
```