/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator;

public class ViajeBase implements TarifaServicio {
    private final String origen;
    private final String destino;
    private final double distanciaKm;

    public ViajeBase(String origen, String destino, double distanciaKm) {
        this.origen = origen;
        this.destino = destino;
        this.distanciaKm = distanciaKm;
    }

    @Override
    public String obtenerDescripcion() {
        return "Traslado Base (" + origen + " -> " + destino + ", " + distanciaKm + " km)";
    }

    @Override
    public double calcularCosto() {
        return 4500.0 + (distanciaKm * 1300.0);
    }
}