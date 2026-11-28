/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChainOfResponsibility;

public abstract class ManejadorAprobacion {
    protected ManejadorAprobacion siguiente;

    public ManejadorAprobacion establecerSiguiente(ManejadorAprobacion siguiente) {
        this.siguiente = siguiente;
        return siguiente;
    }

    public abstract String procesarSolicitud(SolicitudDespacho solicitud);
}
