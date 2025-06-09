package src;
import java.util.List;

public class Emprestimo {
    private EmprestimoService service;

    public Emprestimo() {
        this(new DefaultEmprestimoService());
    }

    public Emprestimo(EmprestimoService service) {
        this.service = service;
    }

    public boolean emprestar(List<Livro> livros) {
        return service.emprestar(livros);
    }
}
