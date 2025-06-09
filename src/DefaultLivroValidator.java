package src;

public class DefaultLivroValidator implements LivroValidator {
    @Override
    public boolean isValid(Livro livro) {
        return livro.getCodigo() == 3;
    }
}
