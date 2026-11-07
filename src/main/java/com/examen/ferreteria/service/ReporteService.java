package com.examen.ferreteria.service;

import com.examen.ferreteria.dto.ArticuloCategoriaDTO;
import com.examen.ferreteria.dto.ClienteFacturaDTO;
import com.examen.ferreteria.dto.DetalleFacturaDTO;
import com.examen.ferreteria.entity.Articulo;
import com.examen.ferreteria.repository.ArticuloRepository;
import com.examen.ferreteria.repository.FacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ReporteService {

    @Autowired
    private ArticuloRepository articuloRepository;

    @Autowired
    private FacturaRepository facturaRepository;

    public List<Articulo> listarArticulosPorFiltro(String nombre) {
        return articuloRepository.findActivosByNombreFiltro(nombre);
    }

    public List<ArticuloCategoriaDTO> obtenerReporteArticuloCategoria() {
        return articuloRepository.reporteArticuloCategoria();
    }

    public List<ClienteFacturaDTO> obtenerReporteClienteFactura() {
        return facturaRepository.reporteClienteFactura();
    }

    public List<DetalleFacturaDTO> obtenerReporteDetalleFactura() {
        return facturaRepository.reporteDetalleFacturaCompleto();
    }
} 