/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChainOfResponsibility;

public class SupervisorFlota extends ManejadorAprobacion {

    @Override
    public String procesarSolicitud(SolicitudDespacho solicitud) {
        // Nivel 2: Viajes intermunicipales medios, carga moderada y sin escolta especial
        if (solicitud.getDistanciaKm() <= 250.0 && solicitud.getCargaToneladas() <= 12.0 && !solicitud.isRequiereEscolta()) {
            return "[APROBADO POR SUPERVISOR DE FLOTA]\n"
                    + "Ruta: " + solicitud.getRuta() + " (" + solicitud.getDistanciaKm() + " km, " + solicitud.getCargaToneladas() + " ton).\n"
                    + "Autorizacion validada con asignacion de vehiculo pesado regional.";
        }

        if (siguiente != null) {
            return "-> Supervisor de Flota escala la solicitud (excede autonomia regional o requiere escolta)...\n"
                    + siguiente.procesarSolicitud(solicitud);
        }
        return "[RECHAZADO] Ningun nivel pudo procesar la solicitud.";
    }
}
