package finalmodelos.visitor;

/**
 * Pruebas del patrón Visitor: cada método aplica un visitante
 * y compara el resultado obtenido con el esperado.
 */
public class PruebasDeTransporte {

    private static final double TOLERANCIA = 0.001;

    private final Bus bus = new Bus("SXT-245", 30, 40);
    private final Taxi taxi = new Taxi("WMB-871", 12);
    private final Metro metro = new Metro("Línea A", 200, 25);

    private int aprobadas;
    private int fallidas;

    public void ejecutarTodas() {
        System.out.println("=== Patrón Visitor: sistema de transporte ===");
        probarTarifaPorVehiculo();
        probarTarifaDeLaFlota();
        probarEmisionesDeLaFlota();
        probarReporteDeLaFlota();
        System.out.printf("%nResultado: %d aprobadas, %d fallidas%n", aprobadas, fallidas);
    }	

    /** Un visitante nuevo por vehículo: cada uno se cobra distinto. */
    private void probarTarifaPorVehiculo() {
        System.out.println("\n1. Tarifa por tipo de vehículo");
        verificarValor("Bus: 30 pasajeros x $2.950", 88_500, tarifaDe(bus));
        verificarValor("Taxi: $4.900 + 12 km x $1.200", 19_300, tarifaDe(taxi));
        verificarValor("Metro: 200 pasajeros x $3.550", 710_000, tarifaDe(metro));
    }

    /** El mismo visitante recorre toda la flota y acumula el total. */
    private void probarTarifaDeLaFlota() {
        System.out.println("\n2. Recaudo total de la flota");
        CalculadoraTarifas tarifas = new CalculadoraTarifas();
        crearFlota().aceptar(tarifas);
        verificarValor("Total recaudado", 817_800, tarifas.getTotalRecaudado());
    }

    /** Una operación distinta sobre los mismos elementos, sin modificarlos. */
    private void probarEmisionesDeLaFlota() {
        System.out.println("\n3. Emisiones de la flota");
        CalculadoraEmisiones emisiones = new CalculadoraEmisiones();
        crearFlota().aceptar(emisiones);
        verificarValor("kg de CO2 (52 + 2,28 + 1)", 55.28, emisiones.getTotalKgCO2());
    }

    private void probarReporteDeLaFlota() {
        System.out.println("\n4. Reporte de la flota");
        GeneradorReporte generador = new GeneradorReporte();
        crearFlota().aceptar(generador);
        String reporte = generador.getReporte();
        reporte.lines().forEach(linea -> System.out.println("   " + linea));
        verificar("El reporte tiene una línea por vehículo", reporte.lines().count() == 3);
        verificar("El reporte incluye la placa del taxi", reporte.contains("WMB-871"));
    }

    // Utilidades de las pruebas

    private Flota crearFlota() {
        Flota flota = new Flota();
        flota.agregar(bus);
        flota.agregar(taxi);
        flota.agregar(metro);
        return flota;
    }

    private double tarifaDe(Element vehiculo) {
        CalculadoraTarifas tarifas = new CalculadoraTarifas();
        vehiculo.aceptar(tarifas);
        return tarifas.getTotalRecaudado();
    }

    private void verificarValor(String descripcion, double esperado, double obtenido) {
        String detalle = String.format("%s -> esperado %,.2f, obtenido %,.2f",descripcion, esperado, obtenido);
        verificar(detalle, Math.abs(esperado - obtenido) < TOLERANCIA);
    }

    private void verificar(String descripcion, boolean condicion) {
        if (condicion) {
            aprobadas++;
        } else {
            fallidas++;
        }
        System.out.println((condicion ? "   [OK]    " : "   [FALLO] ") + descripcion);
    }
}
