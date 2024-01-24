package mundopc;

import mundopc.modelo.Raton;
import mundopc.modelo.Teclado;
import mundopc.servicio.Orden;
import mundopc.modelo.Moonitor;
import mundopc.modelo.Computadora;

public class VentaComputadoras {
    public static void main(String[] args) {

        Raton ratonlenovo = new Raton("usb", "lenovo");

        Teclado tecladolenovo = new Teclado("usb", "lenovo");

        Moonitor monitorlenovo = new Moonitor("lenovo", 27);

        Computadora computadoralenovo = new Computadora("computadora lenovo", monitorlenovo, tecladolenovo,
                ratonlenovo);

        Orden orden1 = new Orden();

        orden1.agregarComputadora(computadoralenovo);

        orden1.mostrarOrden();

    }
}
