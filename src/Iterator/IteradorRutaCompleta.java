/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Iterator;

import java.util.List;
import java.util.NoSuchElementException;

public class IteradorRutaCompleta implements IteradorParadas {
    private final List<ParadaRuta> paradas;
    private int posicionActual;

    public IteradorRutaCompleta(List<ParadaRuta> paradas) {
        this.paradas = paradas;
        this.posicionActual = 0;
    }

    @Override
    public boolean tieneSiguiente() {
        return posicionActual < paradas.size();
    }

    @Override
    public ParadaRuta siguiente() {
        if (!tieneSiguiente()) {
            throw new NoSuchElementException("No hay mas estaciones en el recorrido completo.");
        }
        return paradas.get(posicionActual++);
    }

    @Override
    public void reiniciar() {
        this.posicionActual = 0;
    }
}
