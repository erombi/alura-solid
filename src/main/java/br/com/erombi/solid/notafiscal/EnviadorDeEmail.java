package br.com.erombi.solid.notafiscal;

public class EnviadorDeEmail implements AcaoAposGerarNota {

    public void executa(NotaFiscal nf) {
        System.out.println("envia email da nf " + nf.getId());
    }
}
