package finalmodelos.visitor;

/**
 * Visitante concreto: calcula el dinero recaudado por cada vehículo.
 * Valores en pesos colombianos (de ejemplo).
 */
public class CalculadoraTarifas implements Visitor {

    private static final double TARIFA_BUS = 2_950;
    private static final double BANDERAZO_TAXI = 4_900;
    private static final double VALOR_KM_TAXI = 1_200;
    private static final double TARIFA_METRO = 3_550;

    private double totalRecaudado;

    @Override
    public void visitar(Bus bus) {
        totalRecaudado += bus.getPasajeros() * TARIFA_BUS;
    }

    @Override
    public void visitar(Taxi taxi) {
        totalRecaudado += BANDERAZO_TAXI + taxi.getKilometros() * VALOR_KM_TAXI;
    }

    @Override
    public void visitar(Metro metro) {
        totalRecaudado += metro.getPasajeros() * TARIFA_METRO;
    }

    public double getTotalRecaudado() {
        return totalRecaudado;
    }
}
	