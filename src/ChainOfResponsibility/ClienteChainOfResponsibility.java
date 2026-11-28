/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChainOfResponsibility;

import entrada.Entrada;
import entrada.EntradaConsola;
import salida.Vista;
import salida.VistaConsola;

public class ClienteChainOfResponsibility {
    private final Entrada entrada;
    private final Vista vista;

    public ClienteChainOfResponsibility() {
        this.entrada = new EntradaConsola();
        this.vista = new VistaConsola();
    }

    public void Ejecutar() {
        vista.mostrarMensaje("=== AUTORIZACION ESCALONADA DE DESPACHOS (CHAIN OF RESPONSIBILITY) ===");

        // Construccion de la cadena de responsabilidad
        ManejadorAprobacion despachador = new DespachadorOperativo();
        ManejadorAprobacion supervisor = new SupervisorFlota();
        ManejadorAprobacion gerente = new GerenteOperaciones();
        despachador.establecerSiguiente(supervisor).establecerSiguiente(gerente);

        vista.mostrarMensaje("Ingrese corredor o ruta del servicio (ej. Bogota-Medellin, sin espacios):");
        String ruta = entrada.capturarDato();

        vista.mostrarMensaje("Ingrese distancia estimada del recorrido en km:");
        double km = Double.parseDouble(entrada.capturarDato());

        vista.mostrarMensaje("Ingrese peso de la carga o equivalencia en toneladas:");
        double toneladas = Double.parseDouble(entrada.capturarDato());

        vista.mostrarMensaje("¿El traslado requiere escolta de seguridad? (1: Si, 2: No):");
        String opEscolta = entrada.capturarDatoRango(1, 2);
        if ("ERROR".equals(opEscolta)) {
            vista.mostrarMensaje("Opcion invalida. Se cancela la solicitud.");
            return;
        }
        boolean requiereEscolta = "1".equals(opEscolta);

        SolicitudDespacho solicitud = new SolicitudDespacho(ruta, km, toneladas, requiereEscolta);

        vista.mostrarMensaje("\n--- Trazabilidad de Evaluacion en la Cadena ---");
        String resultado = despachador.procesarSolicitud(solicitud);
        vista.mostrarMensaje(resultado);
    }
}
