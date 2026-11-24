/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bridge;

public class MotorHibrido implements MotorTraccion {
    @Override
    public String obtenerTipoPropulsion() {
        return "Sistema Hibrido Gas-Electrico";
    }

    @Override
    public double calcularFactorCostoKm() {
        return 1350.0;
    }

    @Override
    public String verificarDisponibilidadEnergetica() {
        return "Modo combinado activo (Bateria 78% / Gas 90%)";
    }
}
