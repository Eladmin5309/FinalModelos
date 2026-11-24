/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Flyweight;

public class UnidadFlota {
    // Estado extrinseco: cambia en cada unidad de la flota
    private final String placa;
    private final double latitud;
    private final double longitud;
    private final String estadoOperativo;
    private final TipoVehiculoFlyweight tipoCompartido;

    public UnidadFlota(String placa, double latitud, double longitud, String estadoOperativo, TipoVehiculoFlyweight tipoCompartido) {
        this.placa = placa;
        this.latitud = latitud;
        this.longitud = longitud;
        this.estadoOperativo = estadoOperativo;
        this.tipoCompartido = tipoCompartido;
    }

    public String renderizarTelemetria() {
        return tipoCompartido.mostrarEnMapa(placa, latitud, longitud, estadoOperativo);
    }
}
