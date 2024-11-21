package Semana15;
import java.util.Date;
class CuentaBancaria {
    // Atributos privados
    private String numeroCuenta;
    private Date fechaApertura;
    private float saldoActual;

    // Constructor completo
    public CuentaBancaria(String numeroCuenta, Date fechaApertura, float saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.fechaApertura = fechaApertura;
        this.saldoActual = saldoActual;
    }

    // Getters
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public Date getFechaApertura() {
        return fechaApertura;
    }

    public float getSaldoActual() {
        return saldoActual;
    }

    // Metodo toString
    @Override
    public String toString() {
        return "Número de cuenta: " + numeroCuenta + " - Saldo: " + saldoActual;
    }
}

class Cliente {
    // Atributos privados
    private String dni;
    private String apellidos;
    private String nombres;
    private String correoElectronico;
    private String direccion;
    private Date fechaNacimiento;
    private CuentaBancaria[] cuentas = new CuentaBancaria[5]; // Hasta 5 cuentas
    private int numeroCuentas = 0; // Para llevar el control de cuentas añadidas

    // Constructor vacío
    public Cliente() {}

    // Constructor parametrizado
    public Cliente(String dni, String apellidos, String nombres, String correoElectronico, String direccion, Date fechaNacimiento) {
        this.dni = dni;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.correoElectronico = correoElectronico;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
    }

    // Constructor completo
    public Cliente(String dni, String apellidos, String nombres, String correoElectronico, String direccion, Date fechaNacimiento, CuentaBancaria[] cuentas) {
        this(dni, apellidos, nombres, correoElectronico, direccion, fechaNacimiento);
        this.cuentas = cuentas;
        this.numeroCuentas = cuentas.length;
    }

    // Getters y setters
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    // Metodo agregarCuenta
    public void agregarCuenta(CuentaBancaria nuevaCuenta) throws Exception {
        if (numeroCuentas >= 5) {
            System.out.println("Error: No se pueden agregar más de 5 cuentas.");
            return; // Sale del método sin agregar la cuenta
        }
        cuentas[numeroCuentas] = nuevaCuenta;
        numeroCuentas++;
    }

    // Metodo toString
    @Override
    public String toString() {
        return dni + " - " + apellidos + ", " + nombres + " (" + correoElectronico + ") - [" + numeroCuentas + " cuentas]";
    }

    // Metodo mostrarCuentas
    public void mostrarCuentas() {
        System.out.println("Cuentas del cliente:");
        for (int i = 0; i < numeroCuentas; i++) {
            System.out.println(cuentas[i].toString());
        }
    }
}
public class BancoUML {
    public static void main(String[] args) throws Exception {
        // Crear cuentas bancarias
        CuentaBancaria cuenta1 = new CuentaBancaria("123456", new Date(), 1000.50f);
        CuentaBancaria cuenta2 = new CuentaBancaria("789012", new Date(), 2500.75f);

        // Crear cliente
        Cliente cliente = new Cliente("12345678", "Pérez", "Juan", "juan.perez@mail.com", "Av. Siempre Viva 123", new Date());

        // Agregar cuentas al cliente
        cliente.agregarCuenta(cuenta1);
        cliente.agregarCuenta(cuenta2);

        // Mostrar información del cliente
        System.out.println(cliente.toString());

        // Mostrar las cuentas del cliente
        cliente.mostrarCuentas();
    }
}
