/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interpreter;
import salida.VistaConsola;
import salida.Vista;

public class ServicioTarifas {

    public void Ejecutar() {
        Vista vista =new VistaConsola();
        
        // Definimos la regla: (Hora Pico AND Distancia > 10km) OR (Usuario VIP)
        ReglaExpresion esHoraPico = new EsHoraPicoExpresion();
        ReglaExpresion viajeLargo = new DistanciaMayorAExpresion(10.0);
        ReglaExpresion esVip = new NivelUsuarioExpresion("VIP");

        ReglaExpresion reglaPromocion = new OrExpresion(
                new AndExpresion(esHoraPico, viajeLargo),
                esVip
        );

        // Caso 1: Usuario REGULAR, 15 km, en Hora Pico -> Cumple primera parte del OR
        ViajeContext viaje1 = new ViajeContext(15.0, true, "REGULAR", "ECONOMICO");
        vista.mostrarMensaje("¿Aplica promo Viaje 1?: " + reglaPromocion.interpretar(viaje1)); // true

        // Caso 2: Usuario REGULAR, 4 km, en Hora Pico -> No cumple ni distancia ni VIP
        ViajeContext viaje2 = new ViajeContext(4.0, true, "REGULAR", "ECONOMICO");
        vista.mostrarMensaje("¿Aplica promo Viaje 2?: " + reglaPromocion.interpretar(viaje2)); // false

        // Caso 3: Usuario VIP, 2 km, sin Hora Pico -> Cumple segunda parte del OR
        ViajeContext viaje3 = new ViajeContext(2.0, false, "VIP", "PREMIUM");
        vista.mostrarMensaje("¿Aplica promo Viaje 3?: " + reglaPromocion.interpretar(viaje3)); // true
    }
}
