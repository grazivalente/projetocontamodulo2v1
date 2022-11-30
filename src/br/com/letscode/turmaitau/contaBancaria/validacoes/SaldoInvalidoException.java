package br.com.letscode.turmaitau.contaBancaria.validacoes;

public class SaldoInvalidoException extends ValidacaoContaBancariaException {

    public SaldoInvalidoException(String msg) {
        super(msg);
    }

}
