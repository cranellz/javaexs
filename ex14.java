import javax.swing.JOptionPane;
public class ex14{
    public static void main(String[]args){
        double angulo1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do angulo 1"));

        double angulo2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do angulo 2"));
    
        double angulo3= (angulo1+ angulo2) -180;

        JOptionPane.showMessageDialog(null, "O angulo 3 equivale a "+angulo3);

    }
}