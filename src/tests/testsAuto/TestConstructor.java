package tests.testsAuto;

import auto.Auto;
import auto.Llanta;
import auto.Moqueta;
import auto.Placa;

public class TestConstructor {
    public static void main(String[] args) {

        Llanta llanta1 = new Llanta(2,2.2,'S');
        Placa placa1 = new Placa('P',"DF","1111");
        Moqueta moqueta1 = new Moqueta("Caucho","Adelante");

        // Primer constructor
        //Auto auto1 = new Auto();
        //auto1.imprimirAuto();

        // Segundo constructor
        // Este tiene objetos independientes placa1, llanta1, moqueta1 porque se crean afuera -> Estas son referencias.
        // Al ser referencias van a cambiar cuando una cambie;
        Auto auto2 = new Auto(placa1,llanta1,moqueta1, "Chasis1", "rojo","Ferraro",100,"Modelo1");
        System.out.println(auto2.imprimirAuto());
        auto2.getTipoLlanta().setRin(213);
        System.out.println(auto2.imprimirAuto());

        // Tercer constructor
        Auto auto3 = new Auto(2,1,'S','P',"SD","1234","Caucho","Adelante","Chasisxd","Blue","WB",12.2,"PrimerModelo");
        System.out.println(auto3.imprimirAuto());
        // Esta llanta no existe fuera del at3
        // Hay objetos que no tiene sentido que existan fuera del objeto grande.
        // Por ejemplo, nos da igual de que exista la llanta y no el auto, lo importante es el auto.
        // Vulcanizadora: Me importan las llantas.
        // Mecánica: No me importan las llantas.
        auto3.getTipoLlanta().setRin(21); // Este get devuelve toda la llanta.
        System.out.println(auto3.imprimirAuto());

        // Sacamos el objeto Llanta, para que exista fuera del objeto Auto
        // Ahora llanta 3 existe por su parte, si se borra el auto esta existe.
        // Enlace fuerte: Enlace de parámetros en donde no solo se crea una referencia a un espacio de memoria, 
        // A pesar de que hace referencia es un objeto en sí mismo, por eso cuando eliminamos el auto3, la llanta sigue con
        // lo último que guardó.
        Llanta llanta3;
        llanta3 = auto3.getTipoLlanta();
        llanta3.setRin(1400);
        System.out.println(auto3.imprimirAuto());



        auto3 = null;
        //llanta3 = null; -> Aquí eliminamos la referencia de llanta3
        //System.out.println(auto3.imprimirAuto());
        //La llanta3 sigue existiendo porque no hay ninguna relación de enlace fuerte
        // entre ella y el auto3.
        System.out.println(llanta3.imprimirLlanta());
    }
}
