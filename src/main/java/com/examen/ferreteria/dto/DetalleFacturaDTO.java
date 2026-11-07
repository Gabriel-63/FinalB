package com.examen.ferreteria.dto;

import java.math.BigDecimal;
import java.util.Date;

public class DetalleFacturaDTO {
    private Integer idFactura;
    private String clienteNombreCompleto;
    private String articuloNombre;
    private Integer cantidad;
    private BigDecimal precioUnitario;
    private BigDecimal subtotal;
    private Date fechaFactura;

    public DetalleFacturaDTO() {}

    public DetalleFacturaDTO(Integer idFactura, String clienteNombreCompleto, String articuloNombre, Integer cantidad, BigDecimal precioUnitario, BigDecimal subtotal, Date fechaFactura) {
        this.idFactura = idFactura;
        this.clienteNombreCompleto = clienteNombreCompleto;
        this.articuloNombre = articuloNombre;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.subtotal = subtotal;
        this.fechaFactura = fechaFactura;
    }

    public Integer getIdFactura() { return idFactura; }
    public void setIdFactura(Integer idFactura) { this.idFactura = idFactura; }
    public String getClienteNombreCompleto() { return clienteNombreCompleto; }
    public void setClienteNombreCompleto(String clienteNombreCompleto) { this.clienteNombreCompleto = clienteNombreCompleto; }
    public String getArticuloNombre() { return articuloNombre; }
    public void setArticuloNombre(String articuloNombre) { this.articuloNombre = articuloNombre; }
    public Integer getCantidad() { return cantidad; }
    public void setCantidad(Integer cantidad) { this.cantidad = cantidad; }
    public BigDecimal getPrecioUnitario() { return precioUnitario; }
    public void setPrecioUnitario(BigDecimal precioUnitario) { this.precioUnitario = precioUnitario; }
    public BigDecimal getSubtotal() { return subtotal; }
    public void setSubtotal(BigDecimal subtotal) { this.subtotal = subtotal; }
    public Date getFechaFactura() { return fechaFactura; }
    public void setFechaFactura(Date fechaFactura) { this.fechaFactura = fechaFactura; }
} 
