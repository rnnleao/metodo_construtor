public class Carro{
    private String cor;
    private String modelo;
    private int aro;
    private double valorCarro;

    public Carro(){

    }
    public Carro(int aro){
        this.aro=aro;
    }
    public Carro(int aro, String modelo){
        this.aro=aro;
        this.modelo=modelo;
    }
    public Carro(int aro, String modelo, String cor){
        this.aro=aro;
        this.modelo=modelo;
        this.cor=cor;
    }
    public Carro(int aro, String modelo, String cor, double valorCarro){
        this.aro=aro;
        this.modelo=modelo;
        this.cor=cor;
        this.valorCarro=valorCarro;
    }
}