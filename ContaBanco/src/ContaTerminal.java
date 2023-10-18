/**
* <h1>ContaTerminal</h1>
* A ContaTerminal realiza a criação da conta do usuário
* <p>
* <b>Note:</b> Leia atentamente a documentação desta classes
* para desfrutar dos recursos oferecidos pelo autor
*
* @author  Cleber Augusto
* @version 1.0
* @since   17/10/2023
*/

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Por favor, Digite seu nome");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite o número da Agência");
        String agencia = scanner.next();
        
        System.out.println("Por favor, digite o número da Conta");
        int numero = scanner.nextInt();
        
        System.out.println("Quanto deseja depositar ?");
        double saldo = scanner.nextDouble();
        

                
        //imprimindo os dados informados pelo usuario
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + 
        ", conta " + numero +  ", e seu saldo de $" + saldo + " já está disponível para saque.");

                
    }
}
