/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bridge;

public class MotorCombustion implements MotorTraccion {
    @Override
    public String obtenerTipoPropulsion() {
        return "Motor Combustion Diesel Euro VI";
    }

    @Override
    public double calcularFactorCostoKm() {
        return 1650.0;
    }

    @Override
    public String verificarDisponibilidadEnergetica() {
        return "Tanque de combustible al 85%";
    }
}
