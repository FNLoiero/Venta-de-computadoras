package mundopc.modelo;

public class Teclado extends DispositivoEntrada {
    private final int idTeclado;
    private static int contadorDeTeclados;

    public Teclado(String tipoDeEntrada, String marca) {
        super(tipoDeEntrada, marca);
        this.idTeclado = ++contadorDeTeclados;
    }

    @Override
    public String toString() {
        return "Teclado: id = " + idTeclado + " " + super.toString();
    }

}
