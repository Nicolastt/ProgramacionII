package auto;

/*
    El final nos sirve para decir, que es la última clase creada, no hay más aparte de esta clase.
 */
public final class Cedula {
    // ? ¿Cuándo un atributo le pertenece al objeto y cuando un atributo le pertenece a la clase?
    // ! Cuando es static le pertenece a la clase y cuando no es static le pertenece a un objeto.
    // Los static no pertenecen al objeto, sino a la clase.
    private static int numeroDeCedulas = 0;
    private final int identificador;
    private final String apellido1;
    private final String apellido2;
    private final String nombre;
    private final int diaNacimiento;
    private final int mesNacimiento;
    private final int anoNacimiento;
    private final String codigoDactilar;


    public Cedula(String apellido1, String apellido2, String nombre, int diaNacimiento, int mesNacimiento, int anoNacimiento, String codigoDactilar) {
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.nombre = nombre;
        this.diaNacimiento = diaNacimiento;
        this.mesNacimiento = mesNacimiento;
        this.anoNacimiento = anoNacimiento;
        this.codigoDactilar = codigoDactilar;
        this.identificador = ++numeroDeCedulas;
        System.out.printf("Hay %d cédulas%n", numeroDeCedulas);

    }


    public static int getNumeroDeCedulas() {
        // Aquí no se puede poner this.numeroDeCedulas porque el a es de la clase no del objeto.
        return numeroDeCedulas;
    }

    public int getIdentificador() {
        return identificador;
    }
}
