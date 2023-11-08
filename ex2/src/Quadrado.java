public class Quadrado extends Figura {
    private Double lado;
    public Double calculaArea() {
        return lado*lado;
    }
    public Quadrado(Double lado) {
        this.lado = lado;
    }
}
