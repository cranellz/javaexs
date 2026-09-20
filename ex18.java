import javax.swing.JOptionPane;

public class ex18{
    public static void main(String[]args){

        int n1,n2,diferenca;

        n1= Double.parseInteger(JOptionPane.showInputDialog("Digite o primeiro numero"));
        n2= Double.parseInteger(JOptionPane.showInputDialog("Digite o segundo numero"));

       if (n1> n2){
        diferenca= n1-n2;
       }
       else{
        diferenca= n2-n1;
       }

       JOptionPane.showMessageDialog(null, "A diferenca e equivalente a "+diferenca);



    }
}