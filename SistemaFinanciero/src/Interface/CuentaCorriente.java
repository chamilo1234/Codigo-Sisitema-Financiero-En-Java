package Interface;
import Productos.Productos;
import java.time.LocalDate;
public class CuentaCorriente extends Productos implements OperacioFinanciera {
    private double saldoCuentaCorriente;
    private int sobregiro;
    private double tiempoSobregiro;

    public CuentaCorriente(double saldoCuentaCorriente, int sobregiro, double tiempoSobregiro, String numeroProducto, LocalDate fechaApertura, double montoInicial, double interes, String nombre, int documentoidentidad, String correoelectronico, String numerocelular, String direccion) {
        super(numeroProducto, fechaApertura, montoInicial, interes, nombre, documentoidentidad, correoelectronico, numerocelular, direccion);
        this.saldoCuentaCorriente = saldoCuentaCorriente;
        this.sobregiro = sobregiro;
        this.tiempoSobregiro = tiempoSobregiro;
    }

    public double getSaldoCuentaCorriente() {
        return saldoCuentaCorriente;
    }

    public void setSaldoCuentaCorriente(double saldoCuentaCorriente) {
        this.saldoCuentaCorriente = saldoCuentaCorriente;
    }

    public int getSobregiro() {
        return sobregiro;
    }

    public void setSobregiro(int sobregiro) {
        this.sobregiro = sobregiro;
    }

    public double getTiempoSobregiro() {
        return tiempoSobregiro;
    }

    public void setTiempoSobregiro(double tiempoSobregiro) {
        this.tiempoSobregiro = tiempoSobregiro;
    }









    @Override
    public double calcularSaldo() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
