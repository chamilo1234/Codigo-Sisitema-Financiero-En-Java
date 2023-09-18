package Interface;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import Productos.CuentaAhorros;
public class Banco {
   
    public static void main(String[] args) {
     Scanner teclado = new Scanner(System.in);  
     //Definir variables
     String nombre = null;
     int documentoidentidad = 0;
     String correoelectronico = null;
     String numerocelular = null;
     String direccion = null;
     String numeroProducto = null;
     LocalDate fechaApertura = null;
     double montoInicial = 0;
     double interes = 0;
     int saldoCuentaAhorros = 0;
     int saldoCuentaCorriente = 0;
     int plazo = 0;
     int saldoCdt = 0;
     int cupo = 0;
     int valorUtilizado = 0;
     int sobregiro = 0;
     int comparaciondocumento = 0;
     int eleccion = 0;
     double cuota = 0;
     LocalDate fechaVencimiento = null;
     double tiempoSobregiro = 0;

     Productos productos = new Productos( numeroProducto, fechaApertura, montoInicial,  interes);
     CuentaAhorros cuentaAhorros = new CuentaAhorros(  saldoCuentaAhorros,  numeroProducto,  fechaApertura,  montoInicial, interes,  nombre, documentoidentidad, correoelectronico, numerocelular, direccion);
     CuentaCorriente cuentaCorriente = new CuentaCorriente(  saldoCuentaCorriente,  sobregiro,  tiempoSobregiro,  numeroProducto,  fechaApertura,  montoInicial,  interes,  nombre,  documentoidentidad,  correoelectronico,  numerocelular,  direccion);
     TarjetaCredito tarjeta = new TarjetaCredito(fechaVencimiento,  cupo,  valorUtilizado, numeroProducto,  fechaApertura,  montoInicial,  interes,  nombre,  documentoidentidad,  correoelectronico,  numerocelular, direccion);
     Cdt cdt = new Cdt( plazo,  saldoCdt,  numeroProducto,  fechaApertura,  montoInicial, interes, nombre, documentoidentidad, correoelectronico,  numerocelular, direccion );
     Clientes cliente = new Clientes();
     


     System.out.println("Por favor Ingrese Su Numero De Documento");
     comparaciondocumento = teclado.nextInt();
    
     if (comparaciondocumento == cliente.getDocumentoidentidad() ) { 
             System.out.println("No Existes En La Base De Datos");
        } else {
         
            cliente.setNombre("Jennifer Ortiz Rodriguez");
            cliente.setDocumentoidentidad(1025478965);
            cliente.setCorreoelectronico("JenniferOrtiz@gmail.com");
            cliente.setNumerocelular("3223068754");
            cliente.setDireccion("Carrera 1 Numero 57-27");

            do {
            System.out.println("Hola Bienvenido A Tu Sistema Bancario");
            System.out.println("Elige Una Opcion De Producto:");
            System.out.println("1. Cuenta De Ahorro");
            System.out.println("2. Cuenta Corriente");
            System.out.println("3. CDT");
            System.out.println("4. Tarjeta De Credito");
            System.out.println("5. Salir");
            eleccion = teclado.nextInt();

            switch (eleccion) {
                case 1 -> {
                    System.out.println("--------------------------------------------------------");
                    System.out.println("Datos Personales De Su Cuenta De Ahorros:");
                    System.out.println("Nombre: " + cliente.getNombre());
                    System.out.println("Documento Identidad: " + cliente.getDocumentoidentidad());
                    System.out.println("Correo Electronico: " + cliente.getCorreoelectronico());
                    System.out.println("Numero De Celular: " + cliente.getNumerocelular());
                    System.out.println("Direccion: " + cliente.getDireccion());
                    System.out.println("Informacion Cuenta De Ahorros ");
                    productos.setNumeroProducto("32214587");
                    System.out.println("Numero Cuenta "+productos.getNumeroProducto());
                    productos.ingresarFecha();
                    System.out.println("Fecha De La Cuenta :"+productos.getFechaApertura());  
                    cuentaAhorros.setMontoInicial(100000);                 
                    cuentaAhorros.setSaldoCuentaAhorros(cuentaAhorros.getMontoInicial());                    
                    System.out.println("Saldo Actual De La Cuenta "+cuentaAhorros.getSaldoCuentaAhorros());
                    cuentaAhorros.setInteres(3);                    
                    System.out.println("Su Interes Es Del "+cuentaAhorros.getInteres()+ "%");
                    double interesAhorro = cuentaAhorros.getSaldoCuentaAhorros()*(cuentaAhorros.getInteres()/100);          
                    double sumaAhorroInteres = cuentaAhorros.getSaldoCuentaAhorros()+ interesAhorro;
                    System.out.println("El Saldo Mas Los Interes Para El Mes 1 Es De: "+ sumaAhorroInteres);                
                    cuentaAhorros.setSaldoCuentaAhorros(sumaAhorroInteres);
                    double interesAhorro2 = cuentaAhorros.getSaldoCuentaAhorros()*(cuentaAhorros.getInteres()/100);              
                    double sumaAhorroInteres2 = cuentaAhorros.getSaldoCuentaAhorros()+ interesAhorro2;
                    System.out.println("El Saldo Mas Los Interes Para El Mes 2 Es De: "+ sumaAhorroInteres2);
                    System.out.println("---------------------------------------------------------");
                }
          
                case 2 ->
                {
                    System.out.println("----------------------------------------------------------------");
                    System.out.println("Datos Personales De Su Cuenta Corriente:");
                    System.out.println("Nombre: " + cliente.getNombre());
                    System.out.println("Documento Identidad: " + cliente.getDocumentoidentidad());
                    System.out.println("Correo electronico: " + cliente.getCorreoelectronico());
                    System.out.println("Numero de celular: " + cliente.getNumerocelular());
                    System.out.println("Direccion: " + cliente.getDireccion());
                    System.out.println("Creacion De Su Cuenta Corriente ");
                    productos.setNumeroProducto("14895");
                    System.out.println("Numero Cuenta "+productos.getNumeroProducto());
                    productos.ingresarFecha();
                    System.out.println("Fecha De La Cuenta :"+productos.getFechaApertura());
                    cuentaCorriente.setMontoInicial(100000);                  
                    cuentaCorriente.setInteres(3);
                    cuentaCorriente.setSaldoCuentaCorriente(cuentaCorriente.getMontoInicial());
                    //retiro 
                    System.out.println("El Usuario Tuvo Un Retido 100000");
                    double RetiroCuentaCorriente = cuentaCorriente.getSaldoCuentaCorriente()-100000;
                    cuentaCorriente.setSaldoCuentaCorriente(RetiroCuentaCorriente);
                    
                    //cuentaCorriente.setSaldoCuentaCorriente(cuentaCorriente.getMontoInicial());                    
                    System.out.println("Saldo Actual De La Cuenta "+cuentaCorriente.getSaldoCuentaCorriente());
                    
                    //en vista que no tiene saldo hace sobregiro con un topoe 
                    System.out.println("Su Valor Permitido De Sobregiro Es De 1.000.000:");
                    if(cuentaCorriente.getSobregiro() >= 1000000 ){
                        System.out.println("Usted Ah Ocupado El Monto Maximo De Sobregiro Que Es 1000000 ");               
                    } else {
                        cuentaCorriente.setSobregiro(500000);
                    }
                    System.out.println("Sobre giro actual "+cuentaCorriente.getSobregiro());
                    //cliente va a pagar el sobregiro para lo cual se calcula los interes del sobregiro en un plazo de 3 meses

                    cuentaCorriente.setTiempoSobregiro(3);
                    double interesSobregiro = (cuentaCorriente.getSobregiro()*(cuentaCorriente.getInteres()/100))*cuentaCorriente.getTiempoSobregiro();          
                    double sumaInteressobregiro = cuentaCorriente.getSobregiro()+ interesSobregiro;
                    System.out.println("El Interes aplicado por el sobregiro : "+interesSobregiro);
                    System.out.println("El Monto A Pagar Es: "+sumaInteressobregiro);
                    System.out.println("--------------------------------------------------------------------------");                  
                }
                case 3 ->
                {
                    System.out.println("-----------------------------------------");
                    System.out.println("Datos del Cliente CDT:");
                    System.out.println("Nombre: " + cliente.getNombre());
                    System.out.println("Documento Identidad: " + cliente.getDocumentoidentidad());
                    System.out.println("Correo Electronico: " + cliente.getCorreoelectronico());
                    System.out.println("Numero De Celular: " + cliente.getNumerocelular());
                    System.out.println("Direccion: " + cliente.getDireccion());
                    System.out.println("Creacion De Su CDT");
                    productos.setNumeroProducto("789652");
                    System.out.println("Numero De CDT "+productos.getNumeroProducto());
                    productos.ingresarFecha();
                    System.out.println("Fecha Del Cdt :"+productos.getFechaApertura()); 
                    //recibir del cliente el dinero al momento de abrir el producto cdt          
                    cdt.setSaldoCdt(5000000);
                    productos.setInteres(5); 
                    double interesCdt =cdt.getSaldoCdt()*(productos.getInteres()/100);
                    double SumaCdtInteres = cdt.getSaldoCdt()+ interesCdt;
                    System.out.println("\n  El Cliente Adquiere Un Cdt Por Valor: "+cdt.getSaldoCdt()+
                            "\n Al Momento De La Adquision Tiene Un Interes De: "+productos.getInteres()+
                            "\n Finalizado El Plazo Del Cdt Se Le Entrega Un Total De: "+SumaCdtInteres);
                    System.out.println("-----------------------------------------");
                }
                case 4 ->
                {
                    System.out.println("-----------------------------------------");
                    System.out.println("Datos del Cliente Tarjeta De Credito:");
                    System.out.println("Nombre: " + cliente.getNombre());
                    System.out.println("Documento Identidad: " + cliente.getDocumentoidentidad());
                    System.out.println("Correo Electronico: " + cliente.getCorreoelectronico());
                    System.out.println("Numero De Celular: " + cliente.getNumerocelular());
                    System.out.println("Direccion: " + cliente.getDireccion());
                    System.out.println("-----------------------------------------");
                    productos.setNumeroProducto("1459875");
                    System.out.println("Numero De Tarjeta: "+productos.getNumeroProducto());
                    
                    productos.setFechaApertura(LocalDate.now());
                    System.out.println("Fecha Apertuda: "+productos.getFechaApertura());
                    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    tarjeta.setFechaVencimiento(LocalDate.parse("01/01/2024", formato));
                    System.out.println("Fecha Vencimiento: " +tarjeta.getFechaVencimiento());
                    
                    
                    productos.setInteres(5);
                    //se le asigna el cupo de 5000000
                    tarjeta.setCupo(5000000);
                    //se utiliza la tarjeta por un valor de 100000
                    tarjeta.setValorUtilizado(1000000);
                    
                    //cupo disponible
                    double cupoDisponible=(tarjeta.getCupo()-tarjeta.getValorUtilizado());
                    //se calcula el interes del uso 
                    double InteresTarjeta =(tarjeta.getValorUtilizado()*(productos.getInteres()/100));
                    //valor a pagar
                    
                    System.out.println("\n El Cliente Tiene Un Cupo De: "+tarjeta.getCupo()+
                            "\n El Cliente Utiiza La Tarjeta Por Un Valor De: "+tarjeta.getValorUtilizado()+
                            "\n Ahora El Cliente Tiene Un Cupo Disponible De: "+cupoDisponible +
                            "\n Se Genera Un Interes De :"+InteresTarjeta);
                    
                    System.out.println("-----------------------------------------");

                }
                 
            }
        } while (eleccion != 5);
            System.out.println("Gracias Por Utilizar Nuestros Servicios.");

  
    }

}

}


