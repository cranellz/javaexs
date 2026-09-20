import javax.swing.JOptionPane;

public class ex21{
    public static void variaveis(String[] args) {
    double n1,n2,n3,n4;
    
    n1= Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota do aluno"));
    n2= Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota do aluno"));
    n3= Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota do aluno"));
    n4= Double.parseDouble(JOptionPane.showInputDialog("Digite a quarta nota do aluno"));

    media(n1,n2,n3,n4);
    }

    public static void media(double n1, double n2, double n3, double n4) {
        double medianota;
        medianota= n1+n2+n3+n4/4;
        estrutadecisao(medianota);
    }
    public static void estrutadecisao(double medianota) {
        if (medianota>= 6){
            JOptionPane.showMessageDialog(null, "Voce esta aprovado!");
        }
        else if (medianota>= 3 && medianota<6){
          JOptionPane.showMessageDialog(null,"Voce esta de exame");
        }
        else{
            JOptionPane.showMessageDialog(null, "Voce esta reprovado");
        }
    }
}