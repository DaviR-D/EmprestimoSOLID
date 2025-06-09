package src;

import java.util.Date;

public class Item {
    private Livro livro;
    private Date dataDevolucao;
    private DevolucaoCalculator calculator;

    public Item(Livro livro) {
        this(livro, new DefaultDevolucaoCalculator());
    }

    public Item(Livro livro, DevolucaoCalculator calculator) {
        this.livro = livro;
        this.calculator = calculator;
    }

    public Date calculaDataDevolucao(Date data) {
        dataDevolucao = calculator.calculate(data, livro.verPrazo());
        return dataDevolucao;
    }

    public Livro getLivro() {
        return livro;
    }
}

