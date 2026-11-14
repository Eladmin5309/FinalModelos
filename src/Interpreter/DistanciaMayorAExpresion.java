/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interpreter;

public class DistanciaMayorAExpresion implements ReglaExpresion {

    private final double kilometrosMinimos;

    public DistanciaMayorAExpresion(double kilometrosMinimos) {
        this.kilometrosMinimos = kilometrosMinimos;
    }

    @Override
    public boolean interpretar(ViajeContext contexto) {
        return contexto.getDistanciaKm() > this.kilometrosMinimos;
    }
}
