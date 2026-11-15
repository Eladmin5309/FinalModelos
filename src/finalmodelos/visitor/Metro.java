package finalmodelos.visitor;

/**
 * Elemento concreto: tren del metro, identificado por su línea.
 */
public final class Metro implements Element {

    private final String linea;
    private final int pasajeros;
    private final double kilometros;

    public Metro(String linea, int pasajeros, double kilometros) {
        this.linea = linea;
        this.pasajeros = pasajeros;
        this.kilometros = kilometros;
    }

    @Override
    public void aceptar(Visitor visitor) {
        visitor.visitar(this);   // se ejecuta visitar(Metro)
    }

    public String getLinea() {
        return linea;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public double getKilometros() {
        return kilometros;
    }
}

	