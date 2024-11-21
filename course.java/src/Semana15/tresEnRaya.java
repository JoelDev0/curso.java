package Semana15;

import java.util.Scanner;

class tresRaya{
    private char[][] tablero; // Tablero del juego
    private char jugadorActual; // 'X' o 'O'

    // Constructor: inicializa el tablero vacío y el jugador inicial
    public tresRaya() {
        tablero = new char[3][3]; // Tablero 3x3
        jugadorActual = 'X'; // Comienza el jugador 'X'
        inicializarTablero();
    }

    // Llena el tablero con espacios en blanco
    private void inicializarTablero() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = ' '; // Espacios vacíos
            }
        }
    }

    // Imprime el tablero en consola
    public void mostrarTablero() {
        System.out.println("  0   1   2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j]);
                if (j < 2) System.out.print(" | "); // Separador de columnas
            }
            System.out.println();
            if (i < 2) System.out.println(" ---+---+---"); // Separador de filas
        }
    }

    // Realiza un movimiento en el tablero
    public boolean hacerMovimiento(int fila, int columna) {
        if (fila >= 0 && fila < 3 && columna >= 0 && columna < 3 && tablero[fila][columna] == ' ') {
            tablero[fila][columna] = jugadorActual;
            return true; // Movimiento válido
        }
        return false; // Movimiento inválido
    }

    // Cambia al siguiente jugador
    public void cambiarJugador() {
        jugadorActual = (jugadorActual == 'X') ? 'O' : 'X';
    }

    // Comprueba si el jugador actual ganó
    public boolean verificarGanador() {
        // Verificar filas
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] == jugadorActual && tablero[i][1] == jugadorActual && tablero[i][2] == jugadorActual) {
                return true;
            }
        }

        // Verificar columnas
        for (int j = 0; j < 3; j++) {
            if (tablero[0][j] == jugadorActual && tablero[1][j] == jugadorActual && tablero[2][j] == jugadorActual) {
                return true;
            }
        }

        // Verificar diagonales
        if (tablero[0][0] == jugadorActual && tablero[1][1] == jugadorActual && tablero[2][2] == jugadorActual) {
            return true;
        }
        if (tablero[0][2] == jugadorActual && tablero[1][1] == jugadorActual && tablero[2][0] == jugadorActual) {
            return true;
        }

        return false; // No hay ganador
    }

    // Comprueba si el tablero está lleno (empate)
    public boolean tableroLleno() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == ' ') {
                    return false; // Hay al menos un espacio vacío
                }
            }
        }
        return true; // No hay más movimientos posibles
    }

    // Retorna el jugador actual
    public char getJugadorActual() {
        return jugadorActual;
    }
}
public class tresEnRaya {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        tresRaya juego = new tresRaya();
        boolean hayGanador = false;

        System.out.println("¡Bienvenidos al juego de Tres en Raya!");
        juego.mostrarTablero();

        // Bucle principal del juego
        while (!hayGanador && !juego.tableroLleno()) {
            System.out.println("Turno del jugador: " + juego.getJugadorActual());
            System.out.print("Ingresa la fila (0-2): ");
            int fila = scanner.nextInt();
            System.out.print("Ingresa la columna (0-2): ");
            int columna = scanner.nextInt();

            // Validar movimiento
            if (juego.hacerMovimiento(fila, columna)) {
                juego.mostrarTablero();

                // Verificar si hay ganador
                if (juego.verificarGanador()) {
                    System.out.println("¡El jugador " + juego.getJugadorActual() + " ha ganado!");
                    hayGanador = true;
                } else {
                    juego.cambiarJugador(); // Cambiar turno
                }
            } else {
                System.out.println("Movimiento inválido. Intenta de nuevo.");
            }
        }

        // Si el tablero está lleno y no hay ganador
        if (!hayGanador && juego.tableroLleno()) {
            System.out.println("¡Es un empate!");
        }

        scanner.close();
    }
}


