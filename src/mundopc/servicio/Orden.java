package mundopc.servicio;

import java.util.ArrayList;
import java.util.List;

import mundopc.modelo.Computadora;

public class Orden {
    private final int idOrden;
    private final List<Computadora> computadoras;
    private static int contadorOrden;

    public Orden() {
        computadoras = new ArrayList<>();
        this.idOrden = ++contadorOrden;
    }

    public void agregarComputadora(Computadora computadora) {
        computadoras.add(computadora);
    }

    public void mostrarOrden() {
        System.out.println("Orden #: " + idOrden);
        System.out.println("Total computadoras: " + computadoras.size());
        System.out.println();
        computadoras.forEach(System.out::println);
    }

}
