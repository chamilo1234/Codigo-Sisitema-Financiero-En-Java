package Interface;
import Productos.Productos;
import java.time.LocalDate;
public class CuentaAhorros extends Productos implements OperacioFinanciera {
    private double saldoCuentaAhorros;

    public CuentaAhorros(int saldoCuentaAhorros, String numeroProducto, LocalDate fechaApertura, double montoInicial, double interes, String nombre, int documentoidentidad, String correoelectronico, String numerocelular, String direccion) {
        super(numeroProducto, fechaApertura, montoInicial, interes, nombre, documentoidentidad, correoelectronico, numerocelular, direccion);
        this.saldoCuentaAhorros = saldoCuentaAhorros;
    }

    public double getSaldoCuentaAhorros() {
        return saldoCuentaAhorros;
    }

    public void setSaldoCuentaAhorros(double saldoCuentaAhorros) {
        this.saldoCuentaAhorros = saldoCuentaAhorros;
    }

    @Override
    public double calcularSaldo() {
        System.out.println(this.getSaldoCuentaAhorros()*(this.getInteres()/100));
        return saldoCuentaAhorros;
      
    }
    
}
