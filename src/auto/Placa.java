package auto;

public class Placa {
    private char provincia;
    private String idLetra;
    private String idNumero;

    // Constructor vacío.
    public Placa() {
        this.provincia = 'A';
        this.idLetra = "AA";
        this.idNumero = "0000";
    }

    // Constructor con parámetros
    public Placa(char provincia, String idLetra, String idNumero) {
        this.provincia = provincia;
        this.idLetra = idLetra;
        this.idNumero = idNumero;
    }
}
