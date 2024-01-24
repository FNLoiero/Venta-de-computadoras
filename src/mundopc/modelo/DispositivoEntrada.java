package mundopc.modelo;

public class DispositivoEntrada {
    private String tipoDeEntrada;
    private String marca;

    public DispositivoEntrada(String tipoDeEntrada, String marca) {
        this.marca = marca;
        this.tipoDeEntrada = tipoDeEntrada;
    }

    @Override
    public String toString() {
        return " | Tipo de Entrada = " + tipoDeEntrada + " | Marca = " + marca + "\n";
    }
}