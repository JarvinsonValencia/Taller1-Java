package com.demo.vehiculoService.repository;

import com.demo.vehiculoService.model.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehiculoRepository extends JpaRepository<Vehiculo, Long> {
}