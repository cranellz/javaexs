import javax.swing.JOptionPane;

public class ex19{
    public static void main(String[] args) {
        double a, b, c;
        
        a= Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do coeficiente a"));

        b= Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do coeficiente b"));

        c= Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do coeficiente c"));
        
        double delta;

        delta= Math.pow(b, 2) - (4 * a * c);

        double x1,x2;

        if (delta>0){
            x1= (-b + Math.sqrt(delta)) / (2 * a);
            x2= (-b - Math.sqrt(delta)) / (2 * a);
            JOptionPane.showMessageDialog(null, "o valor da raiz de delta e"+x1,x2);
        }
        else{
            JOptionPane.showMessageDialog(null, "nao existe raiz real");
        }

    }
}