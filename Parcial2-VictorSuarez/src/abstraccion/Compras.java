package abstraccion;

public class Compras {

    private String nombre;
    private int sacos;
    private double precio;
    private double cargo;

    private int totalCompras;
    private double recaudado;
    private int comprasMayores;

    public void asignar(String nom, int sac) {
        nombre = nom;
        sacos = sac;
    }

    public double calcular() {

        if (sacos < 80) {
            precio = 9.00;
            cargo = 12.00;
        } else if (sacos < 200) {
            precio = 7.50;
            cargo = 8.00;
        } else {
            precio = 6.50;
            cargo = 5.00;
        }

        return sacos * precio + cargo;
    }

    public void totalizar(double monto) {
        totalCompras++;
        recaudado = recaudado + monto;

        if (monto > 800.00) {
            comprasMayores++;
        }
    }

    public String traerNom() {
        return nombre;
    }

    public int traerSac() {
        return sacos;
    }

    public int traerTot() {
        return totalCompras;
    }

    public double traerRec() {
        return recaudado;
    }

    public int traerMay() {
        return comprasMayores;
    }
}

