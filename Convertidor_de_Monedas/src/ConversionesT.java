import javax.swing.JOptionPane;

public class ConversionesT {
    // "De Kelvin a C
    // "De Kel a Fah
    // "De Fah a C
    // "De Fah a K
    // "De C a Kelvin
    // "de C a fah"

    public void DeKelvinACelcius(double valor) { // conversion de kelvin a Celsius
        double Celcio = valor - 273.15;
        Celcio = (double) Math.round(Celcio * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes " + Celcio + " Grados Celsius");
    }

    public void DeKelvinAFahrenheit(double valor) { // Conversion de kelvin a fahrenheit
        double Cel = valor - 273.15; // primero se pasa a celsius
        double Fahrenheit = (Cel * 1.8) + 32; // de celsius a fahrenheit se multiplica por el 1.8 y suma 32
        Fahrenheit = (double) Math.round(Fahrenheit * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes " + Fahrenheit + " Grados fahrenheit");
    }

    public void convFahaC(double valor) { // conversion de fahrenheit a celsius
        double fah = valor - 32;
        double rta_celsius = fah * 0.555;
        rta_celsius = (double) Math.round(rta_celsius * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes " + rta_celsius + " Celsius");
    }

    public void convfahaK(double valor) { // Conversion de fahrenheit a kelvin
        double fah = valor - 32;
        double rta_celsius = fah * 0.555;
        double rta_kelvin = rta_celsius + 273.15;
        rta_kelvin = (double) Math.round(rta_kelvin * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes " + rta_kelvin + "grados kelvin");
    }

    public void convCaKelvin(double valor) { // Conversion de celsius a Kelvin

        double rta_kelvin = valor + 273.15;
        rta_kelvin = (double) Math.round(rta_kelvin * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes " + rta_kelvin + "grados kelvin");
    }

    public void convCafah(double valor) { // Conversion de celsius a fahrenheit
        double fah = valor * 0.555; // 0.555 es 5/9
        double rta_fah = fah + 32;
        JOptionPane.showMessageDialog(null, "Tienes " + rta_fah + " Grados fahrenheit");
    }

}
