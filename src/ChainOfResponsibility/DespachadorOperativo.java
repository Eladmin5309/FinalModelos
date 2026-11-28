/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChainOfResponsibility;

public class DespachadorOperativo extends ManejadorAprobacion {

    @Override
    public String procesarSolicitud(SolicitudDespacho solicitud) {
        // Nivel 1: Viajes urbanos cortos, livianos y sin escolta
        if (solicitud.getDistanciaKm() <= 30.0 && solicitud.getCargaToneladas() <= 2.0 && !solicitud.isRequiereEscolta()) {
            return "[APROBADO POR DESPACHADOR OPERATIVO]\n"
                    + "Ruta: " + solicitud.getRuta() + " (" + solicitud.getDistanciaKm() + " km, " + solicitud.getCargaToneladas() + " ton).\n"
                    + "Autorizacion inmediata de nivel local sin escalamiento.";
        }

        if (siguiente != null) {
            return "-> Despachador Operativo escala la solicitud (excede limite urbano/liviano)...\n"
                    + siguiente.procesarSolicitud(solicitud);
        }
        return "[RECHAZADO] Ningun nivel pudo procesar la solicitud.";
    }
}
