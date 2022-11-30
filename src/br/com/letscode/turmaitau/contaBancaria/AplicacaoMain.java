package br.com.letscode.turmaitau.contaBancaria;

import br.com.letscode.turmaitau.contaBancaria.cliente.Cliente;
import br.com.letscode.turmaitau.contaBancaria.cliente.ClientePessoaFisica;
import br.com.letscode.turmaitau.contaBancaria.cliente.ClientePessoaJuridica;
import br.com.letscode.turmaitau.contaBancaria.conta.Conta;
import br.com.letscode.turmaitau.contaBancaria.conta.ContaCorrente;
import br.com.letscode.turmaitau.contaBancaria.validacoes.EntradaContaInvalidaException;
import br.com.letscode.turmaitau.contaBancaria.validacoes.EntradaTipoPessoaException;
import br.com.letscode.turmaitau.contaBancaria.validacoes.ValidacaoContaBancariaException;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;
import java.util.Scanner;

public class AplicacaoMain {

    Scanner entrada;

    public AplicacaoMain() {
        entrada = new Scanner(System.in);
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

    private ContaCorrente criarConta(Cliente cliente) {
    }


    private ClientePessoaFisica recuperarDadosPessoaFisica() {
        System.out.print("\nNome: ");
        String nome = entrada.next();

        System.out.print("\nCPF: ");
        String cpf = entrada.next();

        return new ClientePessoaFisica(nome, cpf);
    }

    private ClientePessoaJuridica recuperarDadosPessoaJuridica() {
        System.out.print("\nNome: ");
        String nome = entrada.next();

        System.out.print("\nCNPJ: ");
        String cnpj = entrada.next();

        return new ClientePessoaJuridica(nome, cnpj);
    }



    private void operacaoConta(ContaCorrente conta) throws ValidacaoContaBancariaException {

        System.out.print("\nOperaçao:" +
                "\n Sacar (S)" +
                "\n Depositar (D) " +
                "\n Transferir (T) " +
                "\n Saldo (SD) " +
                "\n Dados Conta (DC) " +
                "\n Sair (X)" +
                "\n");
        String operacao = entrada.next().trim();

        if (operacao.equalsIgnoreCase("S")) {
            System.out.print("\nValor saque: ");
            String valorEntrada = entrada.next();
            BigDecimal valor = new BigDecimal(valorEntrada);
            conta.SacarConta (valor);
            imprimirSaldo(conta);
        } else if (operacao.equalsIgnoreCase("D")) {
            System.out.print("\nValor deposito: ");
            String valorEntrada = entrada.next();
            BigDecimal valor = new BigDecimal(valorEntrada);
            conta.DepositarConta (valor);
            imprimirSaldo(conta);
        } else if (operacao.equalsIgnoreCase("T")) {
            System.out.print("\nValor transferencia: ");
            String valorEntrada = entrada.next();
            BigDecimal valor = new BigDecimal(valorEntrada);

            System.out.print("\nNumero C/C destino: ");
            String numeroContaDestino = entrada.next();

            conta.transferir(new ContaCorrente(numeroContaDestino), valor);
            imprimirSaldo(conta);
        } else if (operacao.equalsIgnoreCase("SD")) {
            imprimirSaldo(conta);
        } else if (operacao.equalsIgnoreCase("DC")) {
            System.out.println(conta.toString());
        } else if (operacao.equalsIgnoreCase("X")) {
            System.out.print("\n \uD83D\uDC4B \uD83D\uDC4B \uD83D\uDC4B Tchau!! " + conta.getCliente().getNome());
            imprimirSaldo(conta);
            System.exit(0);
        }

        operacaoConta(conta);

    }

    private void imprimirSaldo(Conta conta) {
        System.out.println("\n \uD83D\uDCB0 Saldo: R$ " + conta.getSaldo().setScale(4, RoundingMode.HALF_EVEN));
    }

}
