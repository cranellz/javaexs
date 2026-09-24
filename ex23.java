import javax.swing.JOptionPane;

public class ex23{
    public static void variaveis(String[] args) {
        double n1,n2,n3,n4;
        n1= Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero"));
        n2= Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero"));
        n3= Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro numero"));
        n4= Double.parseDouble(JOptionPane.showInputDialog("Digite o quarto numero"));

        condicional(n1,n2,n3,n4);
    }
    public static void condicional(double n1, double n2, double n3, double n4) {
      if( n4<n1){
        JOptionPane.showMessageDialog(null, "a sequencia numerica é" +n4,n1,n2,n3);
      }
      if(n4<n2){
        JOptionPane.showMessageDialog(null, "a sequencia numerica é" +n1,n4,n2,n3);
      }
      if(n4<n3){
        JOptionPane.showMessageDialog(null, "a sequencia numerica é" +n1,n2,n4,n3);
      }
      else{
        JOptionPane.showMessageDialog(null, "a sequencia numerica é" +n1,n2,n3,n4);
      }
}
}