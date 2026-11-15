package finalmodelos.visitor;

/**
 * Visitante concreto: estima los kilogramos de CO2 emitidos.
 * Factores en kg de CO2 por kilómetro (de ejemplo).
 */
public class CalculadoraEmisiones implements Visitor {

    private static final double FACTOR_BUS = 1.30;     // diésel
    private static final double FACTOR_TAXI = 0.19;    // gasolina
    private static final double FACTOR_METRO = 0.04;   // eléctrico

    private double totalKgCO2;

    @Override
    public void visitar(Bus bus) {
        totalKgCO2 += bus.getKilometros() * FACTOR_BUS;
    }

    @Override
    public void visitar(Taxi taxi) {
        totalKgCO2 += taxi.getKilometros() * FACTOR_TAXI;
    }

    @Override
    public void visitar(Metro metro) {
        totalKgCO2 += metro.getKilometros() * FACTOR_METRO;
    }

    public double getTotalKgCO2() {
        return totalKgCO2;
    }
}
	