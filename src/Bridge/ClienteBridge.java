/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bridge;

import entrada.Entrada;
import entrada.EntradaConsola;
import salida.Vista;
import salida.VistaConsola;

public class ClienteBridge {
    private final Entrada entrada;
    private final Vista vista;

    public ClienteBridge() {
        this.entrada = new EntradaConsola();
        this.vista = new VistaConsola();
    }

    public void Ejecutar() {
        vista.mostrarMensaje("=== GESTION DE FLOTA MULTIMODAL (BRIDGE) ===");
        vista.mostrarMensaje("Seleccione modalidad de servicio (1: Pasajeros, 2: Carga):");
        String modalidad = entrada.capturarDatoRango(1,2);

        vista.mostrarMensaje("Seleccione tecnologia de propulsion (1: Electrico, 2: Combustion, 3: Hibrido):");
        String tipoMotor = entrada.capturarDatoRango(1,3);

        vista.mostrarMensaje("Ingrese punto de origen (sin espacios):");
        String origen = entrada.capturarDato();

        vista.mostrarMensaje("Ingrese punto de destino (sin espacios):");
        String destino = entrada.capturarDato();

        vista.mostrarMensaje("Ingrese distancia del trayecto en km:");
        double km = Double.parseDouble(entrada.capturarDato());

        MotorTraccion motor;
        switch (tipoMotor) {
            case "1":
                motor = new MotorElectrico();
                break;
            case "3":
                motor = new MotorHibrido();
                break;
            default:
                motor = new MotorCombustion();
                break;
        }

        ServicioTransporte servicio;
        if ("2".equals(modalidad)) {
            servicio = new TransporteCarga(motor);
        } else {
            servicio = new TransportePasajeros(motor);
        }

        vista.mostrarMensaje("\n" + servicio.ejecutarRecorrido(origen, destino, km));
    }
}
