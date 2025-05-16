package clase9;

import java.time.LocalDate;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<Producto> productos;
    private LocalDate fecha;
    private int numeroTarjetaCredito;

    public Pedido(Cliente cliente, List<Producto> productos, LocalDate fecha, int numeroTarjetaCredito) {
        if (cliente == null) {
            throw new IllegalArgumentException("El cliente no puede ser nulo");
        }
        if (productos == null || productos.isEmpty()) {
            throw new IllegalArgumentException("La lista de productos no puede ser nula o vacía");
        }
        if (fecha == null) {
            throw new IllegalArgumentException("La fecha no puede ser nula");
        }
        this.cliente = cliente;
        this.productos = productos;
        this.fecha = fecha;
        this.numeroTarjetaCredito = numeroTarjetaCredito;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public int getNumeroTarjetaCredito() {
        return numeroTarjetaCredito;
    }

    @Override
    public String toString() {
        String tarjetaEnmascarada = "**** **** **** " + String.valueOf(numeroTarjetaCredito).substring(Math.max(0, String.valueOf(numeroTarjetaCredito).length() - 4));
        return "Pedido{" +
                "cliente=" + cliente +
                ", productos=" + productos +
                ", fecha=" + fecha +
                ", numeroTarjetaCredito=" + tarjetaEnmascarada +
                '}';
    }
}