package br.com.letscode.turmaitau.contaBancaria.conta;

import Exceptions.ValidarExcecao;
import br.com.letscode.turmaitau.contaBancaria.cliente.Cliente;
import br.com.letscode.turmaitau.contaBancaria.validacoes.ValidacaoContaBancariaException;
import operacoes.ContaMain;

import java.math.BigDecimal;

public class ContaCorrente extends ContaMain {

    public ContaCorrente(String numero) {
        super(numero);
    }

    public ContaCorrente(String numero, Cliente cliente) {
        super(numero, cliente);
    }

    @Override
    public void DepositarConta() throws ValidarExcecao {

    }

    @Override
    public void DepositarConta (BigDecimal valor) throws ValidacaoContaBancariaException {
        super.AdicionarSaldo(valor);
    }

}
