public class Rectangulo {
    private final double base;
    private final double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return base * altura;
    }

    public double calcularPerimetro() {
        return 2 * (base + altura);
    }
}