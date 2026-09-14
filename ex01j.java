import javax.swing.JOptionPane;

public class ex01j {
    public static void main(String[] args) {
        double lado = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do lado do quadrado"));
        JOptionPane.showMessageDialog(null, "a area do quadrado e " + lado * lado);
    }
}
