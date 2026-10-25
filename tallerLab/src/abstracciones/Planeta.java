package abstracciones;

public class Planeta {
    private String nombre;
    private int nSat;
    private double masa;
    private double vol;
    private int diam;
    private int dist;
    private String tipo;

    public Planeta(String nombre, int nSat, double masa, double vol,
                   int diam, int dist, String tipo) {
        this.nombre = nombre;
        this.nSat = nSat;
        this.masa = masa;
        this.vol = vol;
        this.diam = diam;
        this.dist = dist;
        this.tipo = tipo;
    }

    public String getNom() { return nombre; }
    public void setNom(String nombre) { this.nombre = nombre; }

    public int getNSat() { return nSat; }
    public void setNSat(int nSat) { this.nSat = nSat; }

    public double getMasa() { return masa; }
    public void setMasa(double masa) { this.masa = masa; }

    public double getVol() { return vol; }
    public void setVol(double vol) { this.vol = vol; }

    public int getDiam() { return diam; }
    public void setDiam(int diam) { this.diam = diam; }

    public int getDist() { return dist; }
    public void setDist(int dist) { this.dist = dist; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public double calcD() { return masa / vol; }
}

