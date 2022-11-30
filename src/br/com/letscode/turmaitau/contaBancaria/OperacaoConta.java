package br.com.letscode.turmaitau.contaBancaria;

import br.com.letscode.turmaitau.contaBancaria.conta.Conta;
import br.com.letscode.turmaitau.contaBancaria.conta.ContaCorrente;
import br.com.letscode.turmaitau.contaBancaria.validacoes.ValidacaoContaBancariaException;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class OperacaoConta extends AplicacaoMain {

}

    private void imprimirSaldo(Conta conta) {
        System.out.println("\n \uD83D\uDCB0 Saldo: R$ " + conta.getSaldo().setScale(4, RoundingMode.HALF_EVEN));
    }

}