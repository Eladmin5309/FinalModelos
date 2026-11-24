/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bridge;

public class TransporteCarga extends ServicioTransporte {

    public TransporteCarga(MotorTraccion motor) {
        super(motor);
    }

    @Override
    public String ejecutarRecorrido(String origen, String destino, double km) {
        double recargoLogistico = 15000.0;
        double costoTotal = recargoLogistico + (km * motor.calcularFactorCostoKm() * 1.4);
        return "[SERVICIO DE CARGA LOGISTICA]\n"
                + "Ruta: " + origen + " -> " + destino + " (" + km + " km)\n"
                + "Tecnologia: " + motor.obtenerTipoPropulsion() + "\n"
                + "Estado Energetico: " + motor.verificarDisponibilidadEnergetica() + "\n"
                + String.format("Tarifa Liquidada Carga: $%.2f", costoTotal);
    }
}
