package Semana13;
class operadorArreglos{
    //Atributos
    final private int[] datos;
    //Constructor
    public operadorArreglos(int[] datos) {
        this.datos = new int[datos.length];
        System.arraycopy(datos,0,this.datos,0,datos.length);
    }

    //Procedimiento
    public  void calcularPromedio(){
        double suma= 0;
        for (int dato:datos){ //for-earch
            suma+= dato;
        }
        System.out.printf("Promedio: %.2f\n",suma/datos.length);
    }
    //procedimiento para eliminar un valor
    public void eliminarValor(int valor) {
        // Buscar la posición de la primera ocurrencia
        int index = -1;
        for (int i = 0; i < datos.length; i++) {
            if (datos[i] == valor) {
                index = i;
                break;
            }
        }
        // Recorrer los elementos a la izquierda
        for (int i = index; i < datos.length - 1; i++) {
            datos[i] = datos[i + 1];
        }
        // Rellenar el último espacio con 0 (o algún otro valor por defecto)
        datos[datos.length - 1] = 0;

        System.out.println("Valor eliminado. Nuevo arreglo:");
        imprimirArreglo();
    }
    // Metodo para imprimir el arreglo
    public void imprimirArreglo() {
        for (int dato : datos) {
            System.out.print(dato + " ");
        }
        System.out.println();
    }
}



public class EjemploProcedimiento {
    public static void main(String[] args) {
        operadorArreglos operadorArreglos = new operadorArreglos(new int[]{12, 24, 64, 6});
        operadorArreglos.calcularPromedio();
        // Imprimir el arreglo original
        System.out.println("Arreglo original:");
        operadorArreglos.imprimirArreglo();
        // Eliminar un valor (ejemplo: eliminar 24)
        operadorArreglos.eliminarValor(12);
    }
}

