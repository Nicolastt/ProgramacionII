package tests;

import auto.Auto;
import auto.Llanta;

public class TestEnlaceFuerte {
    public static void main(String[] args) {
        /*
            ENLACE FUERTE
            Si elimino el auto, se elimina la llanta.
         */
        Llanta llanta = new Llanta(2,2,'w');
        Auto auto = new Auto(llanta);

        // System.out.println(auto.getTipoLlanta().imprimirLlanta());
        auto = null;
        //System.out.println(auto.getTipoLlanta().imprimirLlanta());

        /*
            ENLACE DÉBIL
            Aunque elimine el auto la llanta va a seguir existiendo.
         */
        Auto auto3 = new Auto(2,1,'S','P',"SD","1234","Caucho","Adelante","Chasisxd","Blue","WB",12.2,"PrimerModelo");
        // Esto hace que la llanta sea un objeto diferente y que apunte a su propio espacio de memoria.
        Llanta llanta3;
        llanta3 = auto3.getTipoLlanta();
        auto3 = null;
        System.out.println(llanta3.imprimirLlanta());
        //System.out.println(auto3.getTipoLlanta().imprimirLlanta());
    }
}
