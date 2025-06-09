package src;

public class Titulo {
    private int prazo;

    public Titulo(int codigo) {
        this(codigo, new DefaultPrazoStrategy());
    }

    public Titulo(int codigo, PrazoStrategy strategy) {
        this.prazo = strategy.computePrazo(codigo);
    }

    public int getPrazo() {
        return prazo;
    }

    public void setPrazo(int prazo) {
        this.prazo = prazo;
    }
}
