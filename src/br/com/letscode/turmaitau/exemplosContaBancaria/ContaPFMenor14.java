package br.com.letscode.turmaitau.exemplosContaBancaria;

import br.com.letscode.turmaitau.contaBancaria.cliente.Cliente;
import br.com.letscode.turmaitau.contaBancaria.validacoes.ValidacaoContaBancariaException;

import java.math.BigDecimal;

public abstract class ContaPFMenor14 extends ContaPoupancaPessoaFisicaMenor18 {

    public ContaPFMenor14(String numero) {
        super(numero);
    }

    public ContaPFMenor14(String numero, Cliente cliente) {
        super(numero, cliente);
    }

}
