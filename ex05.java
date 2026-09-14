import javax.swing.JOptionPane;

public class ex05{


    public static void main(String[]args){
      
         double a= Double.parseDouble(JOptionPane.showInputDialog("qual o valor do coeficiente a"));


         double b= Double.parseDouble(JOptionPane.showInputDialog("qual o valor do coeficiente b"));
          
         double c= Double.parseDouble(JOptionPane.showInputDialog("qual o valor do coeficiente c"));

         double delta= Math.pow(b,2)-(4*a*c);

         JOptionPane.showMessageDialog(null, "o valor de delta é"+delta);

         double x1= (-b + Math.sqrt(delta)) / (2 * a);

         double x2=  (-b - Math.sqrt(delta)) / (2 * a);

         JOptionPane.showMessageDialog(null, "o valor de x1 é"+x1);
         JOptionPane.showMessageDialog(null,"o valor de x2 é"+x2 );
    }
}