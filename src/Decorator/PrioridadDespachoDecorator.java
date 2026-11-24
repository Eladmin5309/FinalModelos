/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator;

public class PrioridadDespachoDecorator extends DecoradorServicio {

    public PrioridadDespachoDecorator(TarifaServicio servicioEnvuelto) {
        super(servicioEnvuelto);
    }

    @Override
    public String obtenerDescripcion() {
        return super.obtenerDescripcion() + " + Despacho Prioritario Express";
    }

    @Override
    public double calcularCosto() {
        return super.calcularCosto() + 4200.0;
    }
}
