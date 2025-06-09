package src;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o RA do Aluno: ");
		String aluno = entrada.nextLine();

		System.out.print("Digite o número de Livros a serem emprestados: ");
		int num = entrada.nextInt();
		int[] codigos = new int[num];

		for (int i = 0; i < num; i++) {
			System.out.print("Digite o código do livro " + (i + 1) + ": ");
			codigos[i] = entrada.nextInt();
		}

		Controle controle = new Controle(new ValidadorAluno(), new ValidadorDebito());
		controle.emprestar(aluno, codigos);
	}
}

