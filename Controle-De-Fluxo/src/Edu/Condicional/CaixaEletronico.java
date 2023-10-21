package Edu.Condicional;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;
// CaixaEletronico.java
public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.FRANCE);

        System.out.println("Digite seu Saldo");
        double saldoAtual = scanner.nextDouble();

        System.out.println("Quanto será depositado?");
        double valorDeposito = scanner.nextDouble();
        
        System.out.println("Qual valor deseja sacar?");
        double valorRetirada = scanner.nextDouble();

        if(valorRetirada < (saldoAtual+valorDeposito)) {
            double saldo = (saldoAtual+valorDeposito) - valorRetirada;
            DecimalFormat formatador = new DecimalFormat("#.0");

            System.out.println("Novo Saldo: " + formatador.format(saldo));

        }else

        System.out.println("Saldo Insuficiente");
    
    }
}
/* double saldo = 25.0;
       double valorSolicitado = 22.0;

       if(valorSolicitado < saldo){
        saldo = saldo - valorSolicitado;

        System.out.println("Novo Saldo: " + saldo);

       }else

        System.out.println("Saldo Insuficiente");*/