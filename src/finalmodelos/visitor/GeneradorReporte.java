package finalmodelos.visitor;

/**
 * Visitante concreto: crea un reporte de texto con una línea por vehículo.
 */
public class GeneradorReporte implements Visitor {

    private final StringBuilder reporte = new StringBuilder();

    @Override
    public void visitar(Bus bus) {
        agregarLinea(String.format("Bus %s: %d pasajeros, %.1f km", bus.getPlaca(), bus.getPasajeros(), bus.getKilometros()));
    }

    @Override
    public void visitar(Taxi taxi) {
        agregarLinea(String.format("Taxi %s: %.1f km", taxi.getPlaca(), taxi.getKilometros()));
    }

    @Override
    public void visitar(Metro metro) {
        agregarLinea(String.format("Metro %s: %d pasajeros, %.1f km", metro.getLinea(), metro.getPasajeros(), metro.getKilometros()));
    }

    private void agregarLinea(String linea) {
        reporte.append(linea).append(System.lineSeparator()); 
    }

    public String getReporte() {
        return reporte.toString();
    }
}

	