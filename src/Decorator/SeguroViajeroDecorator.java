/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator;

public class SeguroViajeroDecorator extends DecoradorServicio {

    public SeguroViajeroDecorator(TarifaServicio servicioEnvuelto) {
        super(servicioEnvuelto);
    }

    @Override
    public String obtenerDescripcion() {
        return super.obtenerDescripcion() + " + Seguro Integral de Viajero";
    }

    @Override
    public double calcularCosto() {
        return super.calcularCosto() + 2800.0;
    }
}
