package finalmodelos.visitor;

/**
 * Elemento concreto: taxi. Se cobra por recorrido, no por pasajero.
 */
public final class Taxi implements Element {

    private final String placa;
    private final double kilometros;

    public Taxi(String placa, double kilometros) {
        this.placa = placa;
        this.kilometros = kilometros;
    }

    @Override
    public void aceptar(Visitor visitor) {
        visitor.visitar(this);   // se ejecuta visitar(Taxi)
    }

    public String getPlaca() {
        return placa;
    }

    public double getKilometros() {
        return kilometros;
    }
}	
