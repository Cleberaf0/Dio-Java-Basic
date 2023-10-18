package Edu.Repetições;

// ExemploFor.java
public class ExemploForArray {
//Em Arrays o Indice inicia sempre em ZERO.
	public static void main(String[] args) {
	String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

	for (int x=0; x<alunos.length; x++) {
		System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
	}

}
}