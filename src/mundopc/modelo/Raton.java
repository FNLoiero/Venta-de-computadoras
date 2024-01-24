package mundopc.modelo;

public class Raton extends DispositivoEntrada {
    private final int idRaton;
    private static int contadorDeRatones;

    public Raton(String tipoDeEntrada, String marca) {
        super(tipoDeEntrada, marca);
        this.idRaton = ++contadorDeRatones;
    }

    @Override
    public String toString() {
        return "Raton: id = " + idRaton + " " + super.toString();
    }

}
