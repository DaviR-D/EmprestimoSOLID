package src;

import engenhariadesoftware.esiii.Refatorado.PrazoStrategy;

public class DefaultPrazoStrategy implements PrazoStrategy {
    @Override
    public int computePrazo(int codigo) {
        return codigo + 1;  
    }
}
