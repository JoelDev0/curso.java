## Variables de control
- Al trabajar con estructuras repetitivas empleamos dos tipos de variables de control:
- Contador.
- Acumulador.
- Los **contadores** y **acumuladores** deben **inicializarse** antes de participar en un bucle.

```java
miContador = 0;
mi Acumulador = 0;
//el valor de inicializarse no siempre debe ser 0
```
## Contadores
- Un **contador** es una **variable** que se **incrementa** o **disminuye** en un valor **constante**
- Se utiliza para el conteo de acciones.
- Es siempre un valor de tipo **int**.

FORMA GENERAL : contador = contador + valorConstante
```java
j = j + 2;
x = x - 1;
cantidad = cantidad + 1;
```

## Acumuladores
- Un **acumulador** o **totalizador** es una variable que **almacena** la **suma** de una serie de **cantidades** **variables**.
- Es decir, **incrementa** o **disminuye** en un **valor** **variable**.
- Pueden ser de tipo **int** , **double** o **String**
FORMA GENERAL | acumulador = acumulador  + valorVariable;
```java
j = j + i;
x = x - valor;
cantidad = cantidad + variable;
```

## Contador interno progresivo y regresivo
```java
for (int i = 0; i < limite; i++) {
// instrucciones  
}

```
El contador interno progresivo, incrementa su valor automáticamente con cada iteración hasta que la condición sea falsa​
- Incremento (++ o +=n)

Ejemplo…
Mostrar los 5 primeros números pares.
```java
for (int i = 1; i <= 10; i ++) {
	if (i % 2 == 0) {
	System.out.println(i);  
    }  
}
```
o..
```java
for (int i = 2; i <= 10; i += 2) {
System.out.println(i);  
}
```

```java
for (int i = x; i > limite; i--) {
// instrucciones  
}
```
El contador interno regresivo, decrementa su valor automáticamente con cada iteración hasta que la condición sea falsa​.
- Incremento (-- o -=n )

Ejemplo..
Mostrar los 5 primeros números pares en orden descendente.
```java
for (int i = 10; i > 0; i --) {
	if (i % 2 == 0) {
		System.out.println(i);  
    }  
}
```
o…
```java
for (int i = 10; i >= 2; i -= 2) {
System.out.println(i);  
}
```

## Validadores
- La técnica para comprobar si una variable contiene un determinado valor se denomina validación.
- Un validador puede componerse de varios criterios.
- Un validador suele utilizar un check para guardar el resultado de su validación.
- Muy utilizados cuando se solicitan datos al usuario (inputs)

**Ejemplo (sin check)**
do-while utilizado para validar el ingreso de un número entero entre 0 y 10.
```java
int numero;  
Scanner lector = new Scanner(System.in);  
  
do {
System.out.print("Ingrese un valor entre 0 y 10: ");
numero = lector.nextInt();
lector.nextLine();  
} while (numero < 0 || numero > 10);  
  
System.out.println("Usted ingresó: " + numero);
```
**Salida:**
Ingrese un valor entre 0 y 10: 
16
Ingrese un valor entre 0 y 10: 
87
Ingrese un valor entre 0 y 10: 
45
Ingrese un valor entre 0 y 10: 
6
Usted ingresó: 6

**Ejemplo (con check)**
Escribir un programa que solicite un número correspondiente al día de la semana. Los valores permitidos van del 1 al 7.
Si se ingresa otro valor, el programa deberá pedir nuevamente que se ingrese el día de la semana.
```java
int dia = 0;  
boolean esDiaInvalido = true;  
  
Scanner lector = new Scanner(System.in);  

do {
System.out.print("Ingrese un día (1-7): ");
dia = lector.nextInt();
lector.nextLine();
esDiaInvalido = (dia < 1 || dia > 7);  
} while (esDiaInvalido);  
  
System.out.println("Día ingresado: " + dia);
```
**Salida:**
Ingrese un día (1-7): 
0
Ingrese un día (1-7):
11
Ingrese un día (1-7): 
5
Día ingresado: 5
## Menu con do while
- Es una técnica de ingreso de datos.
- Por lo general, las opciones del menú se asocian a valores numéricos o caracteres.
- Pueden incluir submenús para ampliar las posibilidades de ingreso de datos.

**Ejemplo:**
Elaborar un programa que permita mostrar un menú con 3 opciones​:
1. Agregar notas​
2. Ver promedio​
3. Salir​
Al ingresar la opción 3, el programa debe terminar​.
```java
Scanner lector = new Scanner(System.in);  
int opcion = 0;  
  
String menu = """  
        |===================================|  
        |  Acciones disponibles:            |  
        |  [1] Agregar notas                |  
        |  [2] Ver promedio                 |  
        |  [3] Salir                        |  
        |===================================|       
         Ingrese una opción:  
        """;  
do {
System.out.println(menu);
opcion = lector.nextInt();
lector.nextLine();  
} while (opcion != 3);
```

# <span style="background:#fff88f">Estructuras Repetitivas</span>
- Una estructura repetitiva es aquella que permite ejecutar un bloque de sentencias un número finito de veces.
- A una estructura repetitiva también se le llama **bucle** (loop)
- Por lo general, un bucle tiene un inicio y una condición de salida.
- Trabaja conjuntamente con variables de iteración, así como con **contadores** y **acumuladores**.
## While
- Es aquella en la que el bucle se repite “**mientras**” se cumpla una determinada condición (Joyanes, 2008)
- El bucle está en **ejecución** mientras la **condición** es **verdadera**. Si es **falsa** entonces el bucle **no se** **ejecuta** o **deja** **de** **ejecutarse**.

