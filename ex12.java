import javax.swing.JOptionPane;

public class ex12 {
    public static void main(String[] args) {
        
        int anonascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano que nasceu:"));

        int anoatual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual:"));
        
        int idade = anoatual - anonascimento;

        int anosfuturo = idade + 17;

        JOptionPane.showMessageDialog(null, "Voce tera " + anosfuturo + " anos de idade em 17 anos");
    }
}
