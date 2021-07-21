package br.com.erombi.solid.salarios.business;

import br.com.erombi.solid.salarios.model.Funcionario;

public class CalculadoraDeSalario {

    public void calcula(Funcionario funcionario) {
        System.out.println(funcionario.calculaSalario());
    }
}