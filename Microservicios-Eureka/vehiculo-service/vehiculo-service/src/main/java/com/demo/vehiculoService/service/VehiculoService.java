package com.demo.vehiculoService.service;

import java.util.List;
import java.util.Optional;

import com.demo.vehiculoService.model.Auto;
import com.demo.vehiculoService.model.AutoElectrico;
import com.demo.vehiculoService.model.Moto;
import com.demo.vehiculoService.model.Vehiculo;
import com.demo.vehiculoService.repository.VehiculoRepository;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;

@Service
public class VehiculoService {
    private final VehiculoRepository vehiculoRepository;

    public VehiculoService(VehiculoRepository vehiculoRepository) {
        this.vehiculoRepository = vehiculoRepository;
    }

    @PostConstruct
    public void cargarDatosIniciales() {
        if (vehiculoRepository.count() > 0) {
            return;
        }

        crear(new Auto("Toyota", "Corolla", 2022, 6.5, 15500));
        crear(new Moto("Yamaha", "FZ", 2021, 3.2, 15500));
        crear(new AutoElectrico("Tesla", "Model 3", 2024, 60, 85, 14.8, 950));
    }

    public List<Vehiculo> listar() {
        return vehiculoRepository.findAll();
    }

    public Optional<Vehiculo> buscarPorId(Long id) {
        return vehiculoRepository.findById(id);
    }

    public Vehiculo crear(Vehiculo vehiculo) {
        return vehiculoRepository.save(vehiculo);
    }

    public Optional<Vehiculo> actualizar(Long id, Vehiculo vehiculo) {
        if (!vehiculoRepository.existsById(id)) {
            return Optional.empty();
        }
        vehiculo.setId(id);
        return Optional.of(vehiculoRepository.save(vehiculo));
    }

    public boolean eliminar(Long id) {
        if (!vehiculoRepository.existsById(id)) {
            return false;
        }

        vehiculoRepository.deleteById(id);
        return true;
    }
}