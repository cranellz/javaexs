
import javax.swing.JOptionPane;
public class ex17{
    public static void main(String[]args){
        double tempopercuso, velomedia;

        tempopercuso= Double.parseDouble("Digite o tempo do percuso");

        velomedia= Double.parseDouble("Digite a velocidade media");

       double litrosgastos= tempopercuso*velomedia/12;

       JOptionPane.showMessageDialog(null, "Os litros gasto na viagem sera aproximadamente..." +litrosgasto);


    }
}