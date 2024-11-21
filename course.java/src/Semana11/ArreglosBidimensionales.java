package Semana11;

public class ArreglosBidimensionales {
    public static void main(String[] args) {
        //recorrido por filas clasico
    int[][] matriz={{18,6,29},{64,11,7},{30,81,37}};

    for (int f = 0;f< matriz.length;f++){
        for (int c=0;c<matriz[0].length;c++){
            System.out.printf("%2d ",matriz[f][c]);
        }
        System.out.println();
    }

    //recorrido por filas con for-each
        int[][] matriz2={{18,6,29},{64,11,7},{30,81,37}};
    for (int[] fila:matriz2){
        for(int valor : fila){
            System.out.printf("%2d ", valor);
        }
        System.out.println();
    }

    //recorrido por columnas
        int[][] matriz3={{18,6,29},{64,11,7},{30,81,37}};

        for (int f = 0;f< matriz3[0].length;f++){
            for (int c=0;c<matriz3.length;c++){
                System.out.printf("%2d ",matriz3[c][f]);
            }
            System.out.println();
        }


    }
}
