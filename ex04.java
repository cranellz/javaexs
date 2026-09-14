import javax.swing.JOptionPane;

public class ex04 {
    public static void main(String[] args) {
        
        double temp = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura em graus Celsius:"));

        double faren = (temp * 9 / 5) + 32;
        
        JOptionPane.showMessageDialog(null, "A temperatura de " + temp + "°C em Fahrenheit é de: " + faren + "F");
    }
}
