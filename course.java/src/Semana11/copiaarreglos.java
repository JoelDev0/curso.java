package Semana11;

public class copiaarreglos {
    public static void main(String[] args) {
        int[][] datos = {{24, 32, 19}, {11, 45, 78}, {36, 11, 90}};
        int[][] copia = new int[3][3];
        System.arraycopy(datos, 0, copia, 0, datos.length);
        Salida:
        for (int i = 0; i < copia.length; i++) {
            for (int j = 0; j < copia.length; j++) {
                System.out.printf("%2d ", copia[i][j]);
            }
            System.out.println();
        }
    }
}
