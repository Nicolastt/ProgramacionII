package tests;

public class TestTiempo {
    // Cada estructura que pueda ser definido com una clase, tengo una estructura diferente para su utilización
    // De un .java pueden salir n archivos .class
    // En este ejemplo tengo un TestTiempo.java y 2 TestTiempo.class y TiempoSencillo.class
    public static void main(String[] args) {
        TiempoSencillo tiempoSencillo = new TiempoSencillo(14, 12, 2);
        System.out.println(tiempoSencillo.imprimirTiempo());
        System.out.println(tiempoSencillo.imprimirTiempo2());
    }
}


/*
 * Cuando tengo más de una clase por archivo,
 * solo la primera se define como public, el resto no.
 */
class TiempoSencillo {
    private int hora;
    private int minuto;
    private int segundo;

    public TiempoSencillo(int hora, int minuto, int segundo) {
        // This explícitos
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public String imprimirTiempo() {
        return String.format("%02d:%02d:%02d", this.hora, this.minuto, this.segundo);
    }

    public String imprimirTiempo2() {                                                // Aquí llamamos a una función a la que tengo acceso (Me pertenece).
        return String.format("%24s: %s%n%24s: %s","Imprimir función normal", imprimirTiempo(), "Imprimir función explícita", this.imprimirTiempo());
    }                                  // Llamamos a una función de nuestro archivo. This explícito
    //! El this implícito se utiliza para referenciar a los atributos.
    //! El this explícito se utiliza para separar entre "yo tengo acceso a esa función" y "esa función es mía".

}
