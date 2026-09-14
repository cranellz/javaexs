import javax.swing.JOptionPane;
public class ex03{
    public static void main(String[]args){
        double base= Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da base"));
        double altura= Double.parseDouble(JOptionPane.showInputDialog("Digite a altura"));
        double area = base*altura/2;
        JOptionPane.showMessageDialog(null,"O valor da area do triangulo é de "+area);
    }
}