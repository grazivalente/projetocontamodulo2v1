package br.com.letscode.turmaitau.contaBancaria;


import br.com.letscode.turmaitau.contaBancaria.cliente.Cliente;
import br.com.letscode.turmaitau.contaBancaria.cliente.ClientePessoaFisica;
import br.com.letscode.turmaitau.contaBancaria.cliente.ClientePessoaJuridica;
import br.com.letscode.turmaitau.contaBancaria.conta.ContaCorrente;
import br.com.letscode.turmaitau.contaBancaria.conta.ContaInvestimento;
import br.com.letscode.turmaitau.contaBancaria.conta.ContaPoupanca;
import br.com.letscode.turmaitau.contaBancaria.validacoes.EntradaContaInvalidaException;

public class TipoConta extends AplicacaoMain {

    private ContaCorrente criarConta(Cliente cliente) throws EntradaContaInvalidaException {

        String tipoConta = null;

        if (cliente instanceof ClientePessoaFisica) {
            ClientePessoaFisica cliente1 = (ClientePessoaFisica) cliente;
            System.out.print("\nTipo Conta CC, CP, CI: ");
        } if (cliente instanceof ClientePessoaJuridica) {
            ClientePessoaJuridica cliente1 = (ClientePessoaJuridica) cliente;
            System.out.print("\nTipo Conta CC, CI: ");
        }


        return null;
    }

}

    tipoConta = entrada.next().trim();

        if (tipoConta.equalsIgnoreCase("CC")) {
        Cliente cliente;
        return new ContaCorrente(String.valueOf(System.currentTimeMillis()), cliente);
    } else if (tipoConta.equalsIgnoreCase("CP")) {
        return new ContaPoupanca(String.valueOf(System.currentTimeMillis()), (ClientePessoaFisica) cliente);
    } else if (tipoConta.equalsIgnoreCase("CI")) {
        return new ContaInvestimento(String.valueOf(System.currentTimeMillis()), cliente);
    } else {
        throw new EntradaContaInvalidaException("Tipo conta invalida");
}
