package com.examen.ferreteria.dto;

import java.math.BigDecimal;
import java.util.Date;

public class ClienteFacturaDTO {
    private String nombreCliente;
    private String apellidoCliente;
    private String nit;
    private Date fechaFactura;
    private BigDecimal totalFactura;

    public ClienteFacturaDTO() {}

    public ClienteFacturaDTO(String nombreCliente, String apellidoCliente, String nit, Date fechaFactura, BigDecimal totalFactura) {
        this.nombreCliente = nombreCliente;
        this.apellidoCliente = apellidoCliente;
        this.nit = nit;
        this.fechaFactura = fechaFactura;
        this.totalFactura = totalFactura;
    }

    public String getNombreCliente() { return nombreCliente; }
    public void setNombreCliente(String nombreCliente) { this.nombreCliente = nombreCliente; }
    public String getApellidoCliente() { return apellidoCliente; }
    public void setApellidoCliente(String apellidoCliente) { this.apellidoCliente = apellidoCliente; }
    public String getNit() { return nit; }
    public void setNit(String nit) { this.nit = nit; }
    public Date getFechaFactura() { return fechaFactura; }
    public void setFechaFactura(Date fechaFactura) { this.fechaFactura = fechaFactura; }
    public BigDecimal getTotalFactura() { return totalFactura; }
    public void setTotalFactura(BigDecimal totalFactura) { this.totalFactura = totalFactura; }
}
