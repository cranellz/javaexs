import javax.swing.JOptionPane;
public class ex02 {
    public static void main(String[] args) {
        double salario= Double.parseDouble(JOptionPane.showInputDialog("digite o salario atual do funcionario"));
        double newsalario= salario*1.15;
        JOptionPane.showMessageDialog(null,"o reajuste de 15% SERA DE "+newsalario);
    }
}
