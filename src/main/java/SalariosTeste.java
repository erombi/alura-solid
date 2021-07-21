import br.com.erombi.solid.salarios.business.CalculadoraDeSalario;
import br.com.erombi.solid.salarios.model.Cargo;
import br.com.erombi.solid.salarios.model.Funcionario;

import java.time.LocalDate;

public class SalariosTeste {

    public static void main(String[] args) {

        CalculadoraDeSalario calculadora = new CalculadoraDeSalario();
        Funcionario desenvolvedor = new Funcionario(1, "Eduardo Rombi", Cargo.DESENVOLVEDOR, LocalDate.now(), 2500.0);
        Funcionario dba = new Funcionario(2, "Rafael", Cargo.DBA, LocalDate.now(), 2000.0);

        calculadora.calcula(desenvolvedor);
        calculadora.calcula(dba);
    }
}
