package br.com.letscode.turmaitau.contaBancaria.conta;

import br.com.letscode.turmaitau.contaBancaria.cliente.Cliente;
import br.com.letscode.turmaitau.contaBancaria.cliente.ClientePessoaJuridica;
import br.com.letscode.turmaitau.contaBancaria.validacoes.ValidacaoContaBancariaException;

import java.math.BigDecimal;

public class ContaInvestimento extends Conta {

    public ContaInvestimento(String numero, Cliente cliente) {
        super(numero, cliente);
    }

    @Override
    public void DepositarConta (BigDecimal valor) throws ValidacaoContaBancariaException {

        double porcRendimento = (getCliente() instanceof ClientePessoaJuridica) ? 0.035 : 0.015;

        BigDecimal valorDepositado =
                valor.multiply(BigDecimal.valueOf(porcRendimento)).add(valor);

        super.AdicionarSaldo(valorDepositado);

    }

}
