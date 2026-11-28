/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Iterator;

import java.util.List;
import java.util.NoSuchElementException;

public class IteradorRutaExpresa implements IteradorParadas {
    private final List<ParadaRuta> paradas;
    private int posicionActual;

    public IteradorRutaExpresa(List<ParadaRuta> paradas) {
        this.paradas = paradas;
        this.posicionActual = 0;
        avanzarASiguienteTroncal();
    }

    private void avanzarASiguienteTroncal() {
        while (posicionActual < paradas.size() && !paradas.get(posicionActual).isEsTroncal()) {
            posicionActual++;
        }
    }

    @Override
    public boolean tieneSiguiente() {
        return posicionActual < paradas.size();
    }

    @Override
    public ParadaRuta siguiente() {
        if (!tieneSiguiente()) {
            throw new NoSuchElementException("No hay mas estaciones troncales en el servicio expreso.");
        }
        ParadaRuta parada = paradas.get(posicionActual++);
        avanzarASiguienteTroncal();
        return parada;
    }

    @Override
    public void reiniciar() {
        this.posicionActual = 0;
        avanzarASiguienteTroncal();
    }
}
