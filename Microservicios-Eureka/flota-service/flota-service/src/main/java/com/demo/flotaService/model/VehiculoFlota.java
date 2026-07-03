package com.demo.flotaService.model;

public class VehiculoFlota {
    private Long id;
    private String tipoVehiculo;
    private String marca;
    private String modelo;
    private int anio;

    public VehiculoFlota() {
    }

    public VehiculoFlota(Long id, String tipoVehiculo, String marca, String modelo, int anio) {
        this.id = id;
        this.tipoVehiculo = tipoVehiculo;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getDescripcion() {
        return marca + " " + modelo + " (" + anio + ")";
    }
}