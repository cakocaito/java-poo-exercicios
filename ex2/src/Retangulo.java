public class Retangulo extends Figura {
    private Double base;
    private Double altura;
    public Double calculaArea() {
        return base*altura;
    }
    public Retangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }
}
