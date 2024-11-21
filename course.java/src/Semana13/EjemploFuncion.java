package Semana13;
class operadorArreglo {
    //Atributos
    private int[] datos;

    //Constructor
    public operadorArreglo(int[] datos) {
        this.datos = new int[datos.length];
        System.arraycopy(datos, 0, this.datos, 0, datos.length);
    }
    //funcion
    public int obtenerMaximo(){
        int maximo =datos[0];
        for (int i =1; i< datos.length;i++){
            if (maximo<datos[i]){
                maximo=datos[i];
            }
        }
        return maximo;
    }
}
public class EjemploFuncion {
    public static void main(String[] args) {
    operadorArreglo operadorArreglo = new operadorArreglo(new int[] {12,54,21,67,43});
        //Formas de invocar una funcion
        //forma 1 Asifnamos el retorno a uan variable
        int maximo=operadorArreglo.obtenerMaximo();
        System.out.println("El valor maximo es: "+maximo);

        //forma2 Usamos el retorno en una expresion
        System.out.println("El valor maximo es: "+operadorArreglo.obtenerMaximo());

    }
}
