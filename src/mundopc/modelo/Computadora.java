package mundopc.modelo;

public class Computadora {
    private int idComputadora;
    private String nombre;
    private Moonitor monitor;
    private Teclado teclado;
    private Raton raton;
    private static int contadorComputadoras;

    private Computadora() {
        idComputadora = ++contadorComputadoras;
    }

    public Computadora(String nombre, Moonitor monitor, Teclado teclado, Raton raton) {
        this();
        this.nombre = nombre;
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;
    }

    @Override
    public String toString() {
        return "Computadora: id = " + idComputadora + " | Nombre = " + nombre + "\n" + monitor
                + "\n" + teclado + raton + "]";
    }

}
