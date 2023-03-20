import javax.swing.JOptionPane;

public class ConversionesM {
    // "De pesos a Dolares" 4764.71
    // "De pesos a Euros" 5134.22
    // "De pesos a Libras esterlinas" 5802.23
    // "De pesos a yen japones" 36.15
    // "De pesos a won sulcoreano" }; 3.64

    public void convPesosADolares(double valor) {
        double aDolar = valor / 4764.71;
        aDolar = (double) Math.round(aDolar * 100d) / 100;
        JOptionPane.showMessageDialog(null, "tienes " + aDolar + " Dolares");
    }

    public void convPesosAEuros(double valor) {
        double aEuro = valor / 5134.22;
        aEuro = (double) Math.round(aEuro * 100d) / 100;
        JOptionPane.showMessageDialog(null, "tienes " + aEuro + " Euros");
    }

    public void convPesosALibras(double valor) {
        double aLibra = valor / 5802.23;
        aLibra = (double) Math.round(aLibra * 100d) / 100;
        JOptionPane.showMessageDialog(null, "tienes " + aLibra + " Libras");
    }

    public void convPesosAYenes(double valor) {
        double aYen = valor / 36.15;
        aYen = (double) Math.round(aYen * 100d) / 100;
        JOptionPane.showMessageDialog(null, "tienes" + aYen + " Yenes");
    }

    public void convPesosAWones(double valor) {
        double aWon = valor / 3.64;
        aWon = (double) Math.round(aWon * 100d) / 100;
        JOptionPane.showMessageDialog(null, "tienes" + aWon + " Wones");
    }
}
