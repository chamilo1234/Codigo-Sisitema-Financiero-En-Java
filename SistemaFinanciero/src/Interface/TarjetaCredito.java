package Interface;
import Productos.Productos;
import java.time.LocalDate;

public class TarjetaCredito extends Productos implements OperacioFinanciera {
    private LocalDate fechaVencimiento;
    private int cupo;
    private int valorUtilizado;

    public TarjetaCredito(LocalDate fechaVencimiento, int cupo, int valorUtilizado, String numeroProducto, LocalDate fechaApertura, double montoInicial, double interes, String nombre, int documentoidentidad, String correoelectronico, String numerocelular, String direccion) {
        super(numeroProducto, fechaApertura, montoInicial, interes, nombre, documentoidentidad, correoelectronico, numerocelular, direccion);
        this.fechaVencimiento = fechaVencimiento;
        this.cupo = cupo;
        this.valorUtilizado = valorUtilizado;
    }


 


    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public int getCupo() {
        return cupo;
    }

    public void setCupo(int cupo) {
        this.cupo = cupo;
    }

    public int getValorUtilizado() {
        return valorUtilizado;
    }

    public void setValorUtilizado(int valorUtilizado) {
        this.valorUtilizado = valorUtilizado;
    }


    
    /*
    @Override
    public double calcularCuota() {
        double cuota = 0;
        cuota = (this.getMonto() + this.getMonto() * (this.getPorcentajeInteres() / 100)) 
                / this.getPlazo();
        return cuota;
    }
*/

    @Override
    public double calcularSaldo() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
