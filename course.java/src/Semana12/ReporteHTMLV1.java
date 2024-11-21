package Semana12;
class Alumno{
    //Atributos
    private String foto;
    private String nombre;
    private int edad,practica1,practica2,practica3,examenfinal;
    //getters y setters
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
    public int getPractica1() {
        return practica1;
    }
    public void setPractica1(int practica1) {
        this.practica1 = practica1;
    }
    public int getPractica2() {
        return practica2;
    }
    public void setPractica2(int practica2) {
        this.practica2 = practica2;
    }
    public int getPractica3() {
        return practica3;
    }
    public void setPractica3(int practica3) {
        this.practica3 = practica3;
    }
    public int getExamenfinal() {
        return examenfinal;
    }
    public void setExamenfinal(int examenfinal) {
        this.examenfinal = examenfinal;
    }
    //constructor parametrizado completo
    public Alumno(String foto, String nombre, int edad, int practica1, int practica2, int practica3, int examenfinal) {
        this.foto = foto;
        this.nombre = nombre;
        this.edad = edad;
        this.practica1 = practica1;
        this.practica2 = practica2;
        this.practica3 = practica3;
        this.examenfinal = examenfinal;
    }
}
public class ReporteHTMLV1 {
    public static void main(String[] args) {
    Alumno alumno = new Alumno("foto1","Ruby",22,15,18,13,15);
        String html = String.format(
                """
                <!DOCTYPE html>
                <html lang="en">
                <head>
                    <meta charset="UTF-8">
                    <title>Reporte de Alumno</title>
                </head>
                <body>
                    <h1>Reporte de Notas</h1>
                    <table border="1">
                        <tr>
                            <th>Foto</th>
                            <th>Nombre</th>
                            <th>Edad</th>
                            <th>PC1</th>
                            <th>PC2</th>
                            <th>PC3</th>
                            <th>EF</th>
                        </tr>
                        <tr>
                            <td><img src="%s" alt="Foto" width="50"></td>
                            <td>%s</td>
                            <td>%d</td>
                            <td>%d</td>
                            <td>%d</td>
                            <td>%d</td>
                            <td>%d</td>
                        </tr>
                    </table>
                </body>
                </html>
                """,
                alumno.getFoto(),
                alumno.getNombre(),
                alumno.getEdad(),
                alumno.getPractica1(),
                alumno.getPractica2(),
                alumno.getPractica3(),
                alumno.getExamenfinal()
        );
        // Imprimir el HTML en consola
        System.out.println(html);

    }
}
