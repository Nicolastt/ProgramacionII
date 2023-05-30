package flujos;

public class Consola {
    public static void main(String[] args) {

        int numeroConsola = 0;

        for (String arg : args) {
            // Imprime los argumentos
            //System.out.printf("Ingreso de un %s en la posición %d%n", args[i], i+1);

            // Pasamos de String a int
            numeroConsola += Integer.parseInt(arg);
            System.out.println("La suma total de lo ingresado es: " + numeroConsola);
        }
    }
}
