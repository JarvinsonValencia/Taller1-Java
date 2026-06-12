package ejercicio1;

import java.util.List;

public class FlotaService {
    public Vehiculo buscarVehiculoMasEconomico(List<Vehiculo> vehiculos, double kilometros) {
        Vehiculo vehiculoMasEconomico = null;
        double costoMasBajo = 0;

        for (Vehiculo vehiculo : vehiculos) {

            double costo = vehiculo.calcularCostoViaje(kilometros);

            if (vehiculoMasEconomico == null || costo < costoMasBajo) {
                costoMasBajo = costo;
                vehiculoMasEconomico = vehiculo;
            }
        }

        return vehiculoMasEconomico;
    }
}
