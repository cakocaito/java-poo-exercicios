public class Circulo extends Figura {
    private Double raio;
    public Double calculaArea() {
        return Math.PI*Math.pow(this.raio, 2);
    }

    public Circulo(Double raio) {
        this.raio = raio;
    }
}
