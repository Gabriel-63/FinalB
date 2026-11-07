package com.examen.ferreteria.repository;

import com.examen.ferreteria.dto.ArticuloCategoriaDTO;
import com.examen.ferreteria.entity.Articulo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ArticuloRepository extends JpaRepository<Articulo, Integer> {

    // Endpoint 1: Filtro por nombre, solo activos (estado = true), sin distinguir mayúsculas/minúsculas
    @Query("SELECT a FROM Articulo a WHERE a.estado = true AND LOWER(a.nombre) LIKE LOWER(CONCAT('%', :nombre, '%'))")
    List<Articulo> findActivosByNombreFiltro(@Param("nombre") String nombre);

    // Endpoint 2: @Query con JOIN a categoría (a.idCategoria), cinco campos, ordenado por categoría y nombre
    @Query("SELECT NEW com.examen.ferreteria.dto.ArticuloCategoriaDTO(a.nombre, a.marca, a.idCategoria.nombre, a.precio, a.stock) " +
           "FROM Articulo a " +
           "WHERE a.estado = true AND a.idCategoria.estado = true " +
           "ORDER BY a.idCategoria.nombre ASC, a.nombre ASC")
    List<ArticuloCategoriaDTO> reporteArticuloCategoria();
}