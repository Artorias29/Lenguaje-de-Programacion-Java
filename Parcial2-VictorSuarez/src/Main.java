
import abstraccion.Compras;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
        );

        Compras obj = new Compras();

        String nombre = "";
        String entrada;
        int cantidad = 0;
        int sacos = 0;
        boolean correcto;

        // Leer la cantidad de compras
        do {
            correcto = true;

            try {
                System.out.println("Cantidad de compras:");
                entrada = br.readLine();
                cantidad = Integer.parseInt(entrada);

                if (cantidad <= 0) {
                    System.out.println(
                            "La cantidad debe ser mayor que cero."
                    );
                    correcto = false;
                }

            } catch (NumberFormatException e) {
                System.out.println(
                        "Error: debe ingresar un numero entero."
                );
                correcto = false;

            } catch (IOException e) {
                System.out.println("Error de entrada: " + e);
                correcto = false;
            }

        } while (!correcto);

        // Procesar cada compra
        for (int i = 1; i <= cantidad; i++) {

            System.out.println("\nCOMPRA #" + i);

            // Leer nombre del cliente
            do {
                correcto = true;

                try {
                    System.out.println("Nombre del cliente:");
                    nombre = br.readLine();

                    if (nombre == null || nombre.trim().isEmpty()) {
                        System.out.println(
                                "El nombre no puede estar vacio."
                        );
                        correcto = false;
                    }

                } catch (IOException e) {
                    System.out.println("Error de entrada: " + e);
                    correcto = false;
                }

            } while (!correcto);

            // Leer cantidad de sacos
            do {
                correcto = true;

                try {
                    System.out.println("Cantidad de sacos:");
                    entrada = br.readLine();
                    sacos = Integer.parseInt(entrada);

                    if (sacos <= 0) {
                        System.out.println(
                                "La cantidad de sacos debe ser positiva."
                        );
                        correcto = false;
                    }

                } catch (NumberFormatException e) {
                    System.out.println(
                            "Error: ingrese una cantidad entera valida."
                    );
                    correcto = false;

                } catch (IOException e) {
                    System.out.println("Error de entrada: " + e);
                    correcto = false;
                }

            } while (!correcto);

            // Guardar datos y calcular la compra
            obj.asignar(nombre, sacos);

            double monto = obj.calcular();

            // Mostrar los datos de la compra
            System.out.println("\nRESULTADO DE LA COMPRA");
            System.out.println("Nombre: " + obj.traerNom());
            System.out.println(
                    "Sacos adquiridos: " + obj.traerSac()
            );

            System.out.printf(
                    "Monto a cancelar: B/. %.2f%n", monto
            );

            // Actualizar los totales
            obj.totalizar(monto);
        }

        // Mostrar resumen final
        System.out.println("\n===== RESUMEN FINAL =====");

        System.out.println(
                "Total de compras realizadas: " + obj.traerTot()
        );

        System.out.printf(
                "Dinero recaudado: B/. %.2f%n",
                obj.traerRec()
        );

        System.out.println(
                "Compras superiores a B/.800.00: " + obj.traerMay()
        );
    }
}
