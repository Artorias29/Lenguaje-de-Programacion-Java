package jopane;

public class Premio {
    private double montoPremio;

    public void setMontoPremio(double m) {
        montoPremio = m;
    }

    public double calcularParte() {
        return montoPremio / 3;
    }

    public double getMontoPremio() {
        return montoPremio;
    }
}