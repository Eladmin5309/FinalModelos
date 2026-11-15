package finalmodelos.visitor;
/**
 * Visitor: declara una operación de visita por cada tipo de vehículo.
 * Cada visitante concreto es una operación nueva sobre la flota.
 */
public interface Visitor {
	void visitar(Bus bus);

    void visitar(Taxi taxi);

    void visitar(Metro metro);
}
