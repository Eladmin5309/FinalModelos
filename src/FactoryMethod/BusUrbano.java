package FactoryMethod;

public class BusUrbano implements Vehiculo {
    @Override
    public String asignarRuta(String origen, String destino) {
        return "Bus Urbano asignado en corredor troncal: " + origen + " -> " + destino;
    }

    @Override
    public double calcularTarifa(double distanciaKm) {
        return 3100.0; // Tarifa plana urbana
    }
}