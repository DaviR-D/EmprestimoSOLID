package engenhariadesoftware.esiii.Refatorado;

import java.util.Calendar;
import java.util.Date;

public class DefaultDevolucaoCalculator implements DevolucaoCalculator {
    @Override
    public Date calculate(Date dataInicio, int prazo) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dataInicio);
        calendar.add(Calendar.DATE, prazo);
        return calendar.getTime();
    }
}