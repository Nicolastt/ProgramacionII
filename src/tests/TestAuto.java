package tests;

import auto.Llanta;

public class TestAuto {
    public static void main(String[] args) {
        Llanta llanta1 = new Llanta(5,3.2,'H');

        String num = "12";
        double x = Double.parseDouble(num);
        System.out.println(x);

        System.out.println("----------- ANTES -----------");
        System.out.println("El número de rin de mi llanta es: " + llanta1.getRin());
        System.out.println("El número de grosor de mi llanta es: " + llanta1.getGrosor());
        System.out.println("El número de labrado de mi llanta es: " + llanta1.getLabrado());
        System.out.println("---------- DESPUÉS ----------");
        llanta1.setRin(1);
        System.out.println("El nuevo número de rin de mi llanta es: " + llanta1.getRin());
        System.out.println("---------- INLLANTA ----------");
        //System.out.println(llanta1.inLlanta()); // -> Necesita el sout para imprimir.
        llanta1.inLlanta(); // -> No imprime nada
        System.out.println("---------- INLLANTA ----------");
        llanta1.imprimir(); // -> Imprime sí o sí




    }
}
