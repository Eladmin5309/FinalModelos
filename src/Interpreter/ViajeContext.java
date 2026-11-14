/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interpreter;

public class ViajeContext {

    private final double distanciaKm;
    private final boolean horaPico;
    private final String nivelUsuario; // "REGULAR", "VIP"
    private final String tipoVehiculo; // "ECONOMICO", "PREMIUM"

    public ViajeContext(double distanciaKm, boolean horaPico, String nivelUsuario, String tipoVehiculo) {
        this.distanciaKm = distanciaKm;
        this.horaPico = horaPico;
        this.nivelUsuario = nivelUsuario;
        this.tipoVehiculo = tipoVehiculo;
    }

    public double getDistanciaKm() {
        return distanciaKm;
    }

    public boolean isHoraPico() {
        return horaPico;
    }

    public String getNivelUsuario() {
        return nivelUsuario;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }
}
