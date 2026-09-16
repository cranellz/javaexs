import javax.swing.JOptionPane;

public class ex11{
    public static void main(String[]args){
       double raio= Double.parseDouble(JOptionPane.showInputDialog("digite o raio da circuferencia"));

       double comprimento= 2 * Math.PI * raio;

       JOptionPane.showMessageDialog(null, "O comprimento da circuferencia e "+comprimento);
    }
}