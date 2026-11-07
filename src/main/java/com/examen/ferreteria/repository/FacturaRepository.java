package com.examen.ferreteria.repository;

import com.examen.ferreteria.dto.ClienteFacturaDTO;
import com.examen.ferreteria.dto.DetalleFacturaDTO;
import com.examen.ferreteria.entity.Factura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface FacturaRepository extends JpaRepository<Factura, Integer> {

    // Endpoint 3: @Query con JOIN a cliente, solo facturas activas, fecha legible y ordenado por fecha
    @Query("SELECT NEW com.examen.ferreteria.dto.ClienteFacturaDTO(f.idCliente.nombre, f.idCliente.apellido, f.idCliente.nit, f.fechaFactura, f.total) " +
           "FROM Factura f " +
           "WHERE f.estado = true AND f.idCliente.estado = true " +
           "ORDER BY f.fechaFactura ASC")
    List<ClienteFacturaDTO> reporteClienteFactura();

    // Endpoint 4: @Query con tres JOIN implícitos a través de las relaciones de FacturaDetalle, 7 campos y solo facturas activas
    @Query("SELECT NEW com.examen.ferreteria.dto.DetalleFacturaDTO(" +
           "fd.idFactura.idFactura, " +
           "CONCAT(fd.idFactura.idCliente.nombre, ' ', fd.idFactura.idCliente.apellido), " +
           "fd.idArticulo.nombre, " +
           "fd.cantidad, " +
           "fd.precioUnitario, " +
           "fd.subtotal, " +
           "fd.idFactura.fechaFactura) " +
           "FROM FacturaDetalle fd " +
           "WHERE fd.idFactura.estado = true AND fd.idArticulo.estado = true AND fd.idFactura.idCliente.estado = true")
    List<DetalleFacturaDTO> reporteDetalleFacturaCompleto();
}

