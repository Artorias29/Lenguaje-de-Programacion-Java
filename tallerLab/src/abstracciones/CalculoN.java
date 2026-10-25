package abstracciones;

public class CalculoN {
    private int n1, n2, n3;

    public CalculoN() {
        n1 = 0;
        n2 = 0;
        n3 = 0;
    }

    public void setN1(int n1) { this.n1 = n1; }
    public void setN2(int n2) { this.n2 = n2; }
    public void setN3(int n3) { this.n3 = n3; }

    public int getN1() { return n1; }
    public int getN2() { return n2; }
    public int getN3() { return n3; }

    public int sumar()      { return n1 + n2 + n3; }
    public double calcProm(){ return (n1 + n2 + n3) / 3.0; }
    public int calculaP()   { return n1 * n2 * n3; }
}