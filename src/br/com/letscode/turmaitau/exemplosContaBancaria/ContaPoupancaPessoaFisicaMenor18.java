package br.com.letscode.turmaitau.exemplosContaBancaria;

import br.com.letscode.turmaitau.contaBancaria.cliente.Cliente;
import br.com.letscode.turmaitau.contaBancaria.conta.Conta;

public abstract class ContaPoupancaPessoaFisicaMenor18 extends Conta {

    public ContaPoupancaPessoaFisicaMenor18(String numero) {
        super(numero);
    }

    public ContaPoupancaPessoaFisicaMenor18(String numero, Cliente cliente) {
        super(numero, cliente);
    }

    public abstract void maisUmMetodo();

}
