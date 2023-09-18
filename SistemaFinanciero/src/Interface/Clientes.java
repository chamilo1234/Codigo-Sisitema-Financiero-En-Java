
package Interface;

public class Clientes {
    
    private String nombre;
    private int documentoidentidad;
    private String correoelectronico;
    private String numerocelular;
    private String direccion;

    public Clientes(String nombre, int documentoidentidad, String correoelectronico, String numerocelular, String direccion) {
        this.nombre = nombre;
        this.documentoidentidad = documentoidentidad;
        this.correoelectronico = correoelectronico;
        this.numerocelular = numerocelular;
        this.direccion = direccion;
    }

    public Clientes() {
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDocumentoidentidad() {
        return documentoidentidad;
    }

    public void setDocumentoidentidad(int documentoidentidad) {
        this.documentoidentidad = documentoidentidad;
    }

    public String getCorreoelectronico() {
        return correoelectronico;
    }

    public void setCorreoelectronico(String correoelectronico) {
        this.correoelectronico = correoelectronico;
    }

    public String getNumerocelular() {
        return numerocelular;
    }

 

    public void setNumerocelular(String numerocelular) {
        this.numerocelular = numerocelular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
       
}
