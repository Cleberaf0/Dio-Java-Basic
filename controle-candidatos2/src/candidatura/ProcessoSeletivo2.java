package candidatura;
import java.util.concurrent.ThreadLocalRandom;
public class ProcessoSeletivo2 {
	public static void main(String[] args) {

				}
	

	
	static void selecaoCandidatos() {
		
		String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
		int candidatosSelecionados = 0;
		int candidatosAtual = 0;
		double salarioBase = 2000.0;
		while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
			String candidato = candidatos[candidatosAtual];
			double salarioPretendido = valorPretendido();
			
			System.out.println("O Candidato " + candidato + " solicitou este valor de salario " + salarioPretendido);
			if(salarioBase >= salarioPretendido) {
				System.out.println("O Candidato " + candidato + "foi selecionado para vaga.");
				candidatosSelecionados++;
			}
			candidatosAtual++;
		}
	}
	static double valorPretendido() {
			return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}
		static void analisarCandidato(double salarioPretendido ) {
		double salarioBase = 2000.0;
		if (salarioBase > salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO");
		}else if (salarioBase==salarioPretendido)
			System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
		else {
			System.out.println("LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA");
		}
	}
	
}
