package br.com.erombi.solid.salarios.model;

import br.com.erombi.solid.salarios.business.DezOuVintePorCento;
import br.com.erombi.solid.salarios.business.QuinzeOuVinteCincoPorCento;
import br.com.erombi.solid.salarios.business.RegraSalario;

public enum Cargo {
    DESENVOLVEDOR(new QuinzeOuVinteCincoPorCento()),
    DBA(new DezOuVintePorCento()),
    TESTER(new DezOuVintePorCento());

    private RegraSalario regraSalario;

    Cargo(RegraSalario regraSalario) {
        this.regraSalario = regraSalario;
    }

    public RegraSalario getRegraSalario() {
        return regraSalario;
    }
}