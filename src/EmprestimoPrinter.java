
package src;

import java.util.Date;
import java.util.List;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class EmprestimoPrinter {
    private static final SimpleDateFormat fmt =
        new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    public void print(List<Item> itens, Date dataEmp, Date dataPrev) {
        System.out.println("Número de Livros Emprestados: " + itens.size());
        System.out.println("Data de Empréstimo: " + fmt.format(dataEmp));
        System.out.println("Data de Devolução: "  + fmt.format(dataPrev));
    }
}
