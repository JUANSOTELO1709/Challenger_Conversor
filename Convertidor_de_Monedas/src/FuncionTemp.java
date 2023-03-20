
import javax.swing.JOptionPane;

public class FuncionTemp {

    ConversionesT temp = new ConversionesT();

    public void ConversionesT(double Valoringresado) {

        String Kelvin[] = { "Fahrenheit_K", "Celsius_K" };
        String OpcionKelvin = (JOptionPane.showInputDialog(null, "elija su convercion",
                "bienvenido", JOptionPane.PLAIN_MESSAGE, null, Kelvin, "selecciona")).toString();
        switch (OpcionKelvin) {
            case "Fahrenheit_K":
                temp.DeKelvinAFahrenheit(Valoringresado);
                break;
            case "Celsius_K":
                temp.DeKelvinACelcius(Valoringresado);
                break;
        }

    }

}

// String Celsius[] = { "fahrenheit", "kelvin" };

// convercion",
// "bienvenido", JOptionPane.PLAIN_MESSAGE, null, Fahrenheit,
// "selecciona")).toString();

// String Opcioncelcios = (JOptionPane.showInputDialog(null, "elija su
// convercion",
// "bienvenido", JOptionPane.PLAIN_MESSAGE, null, Celsius,
// "selecciona")).toString();