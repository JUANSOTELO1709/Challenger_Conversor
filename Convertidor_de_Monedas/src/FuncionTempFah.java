import javax.swing.JOptionPane;

public class FuncionTempFah {

    ConversionesT temp = new ConversionesT();

    public void ConversionesT(double Valoringresado) {

        String Fahrenheit[] = { "celsius", "Kelvin" };
        String Opcionfahrenheit = (JOptionPane.showInputDialog(null, "elija su Convercion",
                "bienvenido", JOptionPane.PLAIN_MESSAGE, null, Fahrenheit, "selected")).toString();
        switch (Opcionfahrenheit) {
            case "celsius":
                temp.convFahaC(Valoringresado);
                break;
            case "Kelvin":
                temp.convfahaK(Valoringresado);
        }

    }
}
