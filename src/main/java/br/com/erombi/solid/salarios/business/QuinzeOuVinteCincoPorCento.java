package br.com.erombi.solid.salarios.business;

import br.com.erombi.solid.salarios.model.Funcionario;

public class QuinzeOuVinteCincoPorCento implements RegraSalario{

    public Double calcula(Funcionario funcionario) {
        if(funcionario.getSalarioBase() > 2000.0) {
            return funcionario.getSalarioBase() * 0.75;
        }
        else {
            return funcionario.getSalarioBase() * 0.85;
        }
    }
}
