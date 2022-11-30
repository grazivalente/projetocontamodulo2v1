package br.com.letscode.turmaitau.contaBancaria;

import br.com.letscode.turmaitau.contaBancaria.cliente.Cliente;
import br.com.letscode.turmaitau.contaBancaria.cliente.ClientePessoaFisica;
import br.com.letscode.turmaitau.contaBancaria.cliente.ClientePessoaJuridica;
import br.com.letscode.turmaitau.contaBancaria.conta.Conta;
import br.com.letscode.turmaitau.contaBancaria.conta.ContaCorrente;
import br.com.letscode.turmaitau.contaBancaria.validacoes.EntradaContaInvalidaException;
import br.com.letscode.turmaitau.contaBancaria.validacoes.EntradaTipoPessoaException;
import br.com.letscode.turmaitau.contaBancaria.validacoes.ValidacaoContaBancariaException;
import jdk.internal.org.objectweb.asm.tree.InsnList;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;
import java.util.Scanner;

public class AplicacaoMain {

    public AplicacaoMain() {
        try (Scanner entrada = new Scanner(System.in)) {
        }
    }

    public static void main(String[] args) {

        new AplicacaoMain().iniciarMenu(null, null);

    }

    private void iniciarMenu(Cliente cliente, ContaCorrente conta) {

        System.out.println("= \uD83D\uDCB0 = \uD83D\uDCB8 =\uD83E\uDD11 = \uD83C\uDFE6 =");

        try {
            if (Objects.isNull(cliente)) {
                cliente = new recuperarDadosCliente();
            }
            if (Objects.isNull(conta)) {
                conta = criarConta(cliente);
            }
            operacaoConta(conta);
        } catch (EntradaTipoPessoaException e) {
            System.out.println(e.getMessage());
            iniciarMenu(cliente, conta);
        } catch (EntradaContaInvalidaException e) {
            System.out.println(e.getMessage());
            iniciarMenu(cliente, conta);
        } catch (ValidacaoContaBancariaException e) {
            System.out.println(e.getMessage());
            iniciarMenu(cliente, conta);
        }

    }

    private void operacaoConta(ContaCorrente conta) {
    }

    private ContaCorrente criarConta(Cliente cliente) {
    }


    private ClientePessoaFisica recuperarDadosPessoaFisica() {
        System.out.print("\nNome: ");
        InsnList.InsnListIterator entrada = null;
        String nome = entrada.next();

        System.out.print("\nCPF: ");
        String cpf = entrada.next();

        return new ClientePessoaFisica(nome, cpf);
    }

    private ClientePessoaJuridica recuperarDadosPessoaJuridica() {
        System.out.print("\nNome: ");
        InsnList.InsnListIterator entrada;
        String nome = entrada.next();

        System.out.print("\nCNPJ: ");
        String cnpj = entrada.next();

        return new ClientePessoaJuridica(nome, cnpj);
    }




