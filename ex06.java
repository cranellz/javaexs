import javax.swing.JOptionPane;

public class ex06 {
    public static void main(String[] args) {
        double x = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de x"));
        double y = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de y"));

        JOptionPane.showMessageDialog(null, "O valor de x é: " + y);
        JOptionPane.showMessageDialog(null, "O valor de y é: " + x);
    }
}