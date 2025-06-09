package src;

public class ValidadorDebito {
	public boolean alunoEmDebito(String ra) {
		int codigo = Integer.parseInt(ra);
		return codigo == 4;
	}
}
