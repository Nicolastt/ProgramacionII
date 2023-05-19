package tests;

import java.util.HashMap;
import java.util.Map;

public class TestLambda {
    public static void main(String[] args) {
        System.out.println("---------- Lab 1 ----------");

        int operation = 1;

        Map<Integer, Runnable> actions = new HashMap<>();
        actions.put(1, () -> {
            // Código para calcular A
            System.out.println("Calculando A...");
        });
        actions.put(2, () -> {
            // Código para calcular B
            System.out.println("Calculando B...");
        });
        actions.put(3, () -> {
            // Código para calcular C
            System.out.println("Calculando C...");
        });

        Runnable action = actions.getOrDefault(operation, () -> {
            System.out.println("Operación no reconocida.");
        });

        action.run();
    }
}
