package flujos;

import java.util.Scanner;

public class EjemploScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        // Aquí va a dar error si no se pone un número entero.
        // ! Error: InputMismatchException
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt(); // Definir un prompt de ingreso de información,
        // Hasta que no se detiene la ejecución, el llenado se asume cuando existe un salto de línea.
        // Solo toma el primero valor, los demás valores se pierden.

        // ? ¿Cómo puedo agregar los valores que sobran? Así:
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        System.out.println(n + " " + m + " " + edad);

        System.out.print("Ingrese su ciudad: ");
        String ciudad = scanner.next();

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Ciudad: " + ciudad);

        scanner.close();
    }
}
