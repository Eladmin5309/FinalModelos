/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bridge;

public class MotorElectrico implements MotorTraccion {
    @Override
    public String obtenerTipoPropulsion() {
        return "Propulsion 100% Electrica (Cero Emisiones)";
    }

    @Override
    public double calcularFactorCostoKm() {
        return 1100.0;
    }

    @Override
    public String verificarDisponibilidadEnergetica() {
        return "Bateria al 92% - Autonomia optima";
    }
}