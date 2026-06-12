package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        double distanciaViajeKm = 250.0;

        List<Vehiculo> flota = new ArrayList<>();
        flota.add(new Auto("Mazda", "Mazda 3", 2025, 3, 15500));
        flota.add(new Moto("Kawasaki", "Z900", 2026, 4, 15500));
        flota.add(new AutoElectrico("BYD", "SUV", 2026, 60, 85, 14.8, 950));

        FlotaService flotaService = new FlotaService();
        Vehiculo mejorVehiculo = flotaService.buscarVehiculoMasEconomico(
                flota,
                distanciaViajeKm);


        System.out.println();
        System.out.println("El vehiculo más optimo: " + mejorVehiculo.getDescripcion());
        System.out.println("Costo minimo: "
                + String.format("$%,.2f", mejorVehiculo.calcularCostoViaje(distanciaViajeKm)));
    }
}