```java
while(condicion){

//intrucciones
}
```
![[Pasted image 20241112182356.png|250]]
**Ejemplo.**
- Se requiere un programa que permita ingresar la edad de una persona​.
- Si el usuario ingresa un valor negativo, deberá pedir nuevamente la edad​.
- Si el valor ingresado no es negativo, el programa deberá mostrar la edad ingresada​.
```java
```java
public static void main(String[] args) {

int edad = -1;
Scanner lector = new Scanner(System._in_);

while (edad < 0) {
System._out_.print("Ingrese su edad: ");
edad = lector.nextInt();
lector.nextLine();
}

System._out_.println("Edad ingresada: " + edad);
    
}
```
## Centinelas
- La forma más correcta de terminar un bucle es utilizar un **centinela** (Joyanes, 2008)
- Un **centinela** es una **variable** que avisa al bucle cuando su valor cumple ciertas condiciones.
- Puede ser de cualquier tipo de dato, aunque es especialmente útil si es de **tipo** **lógico**.
- Ayuda a mejorar la legibilidad y comprensión del código.

**Ejemplo.**
- Se requiere un programa que permita ingresar el día de la semana en valor numérico). Los valores permitidos son del 1 al 7.
- Si se ingresa otro valor, el programa deberá pedir nuevamente que se ingrese el día de la semana.
```java
Scanner lector = new Scanner(System._in_);
boolean esDiaInvalido = true;
int dia = 0;
while (esDiaInvalido) {
System._out_.print("Ingrese día de la semana (1-7): ");
dia = lector.nextInt();
lector.nextLine();
esDiaInvalido = (dia < 1 || dia > 7); //sentinela
}

System._out_.println("Día ingresado: " + dia);
```

## do while
**hacer mientras**
•La estructura repetitiva do-while ejecuta su condición al final del bucle.
•Por su diseño, esta estructura se ejecuta al menos una vez, siempre.
•El bucle finaliza cuando la condición es false (opuesto al bucle while)
![[Pasted image 20241112182659.png|295]]
```java
do{
//bloque de instruciones
//actualizacion de la condicion
} while (condicion);


```

**Ejemplo.**
do-while utilizado para mostrar la tabla de multiplicar de un número dado. Nótese la forma en que se realiza la condición final
```java
int numero, i = 1;  
Scanner lector = new Scanner(System.in);  
System.out.print("Ingrese un entero entre 1 y 12: ");  
numero = lector.nextInt();  
lector.nextLine();  
  
do {    
System.out.printf("%d x %2d = %3d\n", numero, i, numero * i);  
} while (++i <= 12);
```
 Respuesta
Ingrese un entero entre 1 y 12: 8

8 x  1 =   8
8 x  2 =  16
8 x  3 =  24
8 x  4 =  32
8 x  5 =  40
8 x  6 =  48
8 x  7 =  56
8 x  8 =  64
8 x  9 =  72
8 x 10 =  80
8 x 11 =  88
8 x 12 =  96
## for
En su forma general, la estructura repetitiva for permite ejecutar las acciones un número de veces previamente conocido.
Alternativamente, el bucle se puede ejecutar un número indeterminado de veces, mientras la condición sea verdadera.
![[Pasted image 20241112182858.png|225]]
- Hay dos tipos de bucle for:
	- La forma tradicional, existente desde la versión original de Java.
	- El nuevo **for-each**, existente desde JDK 5.

- Recuerda: en estructuras repetitivas, cada repetición o “vuelta” se denomina también iteración.

```java
for (inicializacion;condicion;iteracion){
//intrucciones
}
```

**Ejemplo.**
Escribir un programa en Java que muestre los 10 primeros números enteros positivos.
```java
for (int i = 1; i <= 10; i++) {
System.out.println(i);  
}
```
A menudo, la variable que controla el bucle for es solo necesaria para el bucle y no tiene otra utilidad.
En este caso es posible declarar la variable dentro de la sección de inicialización de la estructura for.
**Uso de la coma**
- En la estructura for es posible inicializar más de una variable. Cada inicialización se separa con una coma.
- Asimismo, puede modificarse el valor de otra variable en la sección de iteración de la estructura.
![[Pasted image 20241112182944.png|575]]
**for sin cuerpo**
•En Java, el cuerpo de una estructura for puede estar vacío.
•Esto es posible porque una instrucción null es sintácticamente válida.
![[Pasted image 20241112183004.png|575]]
## for-each
este bucle es una forma simplificada del bucle `for` tradicional que se utiliza para recorrer elementos de cualquier colección o array. La principal ventaja del bucle `for-each` es que elimina la necesidad de utilizar un contador o un iterador manualmente, lo que hace que el código sea más limpio y fácil de leer.

```java
for (tipo elemento : coleccion) {
    // Código a ejecutar para cada elemento
}
```
Donde:
- `tipo` es el tipo de datos de los elementos en la colección o array.
- `elemento` es la variable que representa el elemento actual durante la iteración.
- `coleccion` es la colección o array que deseas recorrer.

```java
int[] numeros = {1, 2, 3, 4, 5};
for (int numero : numeros) {
    System.out.println(numero);
}
```