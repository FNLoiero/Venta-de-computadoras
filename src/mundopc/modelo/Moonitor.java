package mundopc.modelo;

public class Moonitor {
    private final int idMonitor;
    private String marca;
    private double tamanio;
    private static int contadorDeMonitores;

    private Moonitor() {
        idMonitor = ++contadorDeMonitores;
    }

    public Moonitor(String marca, double tamanio) {
        this();
        this.marca = marca;
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Monitor: id = " + idMonitor + " | Marca = " + marca + " | Tamanio = " + tamanio;
    }

}
