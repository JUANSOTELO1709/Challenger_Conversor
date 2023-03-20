
//  - Convertir de la moneda de tu país a Dólar
//- Convertir de la moneda de tu país  a Euros
//- Convertir de la moneda de tu país  a Libras Esterlinas
//- Convertir de la moneda de tu país  a Yen Japonés
//- Convertir de la moneda de tu país  a Won sul-coreano

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import java.awt.Color;

public class Menu_principal {
    UIManager UI;

    public static void main(String[] args) {

        UIManager.put("OptionPane.background", Color.darkGray);
        // Establece el color de fondo de los botones en el JOptionPane
        UIManager.put("Panel.background", Color.gray);

        FuncionTemp temp = new FuncionTemp();
        FuncionTempFah temp2 = new FuncionTempFah();
        FuncionTemp3 temp3 = new FuncionTemp3();
        MonedasFuncion monedas = new MonedasFuncion();
        boolean start = true;

        while (start) {

            String Temperaturas[] = { "Kelvin", "farenheit", "celsius" };

            String menu[] = { "Monedas", "Temperaturas" };
            String Menu = (JOptionPane.showInputDialog(null, "Selecciona tu Opcion",
                    "Conversor", JOptionPane.PLAIN_MESSAGE, null, menu,
                    "Seleccion")).toString();

            switch (Menu) {
                case "Monedas":
                    String input = (JOptionPane.showInputDialog(null,
                            "Cual es la cantidad de pesos colombianos que desea ingresar?"));

                    if (ValidarNumero(input)) {
                        double Minput = Double.parseDouble(input);
                        monedas.ConversionesM(Minput);

                        int respuesta = JOptionPane.showConfirmDialog(null,
                                "Deseas seguir?");

                        if (respuesta == JOptionPane.YES_OPTION) {
                            System.out.println("Selecciona tu alternativa");
                        } else {
                            JOptionPane.showMessageDialog(null, "Programa finalizado");
                            start = false;
                        }
                    }
                    break;

                case "Temperaturas":
                    String Menu_temperatura = (JOptionPane
                            .showInputDialog(null, "Cual es la temperatura que desea cambiar",
                                    "Conversor", JOptionPane.PLAIN_MESSAGE, null, Temperaturas,
                                    "Seleccion")
                            .toString());

                    switch (Menu_temperatura) {
                        case "Kelvin":
                            String inputTK = (JOptionPane.showInputDialog(null,
                                    "Cuantos kelvin tiene?"));
                            if (ValidarNumero(inputTK)) {
                                double inputK = Double.parseDouble(inputTK);
                                temp.ConversionesT(inputK);
                                int respuesta = JOptionPane.showConfirmDialog(null,
                                        "Deseas seguir?");

                                if (respuesta == JOptionPane.YES_OPTION) {
                                    System.out.println("Selecciona tu alternativa");
                                } else {
                                    JOptionPane.showMessageDialog(null, "programa finalizado");
                                    start = false;
                                }
                            }
                            break;

                        case "farenheit":
                            String inputf = (JOptionPane.showInputDialog(null,
                                    "Cuantos fahrenheit tiene?"));
                            if (ValidarNumero(inputf)) {
                                double fahre = Double.parseDouble(inputf);
                                temp2.ConversionesT(fahre);
                                int respuesta = JOptionPane.showConfirmDialog(null,
                                        "Deseas seguir?");
                                if (respuesta == JOptionPane.YES_OPTION) {
                                    System.out.println("Selecciona tu alternativa");
                                } else {
                                    JOptionPane.showMessageDialog(null, "programa finalizado");
                                    start = false;
                                }
                            }
                            break;

                        case "celsius":
                            String inputC = (JOptionPane.showInputDialog(null,
                                    "Cuantos grados Celcius tiene?"));
                            if (ValidarNumero(inputC)) {
                                double cel = Double.parseDouble(inputC);
                                temp3.ConversionesT(cel);
                                int respuesta = JOptionPane.showConfirmDialog(null,
                                        "Deseas seguir?");
                                if (respuesta == JOptionPane.YES_OPTION) {
                                    System.out.println("Selecciona tu alternativa");
                                } else {
                                    JOptionPane.showMessageDialog(null, "programa finalizado");
                                    start = false;
                                }
                            }
                    }
            }
        }
    }

    public static boolean ValidarNumero(String input) { // Validar que todo ingreso sea numero
        try {
            double x = Double.parseDouble(input);
            if (x >= 0 || x < 0)
                ;
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}