package tests.testsAuto;

import auto.Auto;
import auto.Llanta;
import auto.Moqueta;
import auto.Placa;

public class TestPlaca {
    public static void main(String[] args) {
        Llanta llanta1 = new Llanta(5,3.2,'H');
        Placa placa1 = new Placa('P',"BS","1123");
        System.out.println(placa1.imprimirPlaca());
        Moqueta moqueta1 = new Moqueta("Caucho","Adelante");
        System.out.println(moqueta1.imprimirMoqueta());

        // ¡Los char pueden sumarse con un número!
        char a = 'f';
        System.out.println(a+5);
    }
}
