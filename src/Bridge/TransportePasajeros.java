/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bridge;

public class TransportePasajeros extends ServicioTransporte {

    public TransportePasajeros(MotorTraccion motor) {
        super(motor);
    }

    @Override
    public String ejecutarRecorrido(String origen, String destino, double km) {
        double tarifaBase = 3500.0;
        double costoTotal = tarifaBase + (km * motor.calcularFactorCostoKm());
        return "[SERVICIO DE PASAJEROS]\n"
                + "Ruta: " + origen + " -> " + destino + " (" + km + " km)\n"
                + "Tecnologia: " + motor.obtenerTipoPropulsion() + "\n"
                + "Estado Energetico: " + motor.verificarDisponibilidadEnergetica() + "\n"
                + String.format("Tarifa Liquidada Pasajeros: $%.2f", costoTotal);
    }
}
