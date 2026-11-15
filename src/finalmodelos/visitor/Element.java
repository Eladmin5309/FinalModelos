package finalmodelos.visitor;
/**
 * Element: todo vehículo del sistema puede recibir a un visitante.
 */
public interface Element {
	void aceptar(Visitor visitor);
}
