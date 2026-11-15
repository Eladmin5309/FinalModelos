package finalmodelos.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Estructura de objetos: agrupa los vehículos y permite
 * que un visitante recorra toda la flota con una sola llamada.
 */
public class Flota {

    private final List<Element> vehiculos = new ArrayList<>();

    public void agregar(Element vehiculo) {
        vehiculos.add(vehiculo);
    }

    public void aceptar(Visitor visitor) {
        for (Element vehiculo : vehiculos) {
            vehiculo.aceptar(visitor);
        }
    }

    public int cantidadVehiculos() {
        return vehiculos.size();
    }
}

