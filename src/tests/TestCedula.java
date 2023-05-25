package tests;

import auto.Cedula;

public class TestCedula {
    public static void main(String[] args) {
        System.out.println(Cedula.getNumeroDeCedulas());
        System.out.println("---------------");
        Cedula c1 = new Cedula("Motoche", "Nsea", "Nico", 25, 8, 2003, "12312");
        Cedula c2 = new Cedula("Motoche", "Nsea", "Nico", 25, 8, 2003, "12312");
        System.out.println("---------------");
        System.out.println(Cedula.getNumeroDeCedulas());
        System.out.println("---------------");
        System.out.println(c1.getIdentificador());
        System.out.println("---------------");
        System.out.println(c2.getIdentificador());
    }
}
