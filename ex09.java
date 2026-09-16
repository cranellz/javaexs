import javax.swing.JOptionPane;
public class ex09{
    public static void main(String[]args){
       int n1= Integer.parseInt(JOptionPane.showInputDialog("Digite o 1 numero "));

       int n2= Integer.parseInt(JOptionPane.showInputDialog("Digite o numero 2"));

       int somadosquadrados = (n1*n1) + (n2*n2);

       JOptionPane.showMessageDialog(null, "A soma dos quadros e igual a "+somadosquadrados);

}
}