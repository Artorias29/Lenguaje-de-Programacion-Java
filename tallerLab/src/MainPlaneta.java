import abstracciones.Planeta;
import java.util.Scanner;

public class MainPlaneta {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("--- Planeta 1 ---");
            System.out.print("Nombre: ");        String nom1  = sc.next();
            System.out.print("Satelites: ");     int    sat1  = sc.nextInt();
            System.out.print("Masa (kg): ");     double masa1 = sc.nextDouble();
            System.out.print("Volumen (km3): "); double vol1  = sc.nextDouble();
            System.out.print("Diametro (km): "); int    diam1 = sc.nextInt();
            System.out.print("Distancia (km): ");int    dist1 = sc.nextInt();
            System.out.print("Tipo: ");          String tipo1 = sc.next();

            Planeta p1 = new Planeta(nom1, sat1, masa1, vol1, diam1, dist1, tipo1);

            System.out.println("--- Planeta 2 ---");
            System.out.print("Nombre: ");        String nom2  = sc.next();
            System.out.print("Satelites: ");     int    sat2  = sc.nextInt();
            System.out.print("Masa (kg): ");     double masa2 = sc.nextDouble();
            System.out.print("Volumen (km3): "); double vol2  = sc.nextDouble();
            System.out.print("Diametro (km): "); int    diam2 = sc.nextInt();
            System.out.print("Distancia (km): ");int    dist2 = sc.nextInt();
            System.out.print("Tipo: ");          String tipo2 = sc.next();

            Planeta p2 = new Planeta(nom2, sat2, masa2, vol2, diam2, dist2, tipo2);

            System.out.println("\n--- Datos Planeta 1 ---");
            System.out.println("Nombre:    " + p1.getNom());
            System.out.println("Satelites: " + p1.getNSat());
            System.out.println("Masa:      " + p1.getMasa());
            System.out.println("Volumen:   " + p1.getVol());
            System.out.println("Diametro:  " + p1.getDiam());
            System.out.println("Distancia: " + p1.getDist());
            System.out.println("Tipo:      " + p1.getTipo());
            System.out.println("Densidad:  " + p1.calcD());

            System.out.println("\n--- Datos Planeta 2 ---");
            System.out.println("Nombre:    " + p2.getNom());
            System.out.println("Satelites: " + p2.getNSat());
            System.out.println("Masa:      " + p2.getMasa());
            System.out.println("Volumen:   " + p2.getVol());
            System.out.println("Diametro:  " + p2.getDiam());
            System.out.println("Distancia: " + p2.getDist());
            System.out.println("Tipo:      " + p2.getTipo());
            System.out.println("Densidad:  " + p2.calcD());

            sc.close();
        }
    }