import javax.swing.JOptionPane;

public class ex24{
    public static void variaveis(String[] args) {
        int n1;
        n1=Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero"));
        decisao(n1);
    }
    public static void decisao(int n1) {
        if (numero % 2 == 0 && numero % 3 == 0) {
            JOptionPane.showMessageDialog(null, "É divisivel por 2 e 3");   
    }
        else{
            JOptionPane.showMessageDialog(null, "Nao é divisivel por 2 e 3");
        }
}
}