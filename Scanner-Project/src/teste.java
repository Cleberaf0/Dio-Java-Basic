import java.util.InputMismatchException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class teste {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
 try {
        Scanner scanner = new Scanner(System.in);

        double valor = scanner.nextDouble();
        
       
        if (valor > 0) {
            
            System.out.println("Deposito realizado com sucesso!");
            System.out.println("Saldo atual: R$ " + df.format(valor));
        } else if (valor == 0) {
           
            System.out.println("Encerrando o programa...");
        } else {
             
             System.out.println("Valor invalido! Digite um valor maior que zero.");
        } 
      }
        catch (InputMismatchException e ){
            System.err.println("O valor precisa ser númerico");

        } 
     }   
}