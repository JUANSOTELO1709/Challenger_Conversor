import javax.swing.JOptionPane;

public class FuncionTemp3 {

    ConversionesT temp = new ConversionesT();

    public void ConversionesT(double Valoringresado) {

        String Celsius[] = { "fahrenheit", "Kelvin" };
        String Opcionfahrenheit = (JOptionPane.showInputDialog(null, "elija su Convercion",
                "bienvenido", JOptionPane.PLAIN_MESSAGE, null, Celsius, "selected")).toString();
        switch (Opcionfahrenheit) {
            case "fahrenheit":
                temp.convCafah(Valoringresado);
                break;
            case "Kelvin":
                temp.convCaKelvin(Valoringresado);

        }

    }
}
