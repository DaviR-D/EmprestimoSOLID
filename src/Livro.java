package engenhariadesoftware.esiii.Refatorado;

public class Livro {
    private Titulo titulo;
    private int codigo;
    private LivroValidator validator;

    public Livro(int codigo) {
        this(codigo, new DefaultLivroValidator());
    }

    public Livro(int codigo, LivroValidator validator) {
        this.codigo = codigo;
        this.titulo = new Titulo(codigo);
        this.validator = validator;
    }

    // mantém assinatura para Controle.java
    public boolean verificaLivro() {
        return validator.isValid(this);
    }

    public int verPrazo() {
        return titulo.getPrazo();
    }

    // getter necessário ao validator
    public int getCodigo() {
        return codigo;
    }
}
