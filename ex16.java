import javax.swing.JOptionPane;
public class ex16{
public static void main(String[] args) {
    double horas, valorhora, porcentualdesconto, numerodependentes;

   horas= Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas"));

   valorhora= Double.parseDouble(JOptionPane.showInputDialog("Digite o valor por hora"));

   porcentualdesconto= Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual de desconto"));

   numerodependentes= Double.parseDouble(JOptionPane.showInputDialog("Digite o numero de dependentes"));

   double salario= horas* valorhora;

   double salarioliquido = salario - porcentualdesconto;

   salarioliquido= numerodependentes*100;

   JOptionPane.showMessageDialog(null, "O salario no final sera de " +salarioliquido);


}
}
