package Semana5;

import java.util.Scanner;

/*Escribe un programa en Java para crear una Calculadora de Áreas. Debe preguntarse al
usuario por la figura (cuadrado, rectángulo, triángulo o círculo) y luego solicitar los datos para calcular su área.
• Elegir una figura requiere ingresar el nombre completo o las tres primeras letras (“cuadrado” o “cua”, por ejemplo).
• Usa los métodos equals y contains de la clase String para validar el ingreso del usuario.*/
public class CalculadoraArea {
    public static void main(String[] args) {
        double base, altura, radio;
        char figura;
        Scanner lector = new Scanner(System.in);
        System.out.printf("Seleecione una figura para calcular su área:\n" +
                "[c] Cuadrado\n"+
                "[r] Rectángulo\n"+
                "[t] triángulo\n"+
                "[i] Círculo\n");
        System.out.print("Ingrese opción: ");
        figura = lector.next().charAt(0);
        if (figura == 'c') {
            System.out.print("Ingrese valor de lado: ");
            base = lector.nextDouble();
            System.out.println("Área del cuadrado: " + (base * base));
        } else if (figura == 'r') {
            System.out.print("Ingrese valor de base: ");
            base = lector.nextDouble();
            System.out.print("Ingrese valor de altura: ");
            altura = lector.nextDouble();
            System.out.println("Área del rectángulo: " + (base * altura));
        } else if (figura == 't') {
            System.out.print("Ingrese valor de base: ");
            base = lector.nextDouble();
            System.out.print("Ingrese valor de altura: ");
            altura = lector.nextDouble();
            System.out.println("Área del triángulo: " + (base * altura / 2));
        } else if (figura == 'i') {
            System.out.print("Ingrese valor de radio: ");
            radio = lector.nextDouble();
            System.out.println("Área del círculo: " + Math.PI * Math.pow(radio, 2));
        } else {
            System.out.println("Opción ingresada no es válida.");
        }
    }
}
