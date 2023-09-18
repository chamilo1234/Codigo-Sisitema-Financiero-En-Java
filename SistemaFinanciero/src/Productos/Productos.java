package Productos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public abstract class Productos extends Clientes {
    private String numeroProducto;
    LocalDate fechaApertura;
    public double montoInicial;
    public double interes;

    public Productos(String numeroProducto, LocalDate fechaApertura, double montoInicial, double interes, String nombre, int documentoidentidad, String correoelectronico, String numerocelular, String direccion) {
        super(nombre, documentoidentidad, correoelectronico, numerocelular, direccion);
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
    

     
     
   
       
    //Definición del método abstractto de la clase abstracto
    @Override
    public abstract double  calcularSaldo();
}
