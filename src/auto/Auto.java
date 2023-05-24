package auto;

public class Auto {
    private Placa placa;
    private Llanta tipoLlanta;
    private Moqueta tipoMoqueta;
    private String chasis;
    private String color;
    private String marca;
    private double torque;
    private String modelo;


    public Auto(){
        this.tipoLlanta = new Llanta(2,2,'s');
        this.tipoMoqueta = new Moqueta();
        this.placa = new Placa();
        this.color = "";
        this.marca = "";
        this.chasis = "";
        this.torque = 0.0;
    }


    public Auto(Placa placa, Llanta tipoLlanta, Moqueta tipoMoqueta, String chasis, String color, String marca, double torque, String modelo) {
        this.placa = placa;
        this.tipoLlanta = tipoLlanta;
        this.tipoMoqueta = tipoMoqueta;
        this.chasis = chasis;
        this.color = color;
        this.marca = marca;
        this.torque = torque;
        this.modelo = modelo;
    }

    // Este constructor no se utiliza para crear objetos desde la consola,
    // Usualmente se utiliza en las Bases de Datos
    public Auto(int rin, double grosor, char labrado,char provincia, String idLetra, String idNumero,String material, String ubicacion,String chasis, String color, String marca, double torque, String modelo){
        // Esto siempre va a estar dentro del objeto.
        this.tipoLlanta = new Llanta(rin,grosor,labrado);
        this.placa = new Placa(provincia,idLetra,idNumero);
        this.tipoMoqueta = new Moqueta(material,ubicacion);
        this.chasis = chasis;
        this.color = color;
        this.marca = marca;
        this.torque = torque;
        this.modelo = modelo;
    }

    public Auto(Llanta llanta){
        this.tipoLlanta = llanta;
    }

    public String imprimirAuto(){
        return String.format("El vehículo modelo %s, marca %s, color %s, chasis %s, toque de motor %.2f, tiene un tipo de moqueta: %s, una placa: %s y un tipo de llanta: %s ",
                this.modelo, this.marca, this.color, this.chasis, this.torque, this.tipoMoqueta.imprimirMoqueta(),
                this.placa.imprimirPlaca(),this.tipoLlanta.imprimirLlanta());
    }

    public Llanta getTipoLlanta() {
        return tipoLlanta;
    }

}
