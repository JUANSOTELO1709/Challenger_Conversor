import javax.swing.JOptionPane;

public class ejemplo {

    public static void main(String[] args) {
        String tempetarurasMenu[] = { "De Kelvin a Celsius", "De Kelvin a Fahrenheit ",
                "De Fahrenheit  a Celsius", "De Fahrenheit  a Kelvin", "De Celsius a Kelvin ",
                "de Celsius a Fahrenheit " };

        JOptionPane.showInputDialog(null, "Cual es la temperatura que tiene en grados",
                "Conversor", JOptionPane.PLAIN_MESSAGE, null, tempetarurasMenu,
                "Seleccion").toString();

        String input = (JOptionPane.showInputDialog(null,
                "Cual es la cantidad de pesos que desea ingresar"));

        JOptionPane.showMessageDialog(null, "su mensaje es", input, 0);
    }
}
