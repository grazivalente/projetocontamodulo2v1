package br.com.letscode.turmaitau.contaBancaria;


import br.com.letscode.turmaitau.contaBancaria.cliente.Cliente;
import br.com.letscode.turmaitau.contaBancaria.cliente.ClientePessoaFisica;
import br.com.letscode.turmaitau.contaBancaria.cliente.ClientePessoaJuridica;
import br.com.letscode.turmaitau.contaBancaria.conta.ContaCorrente;
import br.com.letscode.turmaitau.contaBancaria.conta.ContaInvestimento;
import br.com.letscode.turmaitau.contaBancaria.conta.ContaPoupanca;
import br.com.letscode.turmaitau.contaBancaria.validacoes.EntradaContaInvalidaException;

public class TipoConta extends AplicacaoMain {

    private Object criarConta(Cliente cliente) throws EntradaContaInvalidaException {

        Cliente cliente2 = cliente;
        Cliente cliente1 = cliente2;

        (ClientePessoaFisica) cliente2
        if (cliente2 instanceof ClientePessoaFisica) {
            ((ClientePessoaFisica) cliente2)
            System.out.print("\nTipo Conta CC, CP, CI: ");
        } if (cliente2 instanceof ClientePessoaJuridica) {
            System.out.print("\nTipo Conta CC, CI: ");
        }

        String tipoConta = entrada.next().trim();

        if (tipoConta.equalsIgnoreCase("CC")) {
            return new ContaCorrente(String.valueOf(System.currentTimeMillis()), cliente2);
        } else if (tipoConta.equalsIgnoreCase("CP")) {
            return new ContaPoupanca(String.valueOf(System.currentTimeMillis()), ((ClientePessoaFisica) cliente2));
        } else if (tipoConta.equalsIgnoreCase("CI")) {
            return new ContaInvestimento(String.valueOf(System.currentTimeMillis()), cliente2);
        } else {
            throw new EntradaContaInvalidaException("Tipo conta invalida");
        }
    }
}
