package Semana13;
class Alumno{
    private String foto;
    private String nombre;
    private int edad;
    private int pc1, pc2, pc3, ef;

    //sobreescribiendo el override
    @Override
    public String toString(){
        return  nombre + " - " + edad;
    }
//Constructor
    public Alumno(String foto, String nombre, int edad) {
        this.foto = foto;
        this.nombre = nombre;
        this.edad = edad;
    }
    //getter y setters

    public String getFoto() {
        return foto;
    }
    public void setFoto(String foto) {
        this.foto = foto;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getPc1() {
        return pc1;
    }
    public void setPc1(int pc1) {
        this.pc1 = pc1;
    }
    public int getPc2() {
        return pc2;
    }
    public void setPc2(int pc2) {
        this.pc2 = pc2;
    }
    public int getPc3() {
        return pc3;
    }
    public void setPc3(int pc3) {
        this.pc3 = pc3;
    }
    public int getEf() {
        return ef;
    }
    public void setEf(int ef) {
        this.ef = ef;
    }
    //Metodo de instancia
    public void asignarNota(int[] notas){
        pc1=notas[0];
        pc2=notas[1];
        pc3=notas[2];
        ef=notas[3];
    }
}
//metodo estatico
class Reporte{
    public static void mostrarNotas(Alumno alumno) {
        System.out.printf("%2d-%2d-%2d-%2d ",
                alumno.getPc1(),
                alumno.getPc2(),
                alumno.getPc3(),
                alumno.getEf());
    }
}
public class metodoInstancia {
    public static void main(String[] args) {
    int[] notaAlumno1 = {15,17,14,18};
    Alumno alumno1 = new Alumno("Alex.png","Alex",19);
    alumno1.asignarNota(notaAlumno1);
        System.out.println(alumno1.toString());
    Reporte.mostrarNotas(alumno1);
    }
}
