package examenJava;

// Clase padre:
class FiguraGeometrica {
    protected double alto;
    protected double ancho;

    public FiguraGeometrica(double alto, double ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }

    public double calcularArea() {
        return alto * ancho;
    }

    public double calcularPerimetro() {
        return 2 * (alto + ancho);
    }

    public double calcularHipotenusa() {
        return Math.sqrt(alto * alto + ancho * ancho);
    }
}

