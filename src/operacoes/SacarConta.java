package operacoes;

import br.com.letscode.turmaitau.contaBancaria.cliente.ClientePessoaJuridica;
import br.com.letscode.turmaitau.contaBancaria.validacoes.SaldoInvalidoException;
import br.com.letscode.turmaitau.contaBancaria.validacoes.ValidacaoContaBancariaException;
import java.math.BigDecimal;


public class SacarConta {

    public BigDecimal saldo;

    public void sacar(BigDecimal valor) throws ValidacaoContaBancariaException {
        this.validarValorNullOuNegativo(valor);

        Object cliente = null;
        if (cliente instanceof ClientePessoaJuridica) {
            valor = valor.multiply(BigDecimal.valueOf(0.005)).add(valor);
        }

        if (this.getSaldo().compareTo(valor) < 0) {
            throw new SaldoInvalidoException("Saldo nao disponivel");
        }

        this.saldo = saldo.subtract(valor);
    }

    private void validarValorNullOuNegativo(BigDecimal valor) {
    }

    private Comparable<BigDecimal> getSaldo() {
        return null;
    }
}
