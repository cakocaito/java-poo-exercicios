public class Triangulo extends Figura {
    private Double base;
    private Double altura;
    public Double calculaArea() {
        return (base*altura)/2;
    }
    public Triangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }
}
