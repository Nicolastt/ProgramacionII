package auto;

public class Moqueta {
    private String material;
    private String ubicacion;

    public Moqueta() {
        this.material = "";
        this.ubicacion = "";
    }
    public Moqueta(String material, String ubicacion) {
        this.material = material;
        this.ubicacion = ubicacion;
    }

    public String imprimirMoqueta() {
        return String.format("La moqueta está hecha de %s y está ubicada en %s",this.material,this.ubicacion);
    }
}
