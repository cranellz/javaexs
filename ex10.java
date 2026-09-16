
import javax.swing.JOptionPane;
public class ex10 {
    public static void main(String[]args){
        double n1= Double.parseDouble(JOptionPane.showInputDialog("digite o 1 numero"));

        double n2= Double.parseDouble(JOptionPane.showInputDialog("digite o 2 numero"));

        double n3= n1-n2;

        JOptionPane.showMessageDialog(null,"a diferenca dos dois numeros reais e de "+n3);
    }
}
