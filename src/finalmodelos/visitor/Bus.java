package finalmodelos.visitor;

/**
 * Elemento concreto: Solo guarda sus datos;
 * las operaciones viven en los visitantes.
 */
public final class Bus implements Element {

    private final String placa;
    private final int pasajeros;
    private final double kilometros;

    public Bus(String placa, int pasajeros, double kilometros) {
        this.placa = placa;
        this.pasajeros = pasajeros;
        this.kilometros = kilometros;
    }

    @Override
    public void aceptar(Visitor visitor) {
        visitor.visitar(this);   // se ejecuta visitar(Bus)
    }

    public String getPlaca() {
        return placa;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public double getKilometros() {
        return kilometros;
    }
}	
