package abstraccion;

public class Cajas {


    private double a, b, c;

    public void asignar(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double calcularD() {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));
    }

    public int determiE() {
        double diametro = calcularD();

            if (diametro <= 5)   return 5;   // grupo "5 o menos"
            if (diametro <= 7)   return 7;   // grupo "6 a 7"
            if (diametro <= 10)  return 10;  // grupo "8 a 10"

        return -1;
    }
}