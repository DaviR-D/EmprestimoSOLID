
package engenhariadesoftware.esiii.Refatorado;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class DefaultEmprestimoService implements EmprestimoService {
    private DevolucaoCalculator devolucaoCalculator;
    private EmprestimoPrinter printer;

    public DefaultEmprestimoService() {
        this.devolucaoCalculator = new DefaultDevolucaoCalculator();
        this.printer = new EmprestimoPrinter();
    }

    @Override
    public boolean emprestar(List<Livro> livros) {
        Date dataEmprestimo = new Date();
        List<Item> itens = new ArrayList<>();
        List<Date> datasDevolucao = new ArrayList<>();

        // 1) para cada livro, calcula a data de devolução
        for (Livro livro : livros) {
            Item item = new Item(livro, devolucaoCalculator);
            Date devolucao = item.calculaDataDevolucao(dataEmprestimo);
            itens.add(item);
            datasDevolucao.add(devolucao);
        }

        // 2) encontra a data máxima
        Date dataPrevista = Collections.max(datasDevolucao);

        // 3) aplica adicional de 2 dias por livro acima de 2
        int extra = livros.size() - 2;
        if (extra > 0) {
            Calendar cal = Calendar.getInstance();
            cal.setTime(dataPrevista);
            cal.add(Calendar.DATE, extra * 2);
            dataPrevista = cal.getTime();
        }

        // 4) imprime o resultado
        printer.print(itens, dataEmprestimo, dataPrevista);
        return true;
    }
}
