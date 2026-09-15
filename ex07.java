import javax.swing.JOptionPane;
public class ex07{
    public static void main(String[]args){
        double comprimento = Double.parseDouble(JOptionPane.showInputDialog("digite o valor do comprimento"));

        double largura= Double.parseDouble(JOptionPane.showInputDialog("digite o valor da largura"));

        double altura= Double.parseDouble(JOptionPane.showInputDialog("digite o valor da altura"));

        double volume= comprimento* largura* altura;

        JOptionPane.showMessageDialog(null,"o valor do volume e de"+volume);
    }
}