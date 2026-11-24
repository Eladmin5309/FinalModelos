/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator;

public abstract class DecoradorServicio implements TarifaServicio {
    protected TarifaServicio servicioEnvuelto;

    public DecoradorServicio(TarifaServicio servicioEnvuelto) {
        this.servicioEnvuelto = servicioEnvuelto;
    }

    @Override
    public String obtenerDescripcion() {
        return servicioEnvuelto.obtenerDescripcion();
    }

    @Override
    public double calcularCosto() {
        return servicioEnvuelto.calcularCosto();
    }
}
