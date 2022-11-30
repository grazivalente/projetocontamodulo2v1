package operacoes;

import Exceptions.ValidarExcecao;
import br.com.letscode.turmaitau.contaBancaria.cliente.Cliente;
import br.com.letscode.turmaitau.contaBancaria.conta.Conta;
import br.com.letscode.turmaitau.contaBancaria.validacoes.ValidacaoContaBancariaException;
import br.com.letscode.turmaitau.contaBancaria.validacoes.ValorInvalidoException;

import java.math.BigDecimal;
import java.util.Objects;

public abstract class ContaMain {

    private String numero;
    private Cliente cliente;
    public BigDecimal saldo = BigDecimal.ZERO;

    public ContaMain() {

    }

    public ContaMain(String numero) {

    }

    public void Conta(String numero) {
        this.numero = numero;
    }

    public ContaMain(String numero, Cliente cliente) {
        this(numero);
        this.cliente = cliente;
}

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void validarValorNullOuNegativo(BigDecimal valor) {
    }

    protected void AdicionarSaldo(BigDecimal valor) {
    }

    public abstract void DepositarConta() throws  ValidarExcecao;

    public abstract void DepositarConta (BigDecimal valor) throws ValidacaoContaBancariaException, ValidarExcecao;



    public BigDecimal getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getNumero() {
        return numero;
    }

    private void validarValorNullOuNegativo(BigDecimal valor) throws ValorInvalidoException {
        if (Objects.isNull(valor) || valor.signum() < 0) {
            throw new ValorInvalidoException("Valor nao pode ser nagtivo ou nulo");
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Conta{");
        sb.append("numero='").append(numero).append('\'');
        sb.append(", cliente=").append(cliente);
        sb.append(", saldo=").append(saldo);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conta conta = (Conta) o;
        return Objects.equals(numero, conta.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero);
    }

}
