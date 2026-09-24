import javax.swing.JOptionpane;

public class ex22{
    public static void inteiros(String[] args) {
        int n1,n2;

        n1= Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero"));
        n2= Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero"));

        condicional(n1,n2);
    }
    public static void condicional(String[] args) {
        if(n1>n2){
            JOptionPane.showMessageDialog(null,"O maior numero se equivale a "+n1);
        }
        else{
            JOptionPane.showMessageDialog(null, "O maior numero se equivale a "+n2);
        }
    }
}