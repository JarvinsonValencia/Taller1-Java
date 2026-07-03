package com.demo.flotaService.model;

import com.demo.flotaService.model.VehiculoFlota;

public class CotizacionFlota {
        private VehiculoFlota vehiculo;
        private boolean puedeRealizarViaje;
        private double costo;
        private String mensaje;

        public CotizacionFlota() {
        }

        public CotizacionFlota(VehiculoFlota vehiculo, boolean puedeRealizarViaje,
                        double costo, String mensaje) {
                this.vehiculo = vehiculo;
                this.puedeRealizarViaje = puedeRealizarViaje;
                this.costo = costo;
                this.mensaje = mensaje;
        }

        public VehiculoFlota getVehiculo() {
                return vehiculo;
        }

        public void setVehiculo(VehiculoFlota vehiculo) {
                this.vehiculo = vehiculo;
        }

        public boolean isPuedeRealizarViaje() {
                return puedeRealizarViaje;
        }

        public void setPuedeRealizarViaje(boolean puedeRealizarViaje) {
                this.puedeRealizarViaje = puedeRealizarViaje;
        }

        public double getCosto() {
                return costo;
        }

        public void setCosto(double costo) {
                this.costo = costo;
        }

        public String getMensaje() {
                return mensaje;
        }

        public void setMensaje(String mensaje) {
                this.mensaje = mensaje;
        }
}