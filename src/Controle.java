package src;

import java.util.ArrayList;
import java.util.List;

public class Controle {

	private ValidadorAluno validadorAluno;
	private ValidadorDebito validadorDebito;

	public Controle(ValidadorAluno va, ValidadorDebito vd) {
		this.validadorAluno = va;
		this.validadorDebito = vd;
	}

	public boolean emprestar(String ra, int[] codigos) {
		if (!validadorAluno.alunoExiste(ra)) {
			System.out.println("Aluno Inexistente");
			return false;
		}

		if (validadorDebito.alunoEmDebito(ra)) {
			System.out.println("Aluno em Débito");
			return false;
		}

		List<Livro> livros = new ArrayList<>();
		for (int codigo : codigos) {
			Livro livro = new Livro(codigo);
			if (!livro.verificaLivro()) {
				livros.add(livro);
			}
		}

		if (!livros.isEmpty()) {
			return new Emprestimo().emprestar(livros);
		} else {
			System.out.println("Nenhum livro válido para empréstimo.");
			return false;
		}
	}
}

