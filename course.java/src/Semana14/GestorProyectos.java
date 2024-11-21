package Semana14;
/*Implementar la clase GestorProyectos para gestionar una lista de
proyectos (arreglo). El máximo número de proyectos que puede tener la
lista es 10.
• Cada proyecto tiene: un código único (int), nombre, presupuesto
(double), fecha de entrega y número de integrantes.
• El metodo agregar() agregará un nuevo proyecto al final de la lista.
• El metodo insertar() agregará un nuevo proyecto en la posición indicada.
• El metodo buscar() devolverá el proyecto buscado o null. Se puede
buscar por código o por nombre. Si se busca por nombre (sobrecarga) se
ingresa el nombre completo o parte de él. En este último caso, se puede
devolverse más de un proyecto.*/
class Proyecto {
    private int codigo;
    private String nombre;
    private double presupuesto;
    private int numeroIntegrantes;
    //Constructor
    public Proyecto(int codigo, String nombre, double presupuesto, int numeroIntegrantes) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.presupuesto = presupuesto;
        this.numeroIntegrantes = numeroIntegrantes;
    }
//getters y setters
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
public double getPresupuesto() {
    return presupuesto;
}
public void setPresupuesto(double presupuesto) {
    this.presupuesto = presupuesto;
}
public int getNumeroIntegrantes() {
    return numeroIntegrantes;
}
public void setNumeroIntegrantes(int numeroIntegrantes) {
    this.numeroIntegrantes = numeroIntegrantes;
}

@Override
public String toString() {
    return "Proyecto{" +
            "codigo=" + codigo +
            ", nombre='" + nombre + '\'' +
            ", presupuesto=" + presupuesto +
            ", numeroIntegrantes=" + numeroIntegrantes +
            "}\n";

}
    private static final int MAXIMO_PROYECTOS = 10;
    private static Proyecto[] proyectos = new Proyecto[MAXIMO_PROYECTOS];
    private static int numeroProyectos = 0;
    //
    private void agregar(Proyecto nuevoProyecto) {
        if (numeroProyectos < proyectos.length) {
            proyectos[numeroProyectos++] = nuevoProyecto;
        }
    }
    //
    private void insertar(Proyecto nuevoProyecto, int posicion) {
        if (posicion < numeroProyectos && numeroProyectos < proyectos.length) {
            if (posicion == numeroProyectos - 1) {
                proyectos[numeroProyectos++] = nuevoProyecto;
            } else {
                for (int i = numeroProyectos; i > posicion; i--) {
                    proyectos[i] = proyectos[i - 1];
                }
                proyectos[posicion] = nuevoProyecto;
                numeroProyectos++;
            }
        }
    }
    //
    private static Proyecto buscar(int codigo) {
        for (int i = 0; i < numeroProyectos; i++) {
            if (proyectos[i].getCodigo() == codigo) {
                return proyectos[i];
            }
        }
        return null;
    }
    private static Proyecto buscar(String nombre) {
        for (int i = 0; i < numeroProyectos; i++) {
            if (proyectos[i].getNombre().equalsIgnoreCase(nombre)) {
                return proyectos[i];
            }
        }
        return null;
    }

}
public class GestorProyectos {
    public static void main(String[] args) {

    }

    }

