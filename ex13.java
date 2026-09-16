import javax.swing.JOptionPane;

public class ex13{
    public static void main(String[]args){
        double alimento= Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade do alimento em quilos"));

        double gramas= alimento*1000;

        int diasDuracao = (int) (gramas/ 50);

        JOptionPane.showMessageDialog(null, "Dura o equivalente a "+ diasDuracao + "dias");

    }
}