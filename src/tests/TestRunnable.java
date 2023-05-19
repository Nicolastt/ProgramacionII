package tests;

import java.util.HashMap;
import java.util.Map;

public class TestRunnable {
    public static void main(String[] args) {

        Triangulo tri = new Triangulo(2,3);


        Map<Integer, Runnable> acciones = new HashMap<>();

        acciones.put(1, () -> tri.calcularArea());
        acciones.put(2, () -> System.out.println("Ejecutando acción 2"));

        int accionSeleccionada = 1;

        Runnable accion = acciones.get(accionSeleccionada);
        if (accion != null) {
            accion.run();
        } else {
            System.out.println("Acción inválida");
        }
    }
}

