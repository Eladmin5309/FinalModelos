/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator;

public class EquipajeExtraDecorator extends DecoradorServicio {

    public EquipajeExtraDecorator(TarifaServicio servicioEnvuelto) {
        super(servicioEnvuelto);
    }

    @Override
    public String obtenerDescripcion() {
        return super.obtenerDescripcion() + " + Bodega Equipaje Extra";
    }

    @Override
    public double calcularCosto() {
        return super.calcularCosto() + 3500.0;
    }
}
