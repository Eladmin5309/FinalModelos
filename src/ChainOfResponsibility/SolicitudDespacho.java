/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChainOfResponsibility;

public class SolicitudDespacho {
    private final String ruta;
    private final double distanciaKm;
    private final double cargaToneladas;
    private final boolean requiereEscolta;

    public SolicitudDespacho(String ruta, double distanciaKm, double cargaToneladas, boolean requiereEscolta) {
        this.ruta = ruta;
        this.distanciaKm = distanciaKm;
        this.cargaToneladas = cargaToneladas;
        this.requiereEscolta = requiereEscolta;
    }

    public String getRuta() {
        return ruta;
    }

    public double getDistanciaKm() {
        return distanciaKm;
    }

    public double getCargaToneladas() {
        return cargaToneladas;
    }

    public boolean isRequiereEscolta() {
        return requiereEscolta;
    }
}
