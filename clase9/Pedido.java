package clase9;

import java.util.*;

public class Pedido {
    
    //Atributos

    private Cliente cliente;
    private Producto[] producto;
    private Date fecha;
    private int numeroTarjetaCredito;

    //Constructor
    public Pedido(Cliente cliente, Producto[] producto, Date fecha, int numeroTarjetaCredito ){
        this.cliente = cliente;
        this.producto = producto;
        this.fecha = fecha;
        this.numeroTarjetaCredito = numeroTarjetaCredito;
    }

    //Métodos
    public Cliente getCliente(){
        return cliente;
    }

    public Producto[] getProducto(){
        return producto;
    }

    public Date getFecha(){
        return fecha;
    }

    public int getNumeroTarjetaCredito(){
        return numeroTarjetaCredito;
    }

    // Método toString
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pedido: \n");
        sb.append(cliente.toString()).append("\n");
        sb.append("Fecha: ").append(fecha).append("\n");
        sb.append("Numero de tarjeta de credito: ").append(numeroTarjetaCredito).append("\n");
        sb.append("Productos: \n");
        for (Producto p : producto) {
            sb.append(p.toString()).append("\n");
        }
        return sb.toString();
    }    
}