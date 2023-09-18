package Interface;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Productos {
    private String numeroProducto;
    LocalDate fechaApertura;
    double montoInicial;
    private double interes;

    public Productos(String numeroProducto, LocalDate fechaApertura, double montoInicial, double interes) {
        this.numeroProducto = numeroProducto;
        this.fechaApertura = fechaApertura;
        this.montoInicial = montoInicial;
        this.interes = interes;
    }

    public String getNumeroProducto() {
        return numeroProducto;
    }

    public void setNumeroProducto(String numeroProducto) {
        this.numeroProducto = numeroProducto;
    }

    public LocalDate getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(LocalDate fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public double getMontoInicial() {
        return montoInicial;
    }

    public void setMontoInicial(double montoInicial) {
        this.montoInicial = montoInicial;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public void ingresarFecha() {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese una fecha en el formato "dd/mm/yyyy"
        System.out.print("Ingrese La Fecha De Creacion En El Siguiente Formato (dd/mm/yyyy): ");
        String fechaStr = scanner.nextLine();

        // Definir el formato de fecha esperado
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {
            // Parsear la fecha ingresada por el usuario
            fechaApertura = LocalDate.parse(fechaStr, formatter);
        } catch (java.time.format.DateTimeParseException e) {
            System.out.println("Formato de fecha incorrecto. Debe ser 'dd/mm/yyyy'.");
        }

       
    }

    public void calcularDiasTranscurridos() {
        if (fechaApertura != null) {
            // Obtener la fecha actual
            LocalDate fechaActual = LocalDate.now();

            // Calcular los días transcurridos
            long diasTranscurridos = ChronoUnit.DAYS.between(fechaApertura, fechaActual);

            // Mostrar el resultado
            System.out.println("Dias transcurridos hasta hoy: " + diasTranscurridos);
        } else {
            System.out.println("Primero ingrese la fecha de ingreso.");
        }
    }

    void fechaApertura() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
       



}
