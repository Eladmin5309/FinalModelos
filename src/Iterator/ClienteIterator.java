/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Iterator;

import entrada.Entrada;
import entrada.EntradaConsola;
import java.util.ArrayList;
import java.util.List;
import salida.Vista;
import salida.VistaConsola;

public class ClienteIterator {
    private final Entrada entrada;
    private final Vista vista;

    public ClienteIterator() {
        this.entrada = new EntradaConsola();
        this.vista = new VistaConsola();
    }

    public void Ejecutar() {
        vista.mostrarMensaje("=== NAVEGACION DE ESTACIONES Y CORREDORES (ITERATOR) ===");

        // Configuracion inicial de la ruta del sistema de transporte
        RutaTransporte ruta = new RutaTransporte("B75-NorteSur");
        ruta.agregarParada(new ParadaRuta("Portal_Norte", "Norte", true, 0));
        ruta.agregarParada(new ParadaRuta("Paradero_Toberin", "Norte", false, 6));
        ruta.agregarParada(new ParadaRuta("Calle_100", "Norte", true, 15));
        ruta.agregarParada(new ParadaRuta("Paradero_Virrey", "Chapinero", false, 21));
        ruta.agregarParada(new ParadaRuta("Calle_72", "Chapinero", true, 28));
        ruta.agregarParada(new ParadaRuta("Av_Jimenez", "Centro", true, 42));
        ruta.agregarParada(new ParadaRuta("Portal_Sur", "Sur", true, 58));

        vista.mostrarMensaje("Ruta cargada: " + ruta.getCodigoRuta());
        vista.mostrarMensaje("Seleccione modalidad de recorrido (1: Ruta Completa todas las paradas, 2: Servicio Expreso solo troncales):");
        String opcion = entrada.capturarDatoRango(1, 2);

        if ("ERROR".equals(opcion)) {
            vista.mostrarMensaje("Opcion invalida. Se cancela la consulta.");
            return;
        }

        IteradorParadas iterador;
        if ("2".equals(opcion)) {
            vista.mostrarMensaje("\n--- Recorrido Servicio Expreso (Solo Estaciones Troncales) ---");
            iterador = ruta.crearIteradorSoloTroncales();
        } else {
            vista.mostrarMensaje("\n--- Recorrido Ruta Completa (Todas las Estaciones) ---");
            iterador = ruta.crearIteradorCompleto();
        }

        List<String> itinerario = new ArrayList<>();
        int paso = 1;
        while (iterador.tieneSiguiente()) {
            ParadaRuta actual = iterador.siguiente();
            itinerario.add("Parada #" + paso + " -> " + actual.toString());
            paso++;
        }

        vista.mostrarLista(itinerario);
    }
}
