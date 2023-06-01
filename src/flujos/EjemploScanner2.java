package flujos;

import java.util.Locale;
import java.util.Scanner;

public class EjemploScanner2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Con esto podemos utilizar el punto en consola
        scanner.useLocale(Locale.ENGLISH);

        System.out.println("Ingrese la fecha separada por un espacio: ");
        int dia = scanner.nextInt();
        int mes = scanner.nextInt();
        int year = scanner.nextInt();
        System.out.println("Ingrese su nombre y su peso");
        String nombre = scanner.next(); // Un String puede ser lo que sea.
        double peso = scanner.nextDouble();


        System.out.println(String.format("Hoy es %d:%d:%d",dia,mes,year));
        System.out.println(String.format("%s pesa %.2f",nombre,peso));
    }
}
