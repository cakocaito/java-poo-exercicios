public class Main {
    public static void main(String[] args) {
        Circulo c = new Circulo(2.0);
        System.out.println(c.calculaArea());
        Quadrado q = new Quadrado(3.0);
        System.out.println(q.calculaArea());
        Retangulo r = new Retangulo(4.0, 2.0);
        System.out.println(r.calculaArea());
        Triangulo t = new Triangulo(5.0, 2.0);
        System.out.println(t.calculaArea());
    }
}