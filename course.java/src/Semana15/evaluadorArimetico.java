package Semana15;
/*Crear la clase EvaluadorAritmetico que
reciba como argumento de su método
main() una expresión aritmética
combinada simple (sumas y restas) y
retorne el resultado de su procesamiento.
Ejemplo:
Si se ingresa "12+3.28-5+4.70" se deberá
devolver como resultado 14.98*/
public class evaluadorArimetico {
    // Metodo principal para ejecutar el programa
    public static void main(String[] args) {
        // Ejemplo de expresión aritmética
        String expresion = "12+3.28-5+4.70";

        // Llamamos al metodo para evaluar la expresión y mostramos el resultado
        double resultado = evaluarExpresion(expresion);
        System.out.println("El resultado de la expresión es: " + resultado);
    }

    // Metodo para evaluar una expresión aritmética
    public static double evaluarExpresion(String expresion) {
        // Variable para guardar el resultado
        double resultado = 0;

        // Reemplazar "-" por "+-" para manejar números negativos
        expresion = expresion.replace("-", "+-");

        // Dividir la expresión en términos separados por "+"
        String[] terminos = expresion.split("\\+");

        // Sumar todos los términos
        for (String termino : terminos) {
            if (!termino.isEmpty()) {
                resultado += Double.parseDouble(termino);
            }
        }

        return resultado;
    }
}
