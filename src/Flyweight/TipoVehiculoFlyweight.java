/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Flyweight;

public class TipoVehiculoFlyweight {
    // Estado intrinseco: inmutable y compartido entre miles de unidades
    private final String categoria;
    private final String modeloEstandar;
    private final int capacidadPasajeros;
    private final double tarifaBaseKm;

    public TipoVehiculoFlyweight(String categoria, String modeloEstandar, int capacidadPasajeros, double tarifaBaseKm) {
        this.categoria = categoria;
        this.modeloEstandar = modeloEstandar;
        this.capacidadPasajeros = capacidadPasajeros;
        this.tarifaBaseKm = tarifaBaseKm;
    }

    // Recibe el estado extrinseco (unico por cada vehiculo) por parametros
    public String mostrarEnMapa(String placa, double latitud, double longitud, String estadoOperativo) {
        return String.format(
                "[%s | %s - Cap: %d pax - $%.0f/km] -> Placa: %s | GPS: (%.4f, %.4f) | Estado: %s | RefMem: %d",
                categoria, modeloEstandar, capacidadPasajeros, tarifaBaseKm,
                placa, latitud, longitud, estadoOperativo, System.identityHashCode(this)
        );
    }

    public String getCategoria() {
        return categoria;
    }
}