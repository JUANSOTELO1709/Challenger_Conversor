import javax.swing.JOptionPane;

public class MonedasFuncion {

    ConversionesM monedas = new ConversionesM();
    // ConvertirMonedasAPesos pesos = new ConvertirMonedasAPesos();

    public void ConversionesM(double Valoringresado) {

        String conversionespe[] = {
                "De pesos a Dolares", // 0
                "De pesos a Euros", // 1
                "De pesos a Libras esterlinas", // 2
                "De pesos a yen japones", // 3
                "De pesos a won sulcoreano" }; // 4

        String Opciones = (JOptionPane.showInputDialog(null, "Elija moneda",
                "bienvenido", JOptionPane.PLAIN_MESSAGE, null, conversionespe, "Selecciona")).toString();

        switch (Opciones) {
            case "De pesos a Dolares":
                monedas.convPesosADolares(Valoringresado);
                break;
            case "De pesos a Euros":
                monedas.convPesosAEuros(Valoringresado);
                break;
            case "De pesos a Libras esterlinas":
                monedas.convPesosALibras(Valoringresado);
                break;
            case "De pesos a yen japones":
                monedas.convPesosAYenes(Valoringresado);
                break;
            case "De pesos a won sulcoreano":
                monedas.convPesosAWones(Valoringresado);
                break;
        }

    }
}
