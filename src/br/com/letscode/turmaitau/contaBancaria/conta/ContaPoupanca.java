package br.com.letscode.turmaitau.contaBancaria.conta;

import br.com.letscode.turmaitau.contaBancaria.cliente.ClientePessoaFisica;
import br.com.letscode.turmaitau.contaBancaria.validacoes.ValidacaoContaBancariaException;

import java.math.BigDecimal;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(String numero, ClientePessoaFisica cliente) {
        super(numero, cliente);
    }

    @Override
    public void DepositarConta (BigDecimal valor) throws ValidacaoContaBancariaException {

        BigDecimal valorDepositado =
                valor.multiply(BigDecimal.valueOf(0.01)).add(valor);

        super.AdicionarSaldo(valorDepositado);
    }

}
