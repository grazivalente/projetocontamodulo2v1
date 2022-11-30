package br.com.letscode.turmaitau.contaBancaria;

import br.com.letscode.turmaitau.contaBancaria.conta.Conta;
import br.com.letscode.turmaitau.contaBancaria.conta.ContaCorrente;
import br.com.letscode.turmaitau.contaBancaria.validacoes.ValidacaoContaBancariaException;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class OperacaoConta extends AplicacaoMain {

    private void operacaoConta(Conta conta) throws ValidacaoContaBancariaException {

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
}

    private void imprimirSaldo(Conta conta) {
        System.out.println("\n \uD83D\uDCB0 Saldo: R$ " + conta.getSaldo().setScale(4, RoundingMode.HALF_EVEN));
    }

}