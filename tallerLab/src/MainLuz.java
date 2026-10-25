import abstracciones.Luz;
import java.util.Scanner;

public class MainLuz {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        Luz     obj = new Luz();

        System.out.print("Ingrese tiempo en segundos: ");
        obj.setTiempo(sc.nextDouble());

        System.out.println("\n--- Resultados ---");
        System.out.println("Tiempo:    " + obj.getTiempo() + " seg");
        System.out.println("Distancia: " + obj.calcularD() + " km");

        sc.close();
    }
}