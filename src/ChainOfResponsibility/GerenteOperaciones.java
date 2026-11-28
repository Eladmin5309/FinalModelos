/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChainOfResponsibility;

public class GerenteOperaciones extends ManejadorAprobacion {

    @Override
    public String procesarSolicitud(SolicitudDespacho solicitud) {
        // Nivel 3: Rutas nacionales largas, carga extrapesada o transporte con escolta
        if (solicitud.getCargaToneladas() <= 35.0) {
            return "[APROBADO POR GERENCIA DE OPERACIONES]\n"
                    + "Ruta: " + solicitud.getRuta() + " (" + solicitud.getDistanciaKm() + " km, " + solicitud.getCargaToneladas() + " ton).\n"
                    + "Autorizacion especial emitida"
                    + (solicitud.isRequiereEscolta() ? " con protocolo de seguridad y escolta armada." : " para corredor nacional.");
        }

        return "[RECHAZADO POR GERENCIA DE OPERACIONES]\n"
                + "La carga de " + solicitud.getCargaToneladas() + " ton supera la capacidad maxima legal de la flota (35.0 ton).";
    }
}