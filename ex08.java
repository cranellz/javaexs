import javax.swing.JOptionPane;

public class ex08 {
    public static void main(String[] args) {
        double deposito = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do deposito:"));

        double valorFinal = deposito * 1.013;

        JOptionPane.showMessageDialog(null, "O valor após 1 mês de rendimento e: RS " + String.format("%.2f", valorFinal));
    }
}