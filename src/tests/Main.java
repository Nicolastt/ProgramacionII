package tests;

import auto.Placa;

public class Main {
    public static void main(String[] args) {
        Placa pl2;
        Placa pl1 = new Placa('A',"SA","1234");
        pl2 = pl1;

        if (pl1 == pl2){
            System.out.println("Son el mismo objeto!");
        }
    }
}
