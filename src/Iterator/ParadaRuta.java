/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Iterator;

public class ParadaRuta {
    private final String nombreEstacion;
    private final String zona;
    private final boolean esTroncal;
    private final int tiempoEstimadoMin;

    public ParadaRuta(String nombreEstacion, String zona, boolean esTroncal, int tiempoEstimadoMin) {
        this.nombreEstacion = nombreEstacion;
        this.zona = zona;
        this.esTroncal = esTroncal;
        this.tiempoEstimadoMin = tiempoEstimadoMin;
    }

    public String getNombreEstacion() {
        return nombreEstacion;
    }

    public String getZona() {
        return zona;
    }

    public boolean isEsTroncal() {
        return esTroncal;
    }

    public int getTiempoEstimadoMin() {
        return tiempoEstimadoMin;
    }

    @Override
    public String toString() {
        return String.format(
                "Estacion: %-18s | Zona: %-10s | Tipo: %-10s | Tiempo acum: %d min",
                nombreEstacion, zona, (esTroncal ? "TRONCAL" : "ALIMENTADOR"), tiempoEstimadoMin
        );
    }
}