/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Iterator;

public interface ColeccionRutas {
    void agregarParada(ParadaRuta parada);
    IteradorParadas crearIteradorCompleto();
    IteradorParadas crearIteradorSoloTroncales();
}