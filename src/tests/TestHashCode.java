import java.util.HashMap;
import java.util.Map;

public class TestHashCode {
    public static void main(String[] args) {

        int mes = 6;

        Map<Integer, String> meses = new HashMap<>();
        meses.put(1, "ENERO");
        meses.put(2, "FEBRERO");
        meses.put(3, "MARZO");
        meses.put(4, "ABRIL");
        meses.put(5, "MAYO");
        meses.put(6, "JUNIO");
        meses.put(7, "JULIO");
        meses.put(8, "AGOSTO");
        meses.put(9, "SEPTIEMBRE");
        meses.put(10, "OCTUBRE");
        meses.put(11, "NOVIEMBRE");
        meses.put(12, "DICIEMBRE");

        String nombreMes = meses.get(mes);

        if (nombreMes != null) {
            System.out.println("El mes es " + nombreMes);
        } else {
            System.out.println("Mes inválido mi perrito");
        }
    }
}
