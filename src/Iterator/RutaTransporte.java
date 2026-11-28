/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Iterator;

import java.util.ArrayList;
import java.util.List;

public class RutaTransporte implements ColeccionRutas {
    private final String codigoRuta;
    private final List<ParadaRuta> paradas;

    public RutaTransporte(String codigoRuta) {
        this.codigoRuta = codigoRuta;
        this.paradas = new ArrayList<>();
    }

    public String getCodigoRuta() {
        return codigoRuta;
    }

    @Override
    public void agregarParada(ParadaRuta parada) {
        paradas.add(parada);
    }

    @Override
    public IteradorParadas crearIteradorCompleto() {
        return new IteradorRutaCompleta(paradas);
    }

    @Override
    public IteradorParadas crearIteradorSoloTroncales() {
        return new IteradorRutaExpresa(paradas);
    }
}
