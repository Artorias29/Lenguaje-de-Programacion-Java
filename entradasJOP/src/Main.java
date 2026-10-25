import jopane.Premio;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Premio obj = new Premio();
        boolean leido = false;
        double monto = 0;

        ImageIcon imagen = new ImageIcon(System.getProperty("user.dir") + "/imagenes/Premio.jpg");

        do {
            try {
                monto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto total del premio:"));
                if (monto <= 0) {
                    JOptionPane.showMessageDialog(null, "VUELVA A LEER\n\nNO HAY MONTOS NEGATIVOS O CERO", "VALIDACION", JOptionPane.ERROR_MESSAGE);
                    leido = false;
                } else {
                    leido = true;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "VUELVA A LEER\n\nERROR DE CONVERSION", "VALIDACION", JOptionPane.ERROR_MESSAGE);
                leido = false;
            }
        } while (!leido);

        obj.setMontoPremio(monto);
        JOptionPane.showMessageDialog(null,
                "Premio:" + "\n\n" + "Cada estudiante recibirá: $" + obj.calcularParte(),
                "RESULTADO",
                JOptionPane.INFORMATION_MESSAGE,
                imagen);
    }
}