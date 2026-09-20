import javax.swing.JOptionPane;

public class ex20 {

    public static void main(String[] args) {
        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero real:"));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero real:"));

        decisaodedados(n1, n2); 
    }

    public static void decisaodedados(double n1, double n2) {
        if (n1 > n2) {
            JOptionPane.showMessageDialog(null, "O maior numero equivale ao primeiro: " + n1);
        } else {
            JOptionPane.showMessageDialog(null, "O maior numero equivale ao segundo: " + n2);
        }
    }
}
