package tests;

public class Triangulo {
    private int base;
    private int altura;

    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public void calcularArea() {
        System.out.println("El área es " + (base*altura));
    }
}
