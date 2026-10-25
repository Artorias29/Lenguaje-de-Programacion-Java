package abstracciones;

public class Luz {
    private double tiempo;

    public Luz() {
        tiempo = 0;
    }

    public void setTiempo(double tiempo) { this.tiempo = tiempo; }
    public double getTiempo()            { return tiempo; }
    public double calcularD()            { return tiempo * 300000; }
}