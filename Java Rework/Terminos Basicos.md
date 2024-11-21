# Operadores Básicos
| Operador | Operación               | Uso en Java          |
|----------|--------------------------|----------------------|
| +        | Suma                     | 10 + 5 = 15         |
| -        | Resta                    | 20 - 2 = 18         |
| *        | Multiplicación           | 3 * 3 = 9           |
| /        | División                 | 10 / 2 = 5          |
| %        | Residuo (módulo)         | 11 % 2 = 1          |
| ++       | Incremento               | edad++              |
| --       | Decremento               | edad--              |
| +=       | Asignación con suma      | edad += 2           |
| -=       | Asignación con resta     | edad -= 2           |
| *=       | Asignación con producto  | edad *= 2           |
| /=       | Asignación con división  | edad /= 2           |
| %=       | Asignación con residuo   | edad %= 2           |

---
# Operadores logicos
 - Conocidos también como **operadores booleanos**.
 - Permiten la elaboración de expresiones lógicas que devuelven verdadero o falso, según su tabla de verdad.
 
| Operador | Significado             |
|----------|--------------------------|
| &        | AND (y)                  |
| \|       | OR (o)                   |
| !        | NOT (no)                 |
| \|\|     | OR de cortocircuito      |
| &&       | AND de cortocircuito     |
| ^        | XOR (o exclusivo)        |

| p                                  | q                                  | AND (p & q)                        | OR (p \| q)                        | XOR (p ^ q)                        | NOT (!p)                           |
| ---------------------------------- | ---------------------------------- | ---------------------------------- | ---------------------------------- | ---------------------------------- | ---------------------------------- |
| <font color="#ff0000">False</font> | <font color="#ff0000">False</font> | <font color="#ff0000">False</font> | <font color="#ff0000">False</font> | <font color="#ff0000">False</font> | <font color="#92d050">True</font>                               |
| <font color="#92d050">True</font>  | <font color="#ff0000">False</font> | <font color="#ff0000">False</font> | <font color="#92d050">True</font>  | <font color="#92d050">True</font>  | <font color="#ff0000">False</font> |
| <font color="#ff0000">False</font> | <font color="#92d050">True</font>  | <font color="#ff0000">False</font> | <font color="#92d050">True</font>  | <font color="#92d050">True</font>  | <font color="#92d050">True</font>  |
| <font color="#92d050">True</font>  | <font color="#92d050">True</font>  | <font color="#92d050">True</font>  | <font color="#92d050">True</font>  | <font color="#ff0000">False</font> | <font color="#ff0000">False</font> |

---

# Operadores relacionales
- “Los operadores relacionales sirven para expresar las condiciones en los algoritmos” _(Joyanes 2008)_
- Devuelven un tipo de dato lógico que puede asignarse a un variable de tipo **boolean** para crear un **check**.

| Operador Relacional | Significado          |
|---------------------|----------------------|
| >                   | Mayor que            |
| <                   | Menor que            |
| >=                  | Mayor o igual que    |
| <=                  | Menor o igual que    |
| ==                  | Igual que            |
| !=                  | Diferente de         |

---

# Arreglos
Es una estructura lineal y estática (no permite agregar ni quitar elementos) Constituye una colección de variables referidas por un nombre común. Los elementos son almacenados en posiciones contiguas de memoria. Por esto, el acceso y manipulación de sus datos se realiza mediante índices
## Características de los Arreglos

| Característica          | Descripción                                                                                      |
|-------------------------|--------------------------------------------------------------------------------------------------|
| Tipo de datos           | Todos los elementos en un arreglo deben ser del mismo tipo (por ejemplo, enteros, cadenas, etc.).|
| Tamaño                  | El tamaño es fijo una vez que se declara (en la mayoría de los lenguajes de programación).       |
| Acceso                  | Se accede a los elementos mediante índices, comenzando desde 0.                                  |
| Eficiencia              | Los arreglos permiten acceso rápido a cualquier elemento mediante su índice.                     |

## Representación Gráfica de un Arreglo Unidimensional

### Ejemplo de un arreglo de enteros:

| Índice | 0  | 1  | 2  | 3  | 4  |
|--------|----|----|----|----|----|
| Valor  | 10 | 20 | 30 | 40 | 50 |

**Acceso:** Para acceder al valor `30`, se usa el índice `2`: `arreglo[2]`.

## Tipos de Arreglos

### 1. Arreglo Unidimensional
Un arreglo con una sola dimensión. Puede visualizarse como una lista de valores en una fila.

| Índice | 0  | 1  | 2  | 3  | 4  |
|--------|----|----|----|----|----|
| Valor  | 10 | 20 | 30 | 40 | 50 |
### 2. Arreglo Bidimensional (Matriz)

Un arreglo con dos dimensiones, representado como una tabla o una cuadrícula. Ejemplo de una matriz de 3x3:

|.|Col 0|Col 1|Col 2|
|---|---|---|---|
|**Fila 0**|5|8|12|
|**Fila 1**|9|3|7|
|**Fila 2**|6|14|2|

**Acceso:** Para acceder al valor `7`, se usa la notación `matriz[1][2]` (segunda fila, tercera columna).

---

# Programación Orientada a Objetos
- Es un paradigma de programación.
- En la POO se identifican objetos del mundo real –físicos o conceptuales.
- Se identifican además estados y comportamientos de éstos objetos.
- Los objetos son utilizados a partir de su clasificación (Clase).
## Ventajas
- Facilita la agrupación de datos y funcionalidad relacionada.
- Alienta la reusabilidad.
- Facilita el mantenimiento del código.
- Mejora la seguridad a través del encapsulamiento.
- Facilita encontrar y solucionar problemas de código.
- Incorpora nuevos conceptos y técnicas.
## Definición de “Objeto”
- Es una estructura que representa a un objeto del mundo real.
- Contiene información de estado y comportamiento.
- Su estado se refiere a las características (valores de sus atributos) que lo definen en un momento dado.
- Su comportamiento se refiere a las actividades asociadas a éste.
![[Pasted image 20241106214332.png|525]]
## Definición de “Clase”
- Una Clase es una abstracción del mundo real.
- Es un “plano” que especifica cómo construir un objeto.
- Permite especificar el estado y comportamiento de  un objeto para crear instancias de clase.
- El estado se describe a través  de sus atributos y su comportamiento a través  de métodos.
![[Pasted image 20240614214856.png|400]]
## Definición de “Instancia de Clase”
- Es un objeto en ejecución.
- Permite “individualizar” al objeto.
- Las instancias de clase ocupan espacio de memoria y consumen recursos en el Sistema Operativo.
- Tienen un tiempo de vida limitado.
## Representación de una Clase
- Se utiliza el lenguaje de modelado UML.
- El nombre de la clase debe ser un sustantivo en singular.
- Los atributos deben ser descriptivos.
- Los métodos deben empezar con un verbo.
![[Pasted image 20241106214529.png|300]]
## Clase y Objeto
De un clase se pueden instanciar varios objetos. Cada instancia es distinta de otras, incluso si ambas tienen los mismos valores
![[Pasted image 20241106214555.png|625]]
