package tests.testsAuto;

import auto.Cedula;

public class TestCedula {
    public static void main(String[] args) {
        System.out.println(Cedula.getNumeroDeCedulas());
        System.out.println("---------------");
        Cedula c1 = new Cedula("Pupiales", "A", "Nico", 25, 8, 2003, "12312");
        Cedula c2 = new Cedula("Guevara", "Xd", "Marco", 15, 1, 2005, "12122");
        System.out.println("---------------");
        System.out.println(Cedula.getNumeroDeCedulas());
        System.out.println("---------------");
        System.out.println(c1.getIdentificador());
        System.out.println("---------------");
        System.out.println(c2.getIdentificador());
    }
}
