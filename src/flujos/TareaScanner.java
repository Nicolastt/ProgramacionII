package flujos;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class TareaScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        System.out.println("Ingrese la fecha separada por un espacio: ");
        String fecha = scanner.nextLine(); // Leer la línea completa
        String[] fechaArr = fecha.split("[ ,]+"); // Dividir la cadena utilizando espacios y comas
        int dia = Integer.parseInt(fechaArr[0]);
        int mes = Integer.parseInt(fechaArr[1]);
        int year = Integer.parseInt(fechaArr[2]);

        System.out.println("Ingrese su nombre y su peso:");
        String nombre = scanner.next();

        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.ENGLISH);
        DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
        double peso = Double.parseDouble(scanner.next().replace(',', '.')); // Reemplazar la coma por el punto y convertir a double

        scanner.nextLine(); // ? Limpiar el Buffer
        // Si no se pone este cuando ingresemos el peso y demos enter el "/n" se va a
        // Guardar en el buffer, haciendo que cuando entremos en la siguiente línea se asigne automáticamente.
        // !.next no toma espacios, toma el siguiente token, 1 a 1, si hay más se quedan.
        // !.nextLine toma toda hasta el salto de línea.
        System.out.println("Ingrese el país de origen: ");
        String pais = scanner.nextLine();


        System.out.printf("Hoy es %d/%d/%d%n", dia, mes, year);
        System.out.printf("%s pesa %s y vive en %s%n", nombre, decimalFormat.format(peso), pais);

        System.out.println(fechaArr[1]);
    }
}
