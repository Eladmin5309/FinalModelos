/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singleton;

import java.util.ArrayList;
import java.util.List;

public class CentralDespachoSingleton {
    private static CentralDespachoSingleton instancia;

    private double tarifaBaseKm;
    private int serviciosDespachados;
    private final List<String> historialServicios;

    private CentralDespachoSingleton() {
        this.tarifaBaseKm = 1800.0;
        this.serviciosDespachados = 0;
        this.historialServicios = new ArrayList<>();
    }

    public static synchronized CentralDespachoSingleton obtenerInstancia() {
        if (instancia == null) {
            instancia = new CentralDespachoSingleton();
        }
        return instancia;
    }

    public void actualizarTarifaBaseKm(double nuevaTarifa) {
        if (nuevaTarifa > 0) {
            this.tarifaBaseKm = nuevaTarifa;
        }
    }

    public String registrarServicio(String vehiculo, String ruta, double km) {
        serviciosDespachados++;
        double costo = km * tarifaBaseKm;
        String registro = String.format(
                "Servicio #%d | Vehiculo: %s | Ruta: %s | Distancia: %.1f km | Total: $%.2f",
                serviciosDespachados, vehiculo, ruta, km, costo
        );
        historialServicios.add(registro);
        return registro;
    }

    public String obtenerEstadoCentral() {
        return String.format(
                "Estado Central [ID Hash: %d] -> Tarifa actual/km: $%.2f | Total despachos: %d",
                System.identityHashCode(this), tarifaBaseKm, serviciosDespachados
        );
    }

    public List<String> obtenerHistorial() {
        return new ArrayList<>(historialServicios);
    }
}