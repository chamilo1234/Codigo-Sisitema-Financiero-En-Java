package Productos;
import java.time.LocalDate;

public class Cdt extends Productos {
    private int plazo;
    private int saldoCdt;

    public Cdt(int plazo, int saldoCdt, String numeroProducto, LocalDate fechaApertura, double montoInicial, double interes, String nombre, int documentoidentidad, String correoelectronico, String numerocelular, String direccion) {
        super(numeroProducto, fechaApertura, montoInicial, interes, nombre, documentoidentidad, correoelectronico, numerocelular, direccion);
        this.plazo = plazo;
        this.saldoCdt = saldoCdt;
    }



    public int getPlazo() {
        return plazo;
    }

    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }

    public int getSaldoCdt() {
        return saldoCdt;
    }

    public void setSaldoCdt(int saldoCdt) {
        this.saldoCdt = saldoCdt;
    }


    
   

    @Override
    public double calcularSaldo() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
           
    
}

