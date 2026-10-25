import abstraccion.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        double largo, alto, ancho;
        int esfera5, esfera7, esfera10, sinEsfera;
        esfera5 = esfera7 = esfera10 = sinEsfera = 0;
        boolean leido;

        Cajas obj = new Cajas();
        Icon regalo = new ImageIcon("imagenes/regaloInterfaz.png");
        Icon esferas = new ImageIcon("imagenes/esferas.png");
        Icon advertencia = new ImageIcon("imagenes/advertencia.png");

        for (int i = 1; i <= 1000; i++) {

            JOptionPane.showMessageDialog(null, "Caja " + i + " de 1000\nIntroduzca:"
                    + "\n 1. Largo"
                    + "\n 2. Ancho"
                    + "\n 3. Alto", "Navidad Mágica S.A.", 1, regalo);

            // Largo
            largo = 0;
            leido = false;
            do {
                try {
                    largo = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el largo"));
                    if (largo <= 0) {
                        JOptionPane.showMessageDialog(null, "VUELVA A LEER\n\nNO HAY DIMENSIONES NEGATIVAS", "VALIDACION", JOptionPane.ERROR_MESSAGE);
                        leido = false;
                    } else leido = true;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "VUELVA A LEER\n\nERROR DE CONVERSION", "VALIDACION", JOptionPane.ERROR_MESSAGE);
                    leido = false;
                }
            } while (!leido);

            // Ancho
            ancho = 0;
            leido = false;
            do {
                try {
                    ancho = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el ancho"));
                    if (ancho <= 0) {
                        JOptionPane.showMessageDialog(null, "VUELVA A LEER\n\nNO HAY DIMENSIONES NEGATIVAS", "VALIDACION", JOptionPane.ERROR_MESSAGE);
                        leido = false;
                    } else leido = true;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "VUELVA A LEER\n\nERROR DE CONVERSION", "VALIDACION", JOptionPane.ERROR_MESSAGE);
                    leido = false;
                }
            } while (!leido);

            // Alto
            alto = 0;
            leido = false;
            do {
                try {
                    alto = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el alto"));
                    if (alto <= 0) {
                        JOptionPane.showMessageDialog(null, "VUELVA A LEER\n\nNO HAY DIMENSIONES NEGATIVAS", "VALIDACION", JOptionPane.ERROR_MESSAGE);
                        leido = false;
                    } else leido = true;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "VUELVA A LEER\n\nERROR DE CONVERSION", "VALIDACION", JOptionPane.ERROR_MESSAGE);
                    leido = false;
                }
            } while (!leido);

            obj.asignar(largo, ancho, alto);
            int resultado = obj.determiE();

            if (resultado == 5)  esfera5++;
            if (resultado == 7)  esfera7++;
            if (resultado == 10) esfera10++;
            if (resultado == -1) sinEsfera++;
        }

        JOptionPane.showMessageDialog(null,
                "Total de Cajas por Tamaño\n\n"
                        + "Cápsulas ≤ 5 pulg:    " + esfera5 + "\n\n"
                        + "Cápsulas 6-7 pulg:    " + esfera7 + "\n\n"
                        + "Cápsulas 8-10 pulg:   " + esfera10 + "\n\n"
                        + "No caben en ninguna:  " + sinEsfera,
                "Navidad Mágica S.A.", 1, esferas);
    }
}