import javax.swing.JOptionPane;

public class ex26{
    public static void variaveis(String[] args) {
        int n1,n2;
        
        n1= Integer.parseInt(JOptionPane.showInputDialog("Digite o numero"));

        n2= Integer.parseInt(JOptionPane.showInputDialog("Digite o numero"));
        condicao(n1,n2);
    }
    public static void condicao(int n1, int n2) {
        if (n1 % n2 == 0) {
        JOptionPane.showMessageDialog(null,"é mutiplo do menor");
    }
    else{
        JOptionPane.showMessageDialog(null, "nao é mutiplo do menor");
    }
    if(n2 % n2 ==0){
        JOptionPane.showMessageDialog(null,"é mutiplo do menor");
    }
    else{
        JOptionPane.showMessageDialog(null,"nao é mutiplo do menor");
    }
}
}