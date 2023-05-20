package auto;

public class Llanta {
    private int rin;
    private double grosor;
    private  char labrado;

    public Llanta(int rin, double grosor, char labrado) {
        this.rin = rin;
        this.grosor = grosor;
        this.labrado = labrado;
    }

    public int getRin() {
        return rin;
    }

    public void setRin(int rin) {
        this.rin = rin;
    }

    public double getGrosor() {
        return grosor;
    }

    public void setGrosor(double grosor) {
        this.grosor = grosor;
    }

    public char getLabrado() {
        return labrado;
    }

    public void setLabrado(char labrado) {
        this.labrado = labrado;
    }

    public String inLlanta(){
        return String.format("La llanta tiene un ring de %d, un grosor de %.2f y un labrado de %c",this.rin,
                this.grosor, this.labrado);
    }

    public void imprimir(){
        System.out.println("La llana tiene un rin de " + this.rin +
                ", un labrado de " + this.labrado +
                " y un grosor de " + this.grosor);
    }


}
