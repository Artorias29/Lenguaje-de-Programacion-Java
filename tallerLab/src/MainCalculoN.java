import abstracciones.CalculoN;
import java.util.Scanner;

public class MainCalculoN {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        CalculoN obj = new CalculoN();

        System.out.print("Ingrese n1: ");
        obj.setN1(sc.nextInt());
        System.out.print("Ingrese n2: ");
        obj.setN2(sc.nextInt());
        System.out.print("Ingrese n3: ");
        obj.setN3(sc.nextInt());

        System.out.println("\n--- Resultados ---");
        System.out.println("N1: "       + obj.getN1());
        System.out.println("N2: "       + obj.getN2());
        System.out.println("N3: "       + obj.getN3());
        System.out.println("Suma: "     + obj.sumar());
        System.out.println("Promedio: " + obj.calcProm());
        System.out.println("Producto: " + obj.calculaP());

        sc.close();
    }
}